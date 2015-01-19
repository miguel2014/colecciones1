package diapositivas;

import java.util.ArrayList;
import java.util.List;

public class RecorrerArrayList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creamos una lista Integer vacia
		ArrayList<Integer> lista=new ArrayList<Integer>();
		int[] arrayEnteros={1,2,3,4,5,6,7,8,9};
		//Recorro el array y lo añado a la lista
	
		for (int i = 0; i < arrayEnteros.length; i++) {
			lista.add(arrayEnteros[i]);
		}
		System.out.println(lista);
		Integer numero1=new Integer(10);
		lista.add(0,numero1);//Añade numero a la posicion 0
		System.out.println(lista);
		Integer numero2=new Integer(100);
		lista.set(0, numero2);
		System.out.println(lista);
		//Vamos a descubrir cuantos elementos son pares
		int contarPares=0;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i)%2 == 0){ 
				contarPares++;
				System.out.print(lista.get(i)+"\t");
			}
		}
		//Vanis a encontrar numeros impares y añadirlo a una nueva lista
		List <Integer> listaImpares=new ArrayList<Integer>();
		for (Integer integer : lista) {
			if (integer%2!=0) {
				listaImpares.add(integer);
			}
		}
		System.out.println("\nLista de impares "+listaImpares);
	}	
}
