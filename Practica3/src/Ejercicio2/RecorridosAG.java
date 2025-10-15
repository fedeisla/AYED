package Ejercicio2;

import java.util.LinkedList;
import java.util.List;

import ejercicio1.GeneralTree;
import tp1.Queue8.Queue;

public class RecorridosAG {
	public List<Integer> numerosImparesMayoresQuePreOrden (GeneralTree <Integer> a,Integer n) 
	{
		List<Integer> listaImpares = new LinkedList<Integer>();
		 if(a!= null && !a.isEmpty())buscarNumerosImparesHelperPre(a,n,listaImpares);
		
		return listaImpares;
		
	}
			 
	public List<Integer> numerosImparesMayoresQueInOrden (GeneralTree <Integer> a, Integer n)
	{
		List<Integer> listaImpares = new LinkedList<Integer>();
		 if(a!= null && !a.isEmpty())buscarNumerosImparesHelperIn(a,n,listaImpares);
		
		return listaImpares;
		
	}

	public List<Integer> numerosImparesMayoresQuePostOrden (GeneralTree <Integer> a,Integer n)
	{
		List<Integer> listaImpares = new LinkedList<Integer>();
		 if(a!= null && !a.isEmpty())buscarNumerosImparesHelperPost(a,n,listaImpares);
		
		return listaImpares;
		
	}
	
	

	public List<Integer> numerosImparesMayoresQuePorNiveles(GeneralTree <Integer> a,Integer n)
	{
		List<Integer> listaImpares = new LinkedList<Integer>();
		 if(a!= null && !a.isEmpty())buscarNumerosImparesHelperNiveles(a,n,listaImpares);
		
		return listaImpares;
		
	}
	

	private void buscarNumerosImparesHelperPre(GeneralTree<Integer> arbol,Integer n,List<Integer> listaImpares) 
	{
		if(arbol.isLeaf()) 
		{
			if((arbol.getData() % 2 != 0) && (arbol.getData() % 2)> n) listaImpares.add(arbol.getData());
		}
		for (GeneralTree<Integer> a: arbol.getChildren()) 
		{
			buscarNumerosImparesHelperPre(a, n, listaImpares);
		}
		
	}
	private void buscarNumerosImparesHelperIn(GeneralTree<Integer> arbol, Integer n, List<Integer> listaImpares) {
		List<GeneralTree<Integer>> children = arbol.getChildren(); 
        int mitad = children.size() / 2;
        for (int i = 0; i < mitad; i++) {
        	buscarNumerosImparesHelperIn(children.get(i), n, listaImpares);
        }


        if ((arbol.getData() % 2 != 0) && (arbol.getData() > n)) {
        	listaImpares.add(arbol.getData());
        }

        for (int i = mitad; i < children.size(); i++) {
        	buscarNumerosImparesHelperIn(children.get(i), n, listaImpares);
        }
		
	}
	
	private void buscarNumerosImparesHelperPost(GeneralTree<Integer> arbol, Integer n, List<Integer> listaImpares) {
		
		for (GeneralTree<Integer> a: arbol.getChildren()) 
		{
			buscarNumerosImparesHelperPre(a, n, listaImpares);
		}
		if(arbol.isLeaf()) 
		{
			if((arbol.getData() % 2 != 0) && (arbol.getData() % 2)> n) listaImpares.add(arbol.getData());
		}
		
	}
	
	private void buscarNumerosImparesHelperNiveles(GeneralTree<Integer> arbol, Integer n, List<Integer> listaImpares) {
        GeneralTree<Integer> aux;
        Queue<GeneralTree<Integer>> queue = new Queue<GeneralTree<Integer>>();
        queue.enqueue(arbol);
        while(!queue.isEmpty()) {
            aux = queue.dequeue();
            if(!aux.isEmpty()) {
                if( arbol.getData() %2 != 0 && arbol.getData() > n) listaImpares.add(arbol.getData());
            }
            List<GeneralTree<Integer>> children = aux.getChildren();
            for(GeneralTree<Integer> child: children) {
                queue.enqueue(child);
            }
        }
      
		
	}
	
	
	
}
