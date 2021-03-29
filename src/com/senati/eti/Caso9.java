package com.senati.eti;

import java.util.Scanner;

public class Caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese lado 1......:");
		int l1 = sc.nextInt();
		
		System.out.print("Ingrese lado 2......:");
		int l2 = sc.nextInt();
		
		int area = l1 * l2 ;
		int perimetro = 2*(l1+l2);
		
		System.out.println("\n--------------RESULTADOS--------------");
		System.out.println("El area del rectangulo es..........:" + area);
		System.out.println("El perimetro del rectangulo es.....:" + perimetro);

	}

}
