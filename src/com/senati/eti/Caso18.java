package com.senati.eti;

import java.util.Scanner;

public class Caso18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese la base del triangulo.....: ");
		float base = sc.nextFloat();
		
		System.out.print("Ingrese la altura del triangulo...: ");
		float altura = sc.nextFloat();
		
		float area = (base * altura)/2 ;
		
		
		System.out.println("-------------Resultado-----------");
		System.out.println("El area del triangulo es .......: " + area);
		
		
		
		

	}

}
