package tp2.Ejercicio4;

import tp2.Arboles.BinaryTree;

public class TestEjercio4 {

	public static void main(String[] args) {
		
		 BinaryTree<Integer> arbol = armarArbol();
		 RedBinariaLlena  red = new RedBinariaLlena(arbol);
		 Integer valor = red.retardoReenvio();
		 if(valor == 34) 
		 {
			 System.out.println("Paso el test :)");
		 }
		 else 
		 {
			 System.out.println("No paso el test :(");
		 }
		
		
	}
	
	  private static BinaryTree<Integer>  armarArbol() {
		BinaryTree<Integer> arbol = new BinaryTree<Integer>(10);

		// Subárbol izquierdo del nodo raíz
		BinaryTree<Integer> subArbolIz = new BinaryTree<Integer>(2);
		BinaryTree<Integer> subArbolIz2 = new BinaryTree<Integer>(5);
		BinaryTree<Integer> subArbolDer3 = new BinaryTree<Integer>(4);
		BinaryTree<Integer> subArbolIz2_izq = new BinaryTree<Integer>(7);
		BinaryTree<Integer> subArbolIz2_der = new BinaryTree<Integer>(8);
		BinaryTree<Integer> subArbolDer3_izq = new BinaryTree<Integer>(5);
		BinaryTree<Integer> subArbolDer3_der = new BinaryTree<Integer>(6);

		// Subárbol derecho del nodo raíz
		BinaryTree<Integer> subArbolDer = new BinaryTree<Integer>(3);
		BinaryTree<Integer> subArbolDer_izq = new BinaryTree<Integer>(9);
		BinaryTree<Integer> subArbolDer_der = new BinaryTree<Integer>(8);
		BinaryTree<Integer> subArbolDer_izq_izq = new BinaryTree<Integer>(12);
		BinaryTree<Integer> subArbolDer_izq_der = new BinaryTree<Integer>(8);
		BinaryTree<Integer> subArbolDer_der_izq = new BinaryTree<Integer>(2);
		BinaryTree<Integer> subArbolDer_der_der = new BinaryTree<Integer>(1);

		// Armado del árbol
		arbol.addLeftChild(subArbolIz);
		arbol.addRightChild(subArbolDer);

		subArbolIz.addLeftChild(subArbolIz2);
		subArbolIz.addRightChild(subArbolDer3);

		subArbolIz2.addLeftChild(subArbolIz2_izq);
		subArbolIz2.addRightChild(subArbolIz2_der);

		subArbolDer3.addLeftChild(subArbolDer3_izq);
		subArbolDer3.addRightChild(subArbolDer3_der);

		subArbolDer.addLeftChild(subArbolDer_izq);
		subArbolDer.addRightChild(subArbolDer_der);

		subArbolDer_izq.addLeftChild(subArbolDer_izq_izq);
		subArbolDer_izq.addRightChild(subArbolDer_izq_der);

		subArbolDer_der.addLeftChild(subArbolDer_der_izq);
		subArbolDer_der.addRightChild(subArbolDer_der_der);
		
		
		return arbol;

	}
	
	
	

}
