package com.senati.eti;

public class Caso6 {

	public static void main(String[] args) {
		// Aplicar CAST : Convertir un tipo de dato a otro
		int res1 = (int) Math.pow(5,3);
		
		float res2 = (float) Math.pow(81,1/2.0);
		
		float res3 = (float) Math.pow(125, 1/3.0);
		
		float res4 = (float) Math.pow(256, 1/4.0);
		
		float res5 = (float) Math.pow(25,1/2.0);
		
		System.out.println("-------Resultados---------");
		System.out.println("Resultado1.... : " + res1);
		System.out.println("Resultado2.....: " + res2);
		System.out.println("Resultado3.....: " + res3);
		System.out.println("Resultado4.....: " + (res4+res5));
		
	}

}
