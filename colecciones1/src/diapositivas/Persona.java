package diapositivas;

public class Persona {
	//Atributos
	private String nombre;
	private int edad;
	/**
	 * @param nombre
	 * @param edad
	 */
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the apellido
	 */
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * @return the dni
	 */
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ",edad=" + edad + "]";
	}
 
	
}
