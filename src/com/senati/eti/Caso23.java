package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingresa el nombre del producto.........:");
		String nombre = sc.nextLine();
		
		System.out.print("Ingrese precio....................: ");
		float precio = sc.nextFloat();
		
		System.out.print("Ingrese cantidad....................: ");
		float cantidad = sc.nextFloat();
		
		float importe = precio * cantidad ;
		float IGV   = importe * 0.18f;
		float descuento = importe * 0.03f;
		float total = importe - descuento + IGV;
		
		System.out.println("\n------------Resultados-----------");
		System.out.println("Producto.......... :  " +nombre.toUpperCase());
		System.out.println("El importe es......: "+ df.format(importe));
		System.out.println("El IGB es..........: "+ df.format(IGV));
		System.out.println("El descuento es....: "+ df.format(descuento));
		System.out.println("El total es........: "+ df.format(total));
		
		
		
		

	}

}
