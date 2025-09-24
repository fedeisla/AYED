package tp2.Ejercicio6;

import tp2.Arboles.BinaryTree;

public class Transformacion {
	private BinaryTree<Integer> arbol;
	public Transformacion(BinaryTree<Integer> unArbol ) 
	{
		this.arbol =unArbol;
	}
	
	
	public BinaryTree<Integer> suma()
	{
		sumaDeNodos(this.arbol);
		return this.arbol;
	}
		
	

	private int sumaDeNodos(BinaryTree<Integer> arbolNue) {
		int suma= 0;
		if(arbolNue.isLeaf()) 
		{
			suma = arbolNue.getData();
			arbolNue.setData(0);
			return suma;
		}
		if(arbolNue.hasLeftChild()) 
		{
			suma += sumaDeNodos(arbolNue.getLeftChild());
		}
		if(arbolNue.hasRightChild()) 
		{
			suma += sumaDeNodos(arbolNue.getRightChild());
		}
		int actual = arbolNue.getData();
		arbolNue.setData(suma);
		return actual + suma;
		
	}
	
	
}
