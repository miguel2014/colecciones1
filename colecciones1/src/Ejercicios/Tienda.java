package Ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
	//Atributo es una lista de Producto
	List<Producto> listaTienda;
	//Constructor
	public Tienda() {
		this.listaTienda = new ArrayList<Producto>();
		//estamos inicializando la lista a una arraylist vacia
	}
	//Getter
	public List<Producto> getListaTienda() {
		return listaTienda;
	}
	//Añadimos productos a la tienda
	public void añadirProducto(Producto p){
		this.listaTienda.add(p);
	}
	public void eliminarProducto(Producto p){
		if (this.listaTienda.contains(p))
		this.listaTienda.remove(p);
	}
	public Producto productomasCaro(){
		double caro=listaTienda.get(0).getPrecio();
		Producto productomasCaro=listaTienda.get(0);
		for (Producto producto : listaTienda) {
			if (producto.getPrecio()>caro) {
				caro=producto.getPrecio();
				productomasCaro=producto;
			}
		}
		return productomasCaro;
	}
	public Producto productomasBarato(){
		double barato=listaTienda.get(0).getPrecio();
		Producto productomasBarato=listaTienda.get(0);
		for (Producto producto : listaTienda) {
			if (producto.getPrecio()<barato) {
				barato=producto.getPrecio();
				productomasBarato=producto;
			}
		}
		return productomasBarato;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Tienda [" + listaTienda + "]";
	}
	
	
}
