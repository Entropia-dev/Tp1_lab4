package Ejercicio1;

public class Empleado {
	
	//Grupo 8:
	//INTEGRANTES: Jonathan Martin Povis , Cristian Damian Rivero , Federico Ivan Parrotta.
	//TP N°1
	
	
	
	//Atributo estatico
	private static int cont = 1000;
		
	//Atributos
	private final int id;
	private String nombre;
	private int edad;
		
	//Metodo estatico que devuelve 
	public static int devuelveProximoId() 
	{
		return cont; 
	}
	
	//Constructor que recibe los parametros "nombre" y la "edad".
	public Empleado(int edad, String nombre)
	{
	this.id = cont++;
	this.edad = edad;
	this.nombre = nombre;
	}
	

	
	//Completar constructor vacio, Considerar que dentro del constructor vacio se puede aprovechar el constructor Empleado.
	public Empleado()
	{
		this.id = cont++;
		edad = 99;
		nombre= "Sin nombre";
	}
	
	//@Override del metodo toString() para que devuelva un string formateado.
	public String toString() {
		return "Empleado " + getNombre() + ", Edad:" + getEdad() + ", ID: "+ id ;
	}

	//Setter setNombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
		}
	//Setter setEdad
	public void setEdad(int edad) {
		this.edad = edad;
		}
	 
	 
	//Getter getEdad
	public int getEdad() {
		return edad;
	}
	
	//Getter getNombre
	public String getNombre() {
		return nombre;
	}
	
	
}
