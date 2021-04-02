package Ejercicio1;

public class Empleado {
	//Atributo estatico
	private static int cont = 1000;
		
	//Atributos
	private final int id;
	private String nombre;
	private int edad;
		
	//Metodo estatico que devuelve 
	public static int devuelveProximoId() 
	{
		return cont+1; 
	}
	
	//Constructor que recibe los parametros "nombre" y la "edad".
	
	//Completar constructor vacio, Considerar que dentro del constructor vacio se puede aprovechar el constructor Empleado.
	public Empleado()
	{
		this.id=cont++;
	}
	
	//@Override del metodo toString() para que devuelva un string formateado.
	public String toString() {
		return "Empleado " + getNombre() + ", Edad:" + getEdad() + ", ID: "+ id ;
	}

	//Setter setNombre
	
	//Setter setEdad
	
	//Getter getEdad
	public int getEdad() {
		return edad;
	}
	
	//Getter getNombre
	public String getNombre() {
		return nombre;
	}
	
	
}
