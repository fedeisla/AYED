package tp2.Ejer5;

import tp2.Arboles.BinaryTree;

public class ProfudidadDeArbolBinario {
	private BinaryTree<Integer> arbol;
	public ProfudidadDeArbolBinario(BinaryTree<Integer> unArbol ) 
	{
		this.arbol =unArbol;
	}
	
	public int sumaElementosProfundidad(int p) 
	{
		if(!this.arbol.isEmpty()) 
		{
			return sumaProdundidades(this.arbol,p,0);
		}
		return 0;
	}
	private int sumaProdundidades(BinaryTree<Integer> ab,int p, int profundidad) 
	{
		
		if(p == profundidad ) 
		{
			return ab.getData();
		}else 
		{
			int suma = 0;
			if(ab.hasLeftChild()) 
			{
				suma += sumaProdundidades(ab.getLeftChild(),p,profundidad+1); 	
			}
			if(ab.hasRightChild()) 
			{
				suma += sumaProdundidades(ab.getLeftChild(),p, profundidad+1); 		
			}
			return suma;
		}
		
		
	}
}
