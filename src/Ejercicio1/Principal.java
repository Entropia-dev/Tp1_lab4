package Ejercicio1;

public class Principal {

	//Grupo 8:
	//INTEGRANTES: Jonathan Martin Povis , Cristian Damian Rivero , Federico Ivan Parrotta.
	//TP N�1
	
	public static void main(String[] args) {
		//Declarar 5 instancias de la clase Empleado y mostrar su info utilizando el metodo toString()
		Empleado[] empleados = new Empleado[5];	
		
		//Declarar 3 con el  constructor con parámetros
		empleados[0] = new Empleado("Juan perez",22);
		System.out.println("Llamado de Empleado.devuelveProximoId() despues de instanciar el primer Empleado. Retorna " + Empleado.devuelveProximoId() + ".");
		empleados[1] = new Empleado("Carlos Ernesto",34);
		empleados[2] = new Empleado("Martin Calvo",19);
		
	    //Declarar 2 con el constructor vacio 
		empleados[3] = new Empleado();
		empleados[4] = new Empleado();

	    //Ciclo para mostrar la informacion de los empleados
		for (Empleado empleado : empleados) 
			System.out.println(empleado.toString());
			
		//Llamar y mostrar al metodo estatico devuelveProximoId()
		System.out.println("Llamado de Empleado.devuelveProximoId() al final del main(). Retorna " + Empleado.devuelveProximoId() + ".");
	}
}
