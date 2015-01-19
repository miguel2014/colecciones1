package diapositivas;

import java.util.ArrayList;

public class ListaInicial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> list=new ArrayList<String>();
		list.add("Madrid");
		list.add("Jaen");
		list.add("Sevilla");
		list.add("Cordoba");
		System.out.println("Tamaño de la lista: "+list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+"\t");
		}
		System.out.println("\nOtra forma "+list.toString());
		System.out.println("Esta vacio? "+list.isEmpty());
		System.out.println("¿Contiene Sevilla? "+list.contains("Sevilla"));
		System.out.println("Posicion de Sevilla "+list.indexOf("Sevilla"));
		list.remove(2);
		System.out.println("¿Contiene Sevilla? "+list.contains("Sevilla"));
		System.out.println("Tamaño de la lista: "+list.size());
		System.out.println(list.toString());
		list.add("Sevilla");
		System.out.println("¿Contiene Sevilla? "+list.contains("Sevilla"));
		System.out.println("Tamaño de la lista: "+list.size());
		System.out.println(list.toString());
		System.out.println("Posicion de Sevilla "+list.indexOf("Sevilla"));
		
		
	}
}
