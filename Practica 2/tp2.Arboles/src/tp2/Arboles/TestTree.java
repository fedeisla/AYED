package tp2.Arboles;

public class TestTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree<Integer> arbol = new BinaryTree<Integer>(9);
		BinaryTree<Integer> hijoIzquierdo = new BinaryTree<Integer>(8);
		hijoIzquierdo.addLeftChild(new BinaryTree<Integer>(6));
		hijoIzquierdo.addRightChild(new BinaryTree<Integer>(5));
		BinaryTree<Integer> hijoDerecho = new BinaryTree<Integer>(10);
		hijoDerecho.addRightChild(new BinaryTree<Integer>(12));
		arbol.addLeftChild(hijoIzquierdo);
		arbol.addRightChild(hijoDerecho);
		System.out.println("Arbol normal: ");
		imprimirArbolPreorden(arbol);
		System.out.println("Arbol espejo: ");
		BinaryTree<Integer> espejo = arbol.espejo();
		imprimirArbolPreorden(espejo);
		System.out.println(arbol.contarHojas());
		
		System.out.println("entre niveles");
		arbol.entreNiveles(0,1);
	}
	
	
	public static void imprimirArbolPreorden(BinaryTree<Integer> arbol) 
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


