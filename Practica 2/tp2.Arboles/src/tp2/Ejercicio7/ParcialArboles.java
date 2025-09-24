package tp2.Ejercicio7;

import tp2.Arboles.BinaryTree;

public class ParcialArboles {
	private BinaryTree<Integer> arbol;
	public ParcialArboles(BinaryTree<Integer> unArbol) 
	{
		this.arbol = unArbol;
	}
	
	
	public boolean isLeftTree(int num) {
	    BinaryTree<Integer> nodo = buscar(this.arbol, num); 
	    if (nodo == null) return false;

	    int hijosHI = nodo.hasLeftChild() ? contarHijosUnicos(nodo.getLeftChild()) : -1;
	    int hijosHD = nodo.hasRightChild() ? contarHijosUnicos(nodo.getRightChild()) : -1;

	    return hijosHI > hijosHD;
	}

	private int contarHijosUnicos(BinaryTree<Integer> arbol2) {
		
		if (arbol2 == null || arbol2.isEmpty()) return 0;
		int hijos = 0;
		if ((arbol2.hasLeftChild() && !arbol2.hasRightChild()) || (!arbol2.hasLeftChild() && arbol2.hasRightChild())) {
	        hijos = 1;
	    }
		if(arbol2.hasLeftChild()) hijos += contarHijosUnicos(arbol2.getLeftChild());
		if(arbol2.hasRightChild()) hijos += contarHijosUnicos(arbol2.getRightChild());
		
		return hijos;
	}
	
	private BinaryTree<Integer> buscar(BinaryTree<Integer> arbol, int num) {
	
	    if (arbol.getData() == num) return arbol;

	    BinaryTree<Integer> izq = arbol.hasLeftChild() ? buscar(arbol.getLeftChild(), num) : null;
	    if (izq != null) return izq;

	    return arbol.hasRightChild() ? buscar(arbol.getRightChild(), num) : null;
	}

	
	
	
	
	
	
}
