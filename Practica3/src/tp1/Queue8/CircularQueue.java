package tp1.Queue8;

public class CircularQueue<T> extends Queue<T>{

	
	public T shift() 
	{
		 T data = dequeue();
	     enqueue(data);
	    return data;
	}
}
