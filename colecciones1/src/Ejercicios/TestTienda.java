package Ejercicios;

import java.util.Scanner;

public class TestTienda {
	public static void main(String[] args) {
		Tienda tienda=new Tienda();
		int id=0;
		tienda.añadirProducto(new Producto(id++,"Algo0",15));
		tienda.añadirProducto(new Producto(id++,"Algo1",21.25));
		tienda.añadirProducto(new Producto(id++,"Algo2",11));
		tienda.añadirProducto(new Producto(id++,"Algo3",25));
		Scanner in=new Scanner(System.in);
		while (true){
			System.out.println("Introduce nombre:");
			String nombreProducto=in.next();
			if (nombreProducto.equals("Salte"))
				break;
		
			System.out.println("Introduce precio:");
			Double PrecioProducto=in.nextDouble();
			
			tienda.añadirProducto(new Producto(id++,nombreProducto,PrecioProducto));
			
			
		}
		System.out.println(tienda);
		System.out.println("Mas barato "+tienda.productomasBarato());
		System.out.println("Mas barato "+tienda.productomasCaro());
		in.close();
		tienda.eliminarProducto(tienda.getListaTienda().get(2));
		System.out.println(tienda);
	}
}
