package Ejercicios;

public class Producto {
	//Atributos
	private int id;
	private String nombreProducto;
	private double precioProducto;
	//Constructor
	/**
	 * @param id int
	 * @param nombre String
	 * @param precio double
	 */
	public Producto(int id, String nombre, double precio) {
		this.id = id;
		this.nombreProducto = nombre;
		this.precioProducto = precio;
	}
	//Getters
	/**
	 * Devuelve el id
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * Devuelve el nombre
	 * @return the nombreProducto
	 */
	public String getNombreProducto() {
		return nombreProducto;
	}
	/**
	 * Devuelve el precio
	 * @return the precioProducto
	 */
	public double getPrecio() {
		return precioProducto;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombreProducto
				+ ", precio=" + precioProducto + "€ ]\n";
	}	
}
