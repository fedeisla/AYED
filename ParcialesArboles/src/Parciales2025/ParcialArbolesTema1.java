package Parciales2025;
import java.util.*;

import Estructuras.GeneralTree;

public class ParcialArbolesTema1 {

	
	public static List<Integer> caminoParidadAlternante(GeneralTree<Integer> arbol)
	{
		List<Integer> resultado = new LinkedList<Integer>();
		Integer[] max = new Integer[1];
		if(arbol!= null && !arbol.isEmpty()) 
		{
			max[0] = Integer.MIN_VALUE; // consultar si esta bien, para poder pasar un parametro por referencia
			buscarCaminoMasLargo(arbol, resultado,new LinkedList<GeneralTree<Integer>>(),max); // arbol,resultado, camino act, long, maximo
		}
		
		return resultado;
	}

	private static void buscarCaminoMasLargo(GeneralTree<Integer> arbol, List<Integer> resultado,
			LinkedList<GeneralTree<Integer>> caminoAct, Integer[] max )  
	{
		caminoAct.add(arbol);
		if(arbol.isLeaf()) 
		{
			if(caminoAct.size() > max[0]) 
			{
				max[0] = caminoAct.size();
				resultado.clear();
				for (GeneralTree<Integer> nodo : caminoAct) {
				    resultado.add(nodo.getData());
				}
			}
		}
		else 
		{
			for(GeneralTree<Integer> hijo: arbol.getChildren()) 
			{
				if(isPar(arbol.getData()) != isPar(hijo.getData()) ) 
				{
					
					buscarCaminoMasLargo(hijo, resultado, caminoAct, max);
					
				}
				
			}			
		}
		caminoAct.remove(caminoAct.size()-1);
		
	}
	
	private static boolean isPar(Integer numero) 
	{
		return numero % 2 == 0;
	}
	
	

	
}
