package diapositivas;

import java.util.ArrayList;
import java.util.List;

public class ListaPersonas {
	//Atributo coleccion persona
	private List<Persona> ListaPersonas;
	//Es igual a: private ArrayList<Persona> ListaPersonas;
	//Constructor
	public ListaPersonas() {
		//tipico en colecciones de objetos
		//inicializar la coleccion a coleccion vacia
		this.ListaPersonas = new ArrayList<Persona>();
	}
	public void addPersona(Persona p){
		//añado un objeto Persona al atributo que es una coleccion
		ListaPersonas.add(p);
	}
	public void deletePersona(Persona p){
		if (ListaPersonas.contains(p)) {
			ListaPersonas.remove(p);
		}
	}
	public boolean existePersonas(Persona p){
		return ListaPersonas.contains(p);
	}
	public void modificanombrePersonas(Persona p,String nuevonombre){
		if (existePersonas(p)) {
			
			p.setNombre(nuevonombre);
		}
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return ListaPersonas.toString();
	}
	
	
	
}
