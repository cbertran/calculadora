package com.upc.jenkins.calculadora;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = args[0];
		String s2 = args[1];
		int i1 = Integer.parseInt(s1);
		int i2 = Integer.parseInt(s2);
		int r = Plus.execute(i1, i2);
		System.out.println("Resultado = "+r);
	}

}
