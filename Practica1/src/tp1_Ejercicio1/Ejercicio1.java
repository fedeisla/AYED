package tp1_Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Usando for");
		imprimirNumerosFor(4, 10);
		System.out.println("Este es el while");
		imprimirNumerosWhile(4,10);
		System.out.println("Recursion");
		imprimirNumerosRecursion(4,10);
		
		System.out.println("EJer2- ingrese un numero entero");
		int n = s.nextInt();
		Integer[] arreglo = Ejercicio2.obtenerArreglo(n);
		
		for(int i = 0; i< n; i++) 
		{
			System.out.println(arreglo[i]);
		}
	}
	
	public static void imprimirNumerosFor (int a, int b) 
	{
		for(;a <= b; a++ ) 
		{
			System.out.println(a);
		}
		
	}
	public static void imprimirNumerosWhile (int a, int b) 
	{
		while(a <= b  ) 
		{
			System.out.println(a);
			a++;
		}
		
	}
	public static void imprimirNumerosRecursion (int a, int b) 
	{
		if(a<=b) 
		{
			System.out.println(a);
			imprimirNumerosRecursion(a+1, b);
		}
		
	}

}
