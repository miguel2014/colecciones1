package Ejercicios;

import java.util.ArrayList;
import java.util.List;

public class TestDatos {

	public static void main(String[] args) {
		//Creamos un Arraylist y le añadimos datos
		List<Double> lista=new ArrayList<Double>();
		lista.add(new Double(12));
		lista.add(new Double(15));
		lista.add(new Double(19));
		lista.add(new Double(21));
		lista.add(new Double(0));
		lista.add(new Double(2));
		lista.add(new Double(21));
		lista.add(new Double(15));
		//Creamos la coleccion array con el tamaño de lista
		double[] array=new double[lista.size()];
		//Pasamos los datos del arraylist a array y luego se lo pasamos al constructor
		for (int i = 0; i < array.length; i++) {
			array[i]=lista.get(i);
		}
		Datos d=new Datos(array);
		/*double valor=0;
		for (int i = 0; i < d.getArray().length; i++) {
			d.setPosicion(i, valor);
			valor++;
		}*/
		d.setPosicion(5, 16);
		System.out.println(d);
		System.out.println("Obtener la media "+d.media());
		System.out.println("Desviacion tipica "+d.desviacionTipica());
		System.out.println("Numeros por debajo de la media "+d.porDebajoMedia());
		System.out.println("Valor minimo "+d.masPequeño());
		System.out.println("Valor maximo " +d.masGrande());
	}

}
