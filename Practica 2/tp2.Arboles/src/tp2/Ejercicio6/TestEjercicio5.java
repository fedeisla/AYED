package tp2.Ejercicio6;

import tp2.Arboles.BinaryTree;

public class TestEjercicio5 {

	public static void main(String[] args) {
		  System.out.println("Test Transformacion");
	        BinaryTree<Integer> ab = new BinaryTree<Integer>(4);
	        ab.addLeftChild(new BinaryTree<Integer>(2));
	        ab.addRightChild(new BinaryTree<Integer>(6));
	        ab.getLeftChild().addLeftChild(new BinaryTree<Integer>(1));
	        ab.getLeftChild().addRightChild(new BinaryTree<Integer>(3));
	        ab.getRightChild().addLeftChild(new BinaryTree<Integer>(5));
	        ab.getRightChild().addRightChild(new BinaryTree<Integer>(8));
	        
	        imprimirArbolPreorden(ab);
	        Transformacion tras = new Transformacion(ab);
	        tras.suma();
	        System.out.println();
	        System.out.println("Arbol transformado");
	        imprimirArbolPreorden(ab);

	}
	public static  void imprimirArbolPreorden(BinaryTree<Integer> arbol) 
	{
		System.out.println(arbol.getData());
		if(arbol.hasLeftChild()) 
		{
			 imprimirArbolPreorden(arbol.getLeftChild());
		}
		if(arbol.hasRightChild()) 
		{
			 imprimirArbolPreorden(arbol.getRightChild());
		}
	}	

}
