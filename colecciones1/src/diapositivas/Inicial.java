package diapositivas;

import java.util.Scanner;

public class Inicial {

	public static void main(String[] args) {
		//Constante
		final int TAMAÑO=5;
		double[] valores=new double[TAMAÑO];
		Scanner in=new Scanner(System.in);
		//Inicializar los valores del array
		for (int i = 0; i < valores.length; i++) {
		System.out.println("Introduce valores: ");	
		valores[i]=in.nextDouble();
		}
		in.close();
		//Cambiar valores
		valores[1]=2;
		valores[valores.length-1]=5;	
		//Mostrar valores array
		//Dos formas
		//Opcion 1: Mostra los valores del array
		System.out.println("\n Mostrando los valores del array.Opcion1:");
		for (int i = 0; i < valores.length; i++) {
			System.out.print(valores[i]+"\t");
		}
		//Opcion 2:Mostrar los valores del array
		System.out.println("\nMostrando los valores del array.Opcion2:");
		for (double d : valores) {
			System.out.print(d+"\t");		
		}
		double suma=0;
		for (int i = 0; i < valores.length; i++) {
			suma+=valores[i];
		}
		double media=suma/TAMAÑO;
		System.out.printf("%nEl valor medio es %.2f ",media);
		//Numero de elementos por debajo de la media
		int contador=0;
		for (int i = 0; i < valores.length; i++) {
		if (valores[i]< media) {
			contador++;
		}	
		}
		System.out.println("\nNumero de valores por debajo de la media "+contador);
	}

}
