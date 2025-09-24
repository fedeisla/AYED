package tp2.Arboles;

import tp1.Queue8.Queue;

public class BinaryTree <T> {
	
	private T data;
	private BinaryTree<T> leftChild;   
	private BinaryTree<T> rightChild; 

	
	public BinaryTree() {
		super();
	}

	public BinaryTree(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	/**
	 * Preguntar antes de invocar si hasLeftChild()
	 * @return
	 */
	public BinaryTree<T> getLeftChild() {
		return leftChild;
	}
	/**
	 * Preguntar antes de invocar si hasRightChild()
	 * @return
	 */
	public BinaryTree<T> getRightChild() {
		return this.rightChild;
	}

	public void addLeftChild(BinaryTree<T> child) {
		this.leftChild = child;
	}

	public void addRightChild(BinaryTree<T> child) {
		this.rightChild = child;
	}

	public void removeLeftChild() {
		this.leftChild = null;
	}

	public void removeRightChild() {
		this.rightChild = null;
	}

	public boolean isEmpty(){
		return (this.isLeaf() && this.getData() == null);
	}

	public boolean isLeaf() { //si es una hoja
		return (!this.hasLeftChild() && !this.hasRightChild());

	}
		
	public boolean hasLeftChild() {
		return this.leftChild!=null;
	}

	public boolean hasRightChild() {
		return this.rightChild!=null;
	}
	@Override
	public String toString() {
		return this.getData().toString();
	}

	public  int contarHojas() {
		int hojasLeft = 0;
		int hojasRight= 0;
		
		if(this.isEmpty()) { 
			return 0;
		}
		else 
		{
			if(this.isLeaf()) {
				return 1;
			}
			else {
				if(this.hasLeftChild()) {
					hojasLeft = this.getLeftChild().contarHojas();
				}
				if(this.hasRightChild()) {
					hojasRight= this.getRightChild().contarHojas();
				}
				
			}
		}
		return hojasLeft + hojasRight;
		
	}
	
		
    	 
    public BinaryTree<T> espejo(){
    	 BinaryTree<T> arbEspejo = new BinaryTree<T>(this.getData());
         if(this.hasLeftChild()) {
             arbEspejo.addRightChild(this.getLeftChild().espejo());
         }
         if(this.hasRightChild()) {
             arbEspejo.addLeftChild(this.getRightChild().espejo());
         }
         return arbEspejo;
    	
    }

	// 0<=n<=m
	public void entreNiveles(int n, int m)
	{
		if (this.isEmpty() || n < 0 || m < n) { return; }
		BinaryTree<T> aux =null;
		Queue<BinaryTree<T>> cola = new Queue<BinaryTree<T>>();
		System.out.print("entro");
		cola.enqueue(this);
		cola.enqueue(null);
		int cont = 0;
		while(!cola.isEmpty()) 
		{
			aux = cola.dequeue();
			if(aux != null) 
			{
				if(cont>=n && cont <=m) 
				{
					System.out.print(aux.getData());
				}
				if(aux.hasLeftChild())
				{
					cola.enqueue(aux.getLeftChild());
				}
				if(aux.hasRightChild())
				{
					cola.enqueue(aux.getRightChild());
				}
			}else if (!cola.isEmpty()) 
			{
				cola.enqueue(null);
				cont = cont+1;
			}
			
			
		}
		
	}
	
		
}

