package br.com.luiz.calculadora.application;

import java.util.Scanner;

import br.com.luiz.calculadora.entities.Calculadora;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Calculadora calc = new Calculadora();
		
		System.out.print("Entre com o valor de x: ");
		calc.setX(sc.nextInt());
		System.out.print("Entre com o valor de y: ");
		calc.setY(sc.nextInt());
		System.out.println();
		
		System.out.println("=== CALCULADORA ===");
		System.err.println();
		calc.calculaOperacao();
		
		
		sc.close();
		
	}
}
