package tp2.Ejercicio9;

import tp2.Arboles.BinaryTree;

public class ParcialArboles9 {
	
	public BinaryTree<Dato> sumAndDif (BinaryTree<Integer> arbol)
	{
		BinaryTree<Dato> arbol2 =new BinaryTree<Dato>();
		if(!arbol.isEmpty())      
		{
			sumAndDifHelper(arbol,arbol2,0, 0);
		}	
		return arbol2;
	}
	
	private void  sumAndDifHelper(BinaryTree<Integer> arbol,BinaryTree<Dato> arbol2, int sum, int dif ) 
	{
		int datoAct = arbol.getData();
		Dato dat = new Dato(datoAct +sum, datoAct -dif);
		arbol2.setData(dat);
		if(arbol.hasLeftChild()) 
		{
			arbol2.addLeftChild(new BinaryTree<Dato>());
			sumAndDifHelper(arbol.getLeftChild(), arbol2.getLeftChild(), sum+datoAct, datoAct);
		}
		if(arbol.hasRightChild()) 
		{
			arbol2.addRightChild(new BinaryTree<Dato>());
			sumAndDifHelper(arbol.getRightChild(), arbol2.getRightChild(), sum+datoAct, datoAct);
		}
		
		
		
	}
}
