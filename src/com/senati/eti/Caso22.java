package com.senati.eti;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Caso22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese nombre del(a) alumno(a).........:");
		String nombre = sc.nextLine();
		
		System.out.print("Ingrese nota 1....................: ");
		float nota1 = sc.nextFloat();
		
		System.out.print("Ingrese nota 2....................: ");
		float nota2 = sc.nextFloat();
		
		System.out.print("Ingrese nota 3....................: ");
		float nota3 = sc.nextFloat();
		
		float not1 = nota1 * 0.2f;
		float not2 = nota2 * 0.3f;
		float not3 = nota3 * 0.5f;
		float promedio = (not1+not2+not3);
		
		System.out.println("\n------------Resultados-----------");
		System.out.println("Nombre : " +nombre.toUpperCase());
		System.out.println("La nota 1 es el 20 % : "+ df.format(not1));
		System.out.println("La nota 2 es el 30 % : "+ df.format(not2));
		System.out.println("La nota 3 es el 50 % : "+ df.format(not3));
		System.out.println("El promedio de todo esto es "+ df.format(promedio));
		
		
		
		
	}

}
