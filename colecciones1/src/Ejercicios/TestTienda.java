package Ejercicios;

import java.util.Scanner;

public class TestTienda {
	public static void main(String[] args) {
		Tienda tienda=new Tienda();
		int id=0;
		tienda.añadirProducto(new Producto(id,"Algo",15));
		tienda.añadirProducto(new Producto(id++,"Algo",15));
		tienda.añadirProducto(new Producto(id++,"Algo",11));
		tienda.añadirProducto(new Producto(id++,"Algo",25));
		System.out.println(tienda);
		System.out.println("Mas barato "+tienda.productomasBarato());
		System.out.println("Mas barato "+tienda.productomasCaro());
		Scanner in=new Scanner(System.in);
		while (true){
			System.out.println("Introduce nombre:");
			String nombreProducto=in.next();
			if (nombreProducto.equals("Salte"))
				break;
			in.close();
			System.out.println("Introduce precio:");
			Double PrecioProducto=in.nextDouble();
			
			tienda.añadirProducto(new Producto(id++,nombreProducto,PrecioProducto));
			
			
		}
		System.out.println(tienda);
	}
}
