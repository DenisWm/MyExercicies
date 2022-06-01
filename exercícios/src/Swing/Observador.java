package Swing;

import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {

	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Observador");
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.setSize(600,200);
		janela.setLayout(new FlowLayout());
		janela.setLocationRelativeTo(null); //Centralizar na tela!
		
		JButton botao = new JButton("Clicar");
		janela.add(botao);
		
		botao.addActionListener(e -> { 
			System.out.println("Evento Ocorreu!!!");
		});
		
//		janela.addFocusListener(new FocusListener() {
		
		janela.setVisible(true);
		
	}
}
