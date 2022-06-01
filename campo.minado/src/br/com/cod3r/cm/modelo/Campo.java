package br.com.cod3r.cm.modelo;

import java.util.ArrayList;
import java.util.List;

import br.com.cod3r.cm.excecao.ExplosaoException;

public class Campo {

	private final int linha;
	private final int coluna;
	
	private boolean aberto = false;
	private boolean minado = false;
	private boolean marcado = false;
	
	private List<Campo> vizinhos = new ArrayList<>();
	
	Campo(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}
	
	boolean adicionarVizinho(Campo vizinho) {
		boolean linhaDifente = linha != vizinho.linha;
		boolean colunaDifente = coluna != vizinho.coluna;
		boolean diagonal = linhaDifente && colunaDifente;
		
		int deltaLinha = Math.abs(linha - vizinho.linha);
		int deltaColuna = Math.abs(coluna - vizinho.coluna);
		int deltaGeral = deltaColuna + deltaLinha;
		
		if(deltaGeral == 1 && !diagonal) {
			vizinhos.add(vizinho);
			return true;
		} else if (deltaGeral == 2 && diagonal) {
			vizinhos.add(vizinho);
			return true;
		} else {
			return false;
		}
	}
	
	void alternarMarcacao() {
		if(!aberto) {
			setMarcado(!marcado);
		}
	}
	
	boolean abrir() {
		if(!aberto && !marcado) {
			aberto = true;
			
			if(isMinado()) {
				throw new ExplosaoException();
			}
			
			if(vizinhancaSegura()) {
				vizinhos.forEach(v -> v.abrir());
			}
			return true;
		} else {
			return false;
		}
	}
	
	boolean vizinhancaSegura() {
		return vizinhos.stream().noneMatch(v -> v.isMinado());
	}
	
	void minar() {
		setMinado(true);
	}
	


	public Boolean isMarcado() {
		return marcado;
	}

	public boolean isAberto() {
		return aberto;
	}
	
	public boolean isFechado() {
		return !isAberto();
	}

	public boolean isMinado() {
		return minado;
	}
	
	void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	void setMinado(boolean minado) {
		this.minado = minado;
	}

	public void setMarcado(boolean marcado) {
		this.marcado = marcado;
	}
	
	public int getLinha() {
		return linha;
	}

	public int getColuna() {
		return coluna;
	}

	void reiniciar() {
		aberto = false;
		minado = false;
		marcado = false;
	}
	
	boolean objetivoAlcancado() {
		if(marcado && minado || aberto && !minado) {
			return true;
		} else {
			return false;
		}
	}
	
	long minasNaVizinhanca() {
		return vizinhos.stream().filter(c -> c.minado).count();
	}
	
	public String toString() {
		if(marcado) {
			return "x";
		} else if(aberto && minado) {
			return "*";
		} else if(aberto && minasNaVizinhanca() > 0) {
			return Long.toString(minasNaVizinhanca());
		} else if(aberto) {
			return " ";
		} else {
			return "?";
		}
	}
}
