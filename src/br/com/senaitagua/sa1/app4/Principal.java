package br.com.senaitagua.sa1.app4;

import javax.swing.JOptionPane;

import br.com.senaitagua.sa1.bo.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instanciando objetos
		CalculoBO cbo = new CalculoBO();
		
		// Retornando mensagem
		JOptionPane.showMessageDialog(null, cbo.reultado());

	}

}
