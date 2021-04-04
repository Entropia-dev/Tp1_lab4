package Ejercicio1;

public class Empleado {
	
	//Grupo 8:
	//INTEGRANTES: Jonathan Martin Povis , Cristian Damian Rivero , Federico Ivan Parrotta.
	//TP N�1
	
	//Atributo estatico
	private static int identity = 1000;
		
	//Atributos
	private final int id;
	private String nombre;
	private int edad;
		
	//Metodo estatico que devuelve 
	public static int devuelveProximoId() 
	{
		return identity; 
	}
	
	//Constructor que recibe los parametros "nombre" y la "edad".
	public Empleado(String nombre, int edad)
	{
		this.nombre = nombre;
		this.edad = edad;
		this.id = identity++;
	}
	
	//Constructor vacio.
	public Empleado()
	{
		this("Sin nombre", 99);
	}
	
	//@Override del metodo toString() para que devuelva un string formateado.
	@Override 
	public String toString() 
	{
		return "Empleado " + nombre + ", Edad:" + edad + ", ID: "+ id ;
	}

	//Setter setNombre
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	//Setter setEdad
	public void setEdad(int edad) 
	{
		this.edad = edad;
	}
	 
	//Getter getEdad
	public int getEdad() 
	{
		return edad;
	}
	
	//Getter getNombre
	public String getNombre() 
	{
		return nombre;
	}
}
