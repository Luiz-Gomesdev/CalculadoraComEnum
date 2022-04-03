package br.com.luiz.calculadora.entities;

import br.com.luiz.calculadora.enums.Operacoes;

public class Calculadora {
	
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void calculaOperacao() {
		 
		for (Operacoes op : Operacoes.values()) {
			
			System.out.print(x + " ");
			System.out.print(op.toString()+ " ");
			System.out.print(y + " = ");
			System.out.println(op.executarOperacao(x, y));
			
			
		}
	}

}
