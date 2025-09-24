package tp2.Ejercicio3;

import java.util.*;

import tp2.Arboles.BinaryTree;

public class ContadorArbol {
	private BinaryTree<Integer> arbol;
	public ContadorArbol (BinaryTree<Integer> unArbol) 
	{
		this.arbol=  unArbol;
	}
	
	public List<Integer> numerosPares() 
	{
		List<Integer> listaPares = new ArrayList<Integer>();
		if(!this.arbol.isEmpty()) 
		{
			numParesPre(listaPares);
		}
		return listaPares;
	}
	public List<Integer> numerosParesInorden() 
	{
		List<Integer> listaPares = new ArrayList<Integer>();
		if(!this.arbol.isEmpty()) 
		{
			numParesInOrden(listaPares);
		}
		return listaPares;
	}
	public List<Integer> numerosParesPostorden() 
	{
		List<Integer> listaPares = new ArrayList<Integer>();
		if(!this.arbol.isEmpty()) 
		{
			numParesPostOrden(listaPares);
		}
		return listaPares;
	}
	private void numParesPre(List<Integer> listaPares) {
		if(this.arbol.getData() % 2 == 0) 
		{
			listaPares.add(this.arbol.getData());
		}
		if(this.arbol.hasLeftChild())
		{
			numParesPre(listaPares);
		}
		if(this.arbol.hasRightChild())
		{
			numParesPre(listaPares);
		}
		
		
	}
	private void numParesInOrden (List<Integer> listaPares) 
	{
		if(this.arbol.hasLeftChild())
		{
			numParesPre(listaPares);
		}
		if(this.arbol.getData() % 2 == 0) 
		{
			listaPares.add(this.arbol.getData());
		}
		
		if(this.arbol.hasRightChild())
		{
			numParesPre(listaPares);
		}
	}
	private void numParesPostOrden (List<Integer> listaPares) 
	{
		if(this.arbol.hasLeftChild())
		{
			numParesPre(listaPares);
		}
		if(this.arbol.hasRightChild())
		{
			numParesPre(listaPares);
		}
		if(this.arbol.getData() % 2 == 0) 
		{
			listaPares.add(this.arbol.getData());
		}
		
		
	}
	
	
}
