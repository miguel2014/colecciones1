package Ejercicios;

import java.util.Arrays;

public class testColecciones1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colecciones1 c=new Colecciones1();
		//Asignar el valor 5 al ultimo elemento
		System.out.println(c);
		//Si fuera 	private static final int TAMAÑO=12;
		//c.setPosicion(c.getArray().length-1, 5);
		//Si fuera 	public static final int TAMAÑO=12;
		c.setPosicion(Colecciones1.TAMAÑO-1, 5);
		System.out.println(c);
		int valor=3;
		for (int i = 0; i < c.getArray().length-1; i++) {
			c.setPosicion(i, valor);
			valor*=2;
		}
		System.out.println(c);
		int suma=0;
		for (int i = 0; i < c.getArray().length; i++) {
				suma+=c.getArray()[i];
		}
		System.out.println(suma);
		
		if (c.getArray().length>=5) {
			for (int i = c.getArray().length-5; i < c.getArray().length; i++) {
				c.setPosicion(i,c.getArray()[i]/3);
			}
		}
		System.out.println(c);
		
		Arrays.sort(c.getArray());
		System.out.println(c);
		System.out.println("Elemento mas pequeño " +c.getArray()[0]);
		
		int valorMenor=c.getArray()[0];
		for (int i = 0; i < c.getArray().length; i++) {
				if (c.getArray()[i]<valorMenor) {
					valorMenor=c.getArray()[i];
				}
		}
		System.out.println("Elemento mas pequeño " + valorMenor);
		
		for (int i = 0; i < c.getArray().length; i++) {
				System.out.printf("%5d",c.getArray()[i]);
				if ((i+1)%4==0) {
					System.out.println();
				}
		}
		
		
	}

}
