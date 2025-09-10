package tp1.Ejercicio4;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1, b = 2; 
		Integer c = 3, d = 4; 
		swap1(a,b); 
		swap2(c,d); 
		System.out.println("a=" + a + " b=" + b) ; 
		System.out.println("c=" + c + " d=" + d) ; 
	}
	
	public static void swap1 (int x, int y) { 
		if (x < y)  // SI X ES MENOR CAMBIA LOS VALORES ENTRE X E Y
		{ 
			int tmp = x ; 
			x = y ; 
			y = tmp; 
		} 
		// COMO SON PASAJE POR VALOR POR TIPO PRIMITIVOS NO SE VAN A VER REFLEJADOS LOS CAMBIOS
	}
	
	public static void swap2 (Integer x, Integer y) { 
		if (x < y) // SI X ES MENOR CAMBIA LOS VALORES ENTRE X E Y
		{ 
			int tmp = x ; 
			x = y ; 
			y = tmp; 
		} 
		// COMO LOS INTEGER ES UNA CLASE WRAPER Y SE IMPLEMENTA CON OBJETOS, PERO NO SE VE REFLEJADOS POR QUE SON INMUTABLES LOS DATOS PRIMITIVOS
	}
}
