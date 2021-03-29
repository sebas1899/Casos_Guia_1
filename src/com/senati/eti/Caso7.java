package com.senati.eti;

import java.text.DecimalFormat;

public class Caso7 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.0");
		
	
		int p = (int) Math.pow(3,2);
		//Aplicamos Cast
		float resultado = ((17*2+p-6f)/5)-2*(4.7f-1.2f*2);
		
		
		System.out.println("--------Resultados------");
		System.out.println("\nLa respuesta es "+df.format(resultado));
		

	}

}
