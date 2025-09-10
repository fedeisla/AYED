package tp1.Ejercicio5;



public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vector1 =  {1,2,3,4,5,6,7,8,9,10};
		int minimo = 999;
		int maximo =-1;
		int promedio =0;
		System.out.println(calcularVector(vector1));
		System.out.println(calcularVector(minimo,maximo,promedio));
		calcularVector();
		
	}
	public static String calcularVector(int[] vector) 
	{
		int minimo = 999;
		int maximo =-1;
		int promedio =0;
		for(int i: vector) 
		{
			if(i < minimo) 
			{
				minimo =i;
			}
			if(i> maximo) 
			{
				maximo = i;
			}
			
			promedio += i; 
		}

		return "El maximo es: " + maximo + "El minimo es: " +minimo + "El promedio es: "  + promedio/vector.length;
	}
	public static String calcularVector(int minimo,int maximo,int promedio) 
	{
		int[] vector =  {1,2,3,4,5,6,7,8,9,10};
		for(int i: vector) 
		{
			if(i < minimo) 
			{
				minimo =i;
			}
			if(i> maximo) 
			{
				maximo = i;
			}
			
			promedio += i; 
		}

		return "El maximo es: " + maximo + "El minimo es: " +minimo + "El promedio es: "  + promedio/vector.length;
	}
	public static void calcularVector() 
	{
		int[] vector =  {1,2,3,4,5,6,7,8,9,10};
		int minimo = 999;
		int maximo =-1;
		int promedio =0;
		for(int i: vector) 
		{
			if(i < minimo) 
			{
				minimo =i;
			}
			if(i> maximo) 
			{
				maximo = i;
			}
			
			promedio += i; 
		}

		System.out.println("El maximo es: " + maximo + "El minimo es: " +minimo + "El promedio es: "  + promedio/vector.length);
	}

}
