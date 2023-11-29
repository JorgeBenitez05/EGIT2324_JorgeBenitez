/**
 * Clase para representar una persona
 * @author alumnado
 * @version 1.0
 */
public class Persona {
	private String nombre;
	private String apellidos;
	private int edad ;

	
	
	/**
	 * Constructor
	 */
	public Persona (String Nombre, String Apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	
	
	/**
	 * Obtiene la edad despues de su cumpleaños
	 * @return Su edad + 1
	 */
	public int Cumpleanyos() {
		int cumpleanyos = (edad + 1);
		return cumpleanyos;
	}
	
	
	public void main(String[] args) {
		Persona persona = new Persona(nombre, apellidos, edad);
		System.out.println(persona.Cumpleanyos());
	}
}
