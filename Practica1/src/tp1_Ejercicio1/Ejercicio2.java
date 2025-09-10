package tp1_Ejercicio1;

public class Ejercicio2 {

	public static Integer[] obtenerArreglo(int n) 
	{
		Integer[] vector = new Integer[n];
		for(int i= 0; i< n; i++) 
		{
			vector[i]=(i+1)*n;	
		}
		return vector;
	}
	

}
