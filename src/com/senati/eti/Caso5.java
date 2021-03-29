package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;


public class Caso5 {

	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     DecimalFormat df = new DecimalFormat("#.00");
	     
	     float n1=0 , n2 =0;
	     
	     System.out.print("Ingrese el primer numero.....: ");
	     n1= sc.nextFloat();
	     
	     System.out.print("Ingresa segundo numero.......: ");
	     n2= sc.nextFloat();
	     
	     float promedio = (n1+n2)/2;
	     //Aplique el Cast
	     float primer_num = (float)( n1 * 1.2);
	     float segund_num = (float)(n2 * 0.7);
	     
	     System.out.println("\n---------Resultados-----------");
	     System.out.println("El promedio de los numeros es............ : " + df.format(promedio));
	     System.out.println("El primer numero aumentado en 20 % es.... : " + df.format(primer_num));
	     System.out.println("El segundo numero disminuido en 30 % es...: " + df.format(segund_num));
	    

	}

}
