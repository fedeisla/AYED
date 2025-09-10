package tp1.Ejercicio7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import tp1_Ejercicio3.Estudiante;

public class TestArrayList {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner s = new Scanner(System.in);
		List<Integer> lista = new ArrayList<>();
		LinkedList<Integer> numeros = new LinkedList<>();
		numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);
		System.out.println(Integer.toString(sumarLinkedList(numeros)));
       /* int num = s.nextInt();
        while (num != 0) {
            lista.add(num);
            num = s.nextInt();
        }*/
		
        imprimirLista(lista);
        //incisoD (numeros) ;
	}
	
	private static void imprimirLista(List<Integer> lista) 
	{
		/*for(Integer i: lista) 
		{
			System.out.println(i);
		}*/
		Iterator<Integer> it = lista.iterator();
		 while (it.hasNext()) {
			 System.out.println(it.next());
			 }
	}
	
	public static void incisoD (LinkedList<Integer> numeros) 
	{
		List<Estudiante> estudiantes = new ArrayList<>();
		

		estudiantes.add(new Estudiante("Federico", "Isla", "2A", "federico@gmail.com", "La Plata"));
		estudiantes.add(new Estudiante("Martin", "Manese", "2A", "martin@gmail.com", "La Plata"));
		estudiantes.add(new Estudiante("carlos", "prez", "2A", "carlos@gmail.com", "La Plata"));
		
		LinkedList<Integer> copiaSumaDeElementos = new LinkedList<>();
		copiaSumaDeElementos.addAll(numeros);
		
		estudiantes.get(0).setApellido("Gomez");
		
		imprimirLista(numeros);
		imprimirLista(copiaSumaDeElementos);
		
		
		
	}
	public static int sumarLinkedList(LinkedList<Integer> lista) 
	{
		int suma = 0;
		Iterator<Integer> it = lista.iterator();
		
		if(!it.hasNext()) 
		{
			 return 0;
		}
		else
		{
			suma += it.next();
			sumarLinkedList(lista);
		}
		return suma;
	 
	}

	
	
	

}
