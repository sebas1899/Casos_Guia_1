package com.senati.eti;
import java.util.Scanner;
public class Caso21 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese el valor del gasto............... :");
		float vn = sc.nextFloat();
		
		float disminuye = vn * 0.88f;
		
		System.out.println("\n------------------RESULTADOS---------------");
		System.out.println("El  gasto disminuido en 15 % es de " + disminuye);
		
		
		

	}

}
