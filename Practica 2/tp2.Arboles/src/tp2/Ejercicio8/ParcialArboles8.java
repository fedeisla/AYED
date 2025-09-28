package tp2.Ejercicio8;

import tp2.Arboles.BinaryTree;

public class ParcialArboles8 {
	
	public boolean esPrefijo(BinaryTree<Integer> arbol1, BinaryTree<Integer> arbol2) 
	{
		if(arbol1.isEmpty()|| arbol2.isEmpty()) return false;
		
		return esPrefijoHelper(arbol1,arbol2);
	}
	
	private boolean esPrefijoHelper(BinaryTree<Integer> arbol1, BinaryTree<Integer> arbol2) 
	{
		if(!arbol1.getData().equals(arbol2.getData())) return false;
		if(arbol1.hasLeftChild() && arbol2.hasLeftChild()) esPrefijo(arbol1.getLeftChild(),arbol2.getLeftChild());
		if(arbol1.hasRightChild() && arbol2.hasRightChild()) esPrefijo(arbol1.getRightChild(),arbol2.getRightChild());
		return true;
	}
	
	
	
	

}
