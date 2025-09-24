package tp2.Ejercicio4;

import tp2.Arboles.BinaryTree;
import tp1.Queue8.Queue;
public class RedBinariaLlena {
	
	private BinaryTree<Integer> arbol;
	public RedBinariaLlena (BinaryTree<Integer> unArbol) 
	{
		this.arbol=  unArbol;
	}
	
	
	public int retardoReenvio() 
	{
		return RecorridoPorNiveles();
	}
	private int RecorridoPorNiveles() 
	{	
		Integer sumaTotal =0;
		Integer maximo = 0;
		BinaryTree<Integer> aux = null;
		Queue<BinaryTree<Integer>> cola = new Queue<BinaryTree<Integer>> ();
		cola.enqueue(this.arbol);
		cola.enqueue(null);
		while(!cola.isEmpty()) 
		{
			aux = cola.dequeue();
			if(aux != null) 
			{
				maximo = calcularMaximo(maximo,aux.getData());
				if(aux.hasLeftChild()) cola.enqueue(aux.getLeftChild());
				if(aux.hasRightChild()) cola.enqueue(aux.getRightChild());
			}
			else if(!cola.isEmpty()) 
				{
					sumaTotal+= maximo;
					cola.enqueue(null);
					maximo = -999;
					
				}
			
		}
		sumaTotal+= maximo; // porque si no no suma el ultimo
		return sumaTotal;
	}


	private Integer calcularMaximo(Integer maximo,Integer aux) {
		
		if(aux >= maximo) maximo = aux;
		return maximo;
	}
	

}
