package br.com.cod3r.cm.modelo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.cod3r.cm.excecao.ExplosaoException;

public class CampoTeste {

	private Campo campo;
	
	@BeforeEach
	void iniciarCampo() {
		campo = new Campo(3, 3);
	}
	
	@Test
	void testeAdicionarVizinhos() {
		// Vizinhos em cruz.
		Campo vizinhoEsquerda = new Campo(3, 2);
		boolean resultadoEsquerda = campo.adicionarVizinho(vizinhoEsquerda);
		Campo vizinhoDireita = new Campo(3, 4);
		boolean resultadoDireita = campo.adicionarVizinho(vizinhoDireita);
		Campo vizinhoEmCima = new Campo(2, 3);
		boolean resultadoEmCima = campo.adicionarVizinho(vizinhoEmCima);
		Campo vizinhoEmBaixo = new Campo(4, 3);
		boolean resultadoEmBaixo = campo.adicionarVizinho(vizinhoEmBaixo);
		
		// Vizinhos em diagonal.
		Campo vizinhoEsquerdaEmCima = new Campo(2, 2);
		boolean resultadoEsquerdaEmCima = campo.adicionarVizinho(vizinhoEsquerdaEmCima);
		Campo vizinhoEsquerdaEmBaixo = new Campo(4, 2);
		boolean resultadoEsquerdaEmBaixo = campo.adicionarVizinho(vizinhoEsquerdaEmBaixo);
		Campo vizinhoDireitaEmCima = new Campo(2, 4);
		boolean resultadoDireitaEmCima = campo.adicionarVizinho(vizinhoDireitaEmCima);
		Campo vizinhoDireitaEmBaixo = new Campo(4, 4);
		boolean resultadoDireitaEmBaixo = campo.adicionarVizinho(vizinhoDireitaEmBaixo);
		
		// Não vizinho no geral
		Campo naoVizinhoGeral = new Campo(1, 1);
		boolean resultadoNaoVizinhoGeral = campo.adicionarVizinho(naoVizinhoGeral);
		
		assertTrue(resultadoEsquerda && 
				resultadoDireita && 
				resultadoEmCima && 
				resultadoEmBaixo && 
				resultadoEsquerdaEmCima && 
				resultadoEsquerdaEmBaixo && 
				resultadoDireitaEmCima && 
				resultadoDireitaEmBaixo);
		
		assertFalse(resultadoNaoVizinhoGeral);
	}
	
	@Test
	void testeAlternarMarcacao() {
		// Testando se alternou.
		campo.alternarMarcacao(); // marcando
		assertTrue(campo.isMarcado());
		
		campo.reiniciar();
		
		// Testando alternar depois de 
		campo.abrir(); // abrindo
		campo.alternarMarcacao(); // tentando marcar
		assertFalse(campo.isMarcado());
	}
	
	@Test
	void testeAbrir() {
		// desmarcado e desminado.
		assertTrue(campo.abrir());
		
		campo.reiniciar();
		
		// marcado e desminado.
		campo.alternarMarcacao();
		assertFalse(campo.abrir());

		campo.reiniciar();
		
		//marcado e minado
		campo.minar();
		campo.alternarMarcacao();
		assertFalse(campo.abrir());
		
		campo.reiniciar();
		
		//desmarcado e minado
		campo.minar();
		assertThrows(ExplosaoException.class, () -> {
			 campo.abrir();
		});
		
		campo.reiniciar();;
		
		//abrir com vizinho
		Campo vizinho1 = new Campo(2, 2);
		Campo vizinhoDoVizinho1 = new Campo(2, 3);
		campo.adicionarVizinho(vizinho1);
		vizinho1.adicionarVizinho(vizinhoDoVizinho1);
		campo.abrir();
		assertTrue(vizinhoDoVizinho1.isAberto() && vizinho1.isAberto());
		
		campo.reiniciar();
		vizinho1.reiniciar();
		vizinhoDoVizinho1.reiniciar();
		
		//abrir com 1 vizinho minado
		Campo vizinho2DoVizinho1 = new Campo(1, 2);
		vizinho1.adicionarVizinho(vizinho2DoVizinho1);
		vizinhoDoVizinho1.minar();
		vizinho2DoVizinho1.minar();
		campo.abrir();
		assertTrue(campo.isAberto() && vizinho1.isAberto());
		assertFalse(vizinhoDoVizinho1.isAberto() && vizinho2DoVizinho1.isAberto());
	}
	
	@Test
	void objetivoAlcancado() {
		// Campo seguro
		campo.minar();
		campo.alternarMarcacao();
		assertTrue(campo.objetivoAlcancado());
		
		campo.reiniciar();
		
		// Campo desvendado
		campo.abrir();
		assertTrue(campo.objetivoAlcancado());
		
		campo.reiniciar();
		
		// Campo explodido
		campo.minar();
		campo.setAberto(true);
		assertFalse(campo.objetivoAlcancado());
		
	}
	
	@Test
	void minasNaVizinhanca() {
		// Criando vizinhos.
		Campo vizinho1 = new Campo(2, 2);
		Campo vizinho2 = new Campo(2, 3);
		
		// Adicionando vizinhos ao campo
		campo.adicionarVizinho(vizinho1);
		campo.adicionarVizinho(vizinho2);
		
		// Minando os vizinhos
		vizinho1.minar();
		vizinho2.minar();
		assertEquals(2, campo.minasNaVizinhanca());
	}
	
	@Test 
	void testarString() {
		// Campo fechado
		assertEquals ("?", campo.toString());
		
		// Campo marcado
		campo.setMarcado(true);
		assertEquals("x", campo.toString());
		
		campo.reiniciar();
		
		// Campo explodido
		campo.minar();
		campo.setAberto(true);
		assertEquals("*", campo.toString());
		
		campo.reiniciar();
		
		// Campo aberto
		campo.abrir();
		assertEquals(" ", campo.toString());
		
		campo.reiniciar();
		
		// Quantidade de bombas na vizinhaça
		// Criando vizinhos.
				Campo vizinho1 = new Campo(2, 2);
				Campo vizinho2 = new Campo(2, 3);
				
				// Adicionando vizinhos ao campo
				campo.adicionarVizinho(vizinho1);
				campo.adicionarVizinho(vizinho2);
				
				// Minando os vizinhos
				vizinho1.minar();
				vizinho2.minar();
				campo.abrir();
				assertEquals("2", campo.toString());
		
	}
}
