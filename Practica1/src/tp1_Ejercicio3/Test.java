package tp1_Ejercicio3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hola mundo");
		Estudiante[] estudiantes = { 
				new Estudiante("federico", "isla", "2A","federico@gmail.com","La Plata"),
				new Estudiante("martin", "manese", "2A","martin@gmail.com","La Plata")
				};
		Profesor[] profesores= {
				new Profesor("carlos","perez", "carlos@gmail.com","Ayed", "Informatica"),
				new Profesor("juana","perez", "juana@gmail.com","Ayed", "Informatica"),
				new Profesor("tito","perez", "tito@gmail.com","Ayed", "Informatica")
				};
		for(Estudiante i: estudiantes) 
		{
			i.tusDatos();
		}
		for(Profesor i: profesores) 
		{
			i.tusDatos();
		}
		
	}

}
