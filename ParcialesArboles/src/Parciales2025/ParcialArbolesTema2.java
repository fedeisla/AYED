package Parciales2025;

import java.util.*;

import Estructuras.GeneralTree;

public class ParcialArbolesTema2 {
	
	 
	public static List<Integer> caminoSignoAlternante(GeneralTree<Integer> arbol) 
	{
		List<Integer> resultado = new LinkedList<Integer>();
		if(arbol!= null && !arbol.isEmpty()) 
		{
			Integer[] maxCosto = new Integer[]{Integer.MIN_VALUE};
			caminoSignoAlternante(arbol, resultado, new LinkedList<GeneralTree<Integer>>(), 0, maxCosto);
		}
		return resultado;
	}

	private static void caminoSignoAlternante(GeneralTree<Integer> arbol, List<Integer> resultado,
			LinkedList<GeneralTree<Integer>> caminoActual, Integer costo, Integer[] maxCosto)
	{
		
		caminoActual.add(arbol);
		if(arbol.isLeaf()) 
		{
			if(costo > maxCosto[0]) 
			{
				maxCosto[0] = costo;
				resultado.clear();
				for(GeneralTree<Integer> a : caminoActual) 
				{
					resultado.add(a.getData());
				}
			}
		}
		else 
		{
			for(GeneralTree<Integer> hijos: arbol.getChildren()) 
			{
				if(arbol.getData()>=  0 != hijos.getData() >= 0 ) 
				{
					caminoSignoAlternante(hijos, resultado, caminoActual, costo+arbol.getData(), maxCosto);
				}
				
			}
		}
		caminoActual.remove(caminoActual.size()-1);
		
	}
}
