package Parciales2025;

import java.util.*;

import Estructuras.GeneralTree;

public class ParcialArbolesTema3 {
	public static List<List<Integer>> caminosAlternantes(GeneralTree<Integer> arbol) 
	{
		List<List<Integer>> resultado = new LinkedList<List<Integer>>();
		if(arbol != null && !arbol.isEmpty()) 
		{
			buscarTodosLosCaminos(arbol,resultado, new LinkedList<Integer>());
		}
		return resultado;
	}

	private static void buscarTodosLosCaminos(GeneralTree<Integer> arbol, List<List<Integer>> resultado,
			LinkedList<Integer> caminoAct) 
	{
		caminoAct.add(arbol.getData());
		if(arbol.isLeaf()) 
		{
			resultado.add(new LinkedList<Integer> (caminoAct));
		}
		else 
		{
			for(GeneralTree<Integer> hijos: arbol.getChildren()) 
			{
				if(isMultiplo(arbol.getData()) != isMultiplo(hijos.getData()) ) 
				{
					buscarTodosLosCaminos(hijos, resultado, caminoAct);
				}
			}
		}
		caminoAct.remove(caminoAct.size()-1);
	}
	
	private static boolean isMultiplo(Integer numero) 
	{
		return (numero%3) == 0;
	}
}
