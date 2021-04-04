package Ejercicio1;

public class Principal {

	//Grupo 8:
	//INTEGRANTES: Jonathan Martin Povis , Cristian Damian Rivero , Federico Ivan Parrotta.
	//TP N°1
	
	public static void main(String[] args) {

;		
	
		
		//Declarar 5 instancias de la clase Empleado y mostrar su info utilizando el metodo toString()
			
		//Declarar 3 con el  constructor con parámetros
		
			Empleado[] empleadosIdentificados = new Empleado[3];
			empleadosIdentificados[0] = new Empleado(22,"Juan perez");
			empleadosIdentificados[1] = new Empleado(34,"Carlos Ernesto");
			empleadosIdentificados[2] = new Empleado(19,"Martin Calvo");
			
			System.out.println(empleadosIdentificados[0].toString());
			System.out.println(empleadosIdentificados[1].toString());
			System.out.println(empleadosIdentificados[2].toString());

			
		//Declarar 2 con el constructor vacio 
		
			Empleado[] empleadosNoIdentificados = new Empleado[2];
			empleadosNoIdentificados[0] = new Empleado();
			empleadosNoIdentificados[1] = new Empleado();
			
			System.out.println(empleadosNoIdentificados[0].toString());
			System.out.println(empleadosNoIdentificados[1].toString());
			
		//Llamar y mostrar al metodo estatico devuelveProximoId()
		System.out.println(Empleado.devuelveProximoId());
	}


}
