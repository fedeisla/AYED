package Parciales2024;



import java.util.LinkedList;
import java.util.List;

import Estructuras.GeneralTree;
import Estructuras.Queue;



public class ParcialesArboles {

	private GeneralTree<Integer> arbol;

	public ParcialesArboles(GeneralTree<Integer> arbol) {
		this.arbol = arbol;
	}
	
	public List<Integer> nivel(int num)
	{
		List<Integer> resultado = new LinkedList<Integer>();
		if(this.arbol != null && !this.arbol.isEmpty()) 
		{
			RecorrerPorNiveles(this.arbol, resultado, num);
		}
		
		return resultado;
	}

	private void RecorrerPorNiveles(GeneralTree<Integer> arbol, List<Integer> resultado, int num)
	{
		Queue<GeneralTree<Integer>> cola = new Queue<GeneralTree<Integer>>();
		cola.enqueue(arbol);
		cola.enqueue(null);
		while(!cola.isEmpty()) 
		{
			GeneralTree<Integer> aux = cola.dequeue();
			if(aux != null) 
			{
				for(GeneralTree<Integer> hijos: arbol.getChildren()) 
				{
					cola.enqueue(hijos);
				}
			}
			else
			{
				if(!cola.isEmpty()) 
				{
					resultado.add(aux.getData());
				}
			}
		}
		
		
	}
	
	
	
}
