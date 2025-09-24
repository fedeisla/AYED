package tp2.Ejercicio7;

import tp2.Arboles.BinaryTree;

public class TestEjercicio7 {

	public static void main(String[] args) {
		BinaryTree<Integer> raiz = new BinaryTree<>(2);

		// Subárbol izquierdo
		BinaryTree<Integer> nodo7 = new BinaryTree<>(7);
		BinaryTree<Integer> nodo23 = new BinaryTree<>(23);
		BinaryTree<Integer> nodo6 = new BinaryTree<>(6);
		BinaryTree<Integer> nodoMenos3 = new BinaryTree<>(-3);
		BinaryTree<Integer> nodo55 = new BinaryTree<>(55);
		BinaryTree<Integer> nodo11 = new BinaryTree<>(11);

		nodo23.addLeftChild(nodoMenos3);
		nodo6.addLeftChild(nodo55);
		nodo6.addRightChild(nodo11);
		nodo7.addLeftChild(nodo23);
		nodo7.addRightChild(nodo6);
		raiz.addLeftChild(nodo7);

		// Subárbol derecho
		BinaryTree<Integer> nodoMenos5 = new BinaryTree<>(-5);
		BinaryTree<Integer> nodo19 = new BinaryTree<>(19);
		BinaryTree<Integer> nodo4 = new BinaryTree<>(4);
		BinaryTree<Integer> nodo18 = new BinaryTree<>(18);

		nodo4.addLeftChild(nodo18);
		nodoMenos5.addLeftChild(nodo19);
		nodoMenos5.addRightChild(nodo4);
		raiz.addRightChild(nodoMenos5);
		
		
		ParcialArboles test = new ParcialArboles(raiz);
		if(test.isLeftTree(7) == true) System.out.println("Paso el test de 7");
		ParcialArboles test2 = new ParcialArboles(raiz);
		if(test2.isLeftTree(2) == false) System.out.println("Paso el test de 2");
		ParcialArboles test3 = new ParcialArboles(raiz);
		if(test3.isLeftTree(-5) == true) System.out.println("Paso el test de -5");
		ParcialArboles test4 = new ParcialArboles(raiz);
		if(test4.isLeftTree(19) == false) System.out.println("Paso el test de 19");
		ParcialArboles test5 = new ParcialArboles(raiz);
		if(test5.isLeftTree(-3) == false) System.out.println("Paso el test de -3");
	
		


	}

}
