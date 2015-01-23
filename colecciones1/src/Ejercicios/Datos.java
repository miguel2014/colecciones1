package Ejercicios;
/**
 * @author Miguel
 * @version 1.0
 * 
 */
import java.util.Arrays;

public class Datos {
	//Atributos
	private double[] array;
	//Constructor
	/**
	 * 
	 * @param array array
	 */
	public Datos(double[] array) {
		this.array = array;
	}
	
	//Getter
	/**
	 * 
	 * @return array
	 */
	public double[] getArray() {
		return array;
	}
	//Setter
	/**
	 * 
	 * @param posicion posicion del array
	 * @param dato valor
	 */
	public void setPosicion(int posicion,double dato) {
		this.array[posicion] = dato;
	}
	//Metodo que nos devuelve la media
	/**
	 * Calcula la media
	 * @return double
	 */
	public double media(){
		double suma=0;
		for (int i = 0; i < array.length; i++) {
				suma+=array[i];
		}
		return suma/array.length;
	}
	//Metodo que calcula la desviacion tipica
	//http://www.vitutor.com/estadistica/descriptiva/a_16.html
	/**
	 * Calcula la desviacion tipica
	 * @return double
	 */
	public double desviacionTipica(){
		double media=media();
		double suma=0;
		for (int i = 0; i < array.length; i++) {
			suma+=Math.pow((array[i]-media),2);
		}
		suma=suma/array.length;
		return Math.sqrt(suma);
	}
	//Metodo que nos dice los numeros que estan por debajo de la media
	/**
	 *Calcula la cantidad de numeros por debajo de la media 
	 * @return int
	 */
	public int porDebajoMedia(){
		int contador=0;
		for (int i = 0; i < array.length; i++) {
			if (array[i]<media()) {
				contador++;
			}
		}
		return contador;
	}
	//Metodo que nos dice el numero mas pequeño
	/**
	 * Calcula el valor mas pequeño
	 * @return double
	 */
	public double masPequeño(){
		double valormenor=array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i]<valormenor) {
				valormenor=array[i];
			}
		}
		return valormenor;
	}
	//Metodo que nos dice el numero mas grande
	/**
	 * Calcula el valor mas alto
	 * @return double
	 */
	public double masGrande(){
		double valorgrande=array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i]>valorgrande) {
				valorgrande=array[i];
			}
		}
		return valorgrande;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Datos [array=" + Arrays.toString(array) + "]";
	}
	
}
