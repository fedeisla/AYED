package Estructuras;


import java.util.*;


public class Queue<T> implements Sequence {

	protected LinkedList<T> data;
	public Queue() 
	{
		this.data = new LinkedList<T>();
	}
	
	public void enqueue (T dato) 
	{
		this.data.addLast(dato);
	}
	public T dequeue () 
	{
		 if (data.isEmpty()) throw new NoSuchElementException("La cola está vacía");
	        return data.removeFirst();
	}
	
	  public T head() {
	        if (data.isEmpty()) throw new NoSuchElementException("La cola está vacía");
	        return data.getFirst(); 
	    }
	@Override
	public int Size() {
		return data.size();
	}
	@Override
	public boolean isEmpty() {
		
		return data.isEmpty();
	}
	@Override
	public String toString() 
	{
		String str = "[";
		for(T d: data) 
		{
			str = str + d + ", ";
		}
		str = str.substring(0, str.length()-2)+"]";
		
		return str;
		
	}
	

}
