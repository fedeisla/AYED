package Parciales2025;

import java.util.*;

import Estructuras.GeneralTree;

public class ParcialArbolesTema4 {
	public static List<Integer> primerCaminoAlternanteCeroNoCero(GeneralTree<Integer> 
	arbol) 
	{
		List<Integer> resultado = new LinkedList<Integer>();
		if(arbol != null && !arbol.isEmpty()) 
		{
			buscarCaminoHelper(arbol,resultado);
		}
		
		return resultado;
	}

	private static boolean buscarCaminoHelper(GeneralTree<Integer> arbol, List<Integer> resultado) {
		
		boolean condicion = false;
		
		if(arbol.isLeaf()) 
		{
			condicion = true;
		}
		else 
		{
			List<GeneralTree<Integer>> hijos = arbol.getChildren();
			Iterator<GeneralTree<Integer>> iterador = hijos.iterator();
			while(!condicion && iterador.hasNext()) 
			{
				GeneralTree<Integer> hijo =iterador.next();
				if(terminaEnCero(arbol.getData()) != terminaEnCero(hijo.getData())) 
				{
					
					condicion = buscarCaminoHelper(hijo, resultado);
				}
			}
			
		}
		if(condicion) 
		{
			resultado.add(0, arbol.getData());
		}
		return condicion;
		
	}
	private static boolean terminaEnCero(Integer numero) 
	{
		return (numero%10) == 0;
	}
}
