package Ejercicios;

import java.util.Arrays;


public class Colecciones1 {
	//Atributo que es un array de int
	public static final int TAMAÑO=12;
	private int[] array;
	//Constructor
	public Colecciones1() {
		this.array = new int[TAMAÑO];
	}
	
	public void setPosicion(int posicion,int valor) {
		this.array[posicion] = valor;
	}
	
	public int[] getArray() {
		return array;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Colecciones1 [array=" + Arrays.toString(array) + "]";
	}
	
	
}
