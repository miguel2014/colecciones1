package diapositivas;

public class TestPersonas {
	public static void main(String[] args) {
		ListaPersonas lista=new ListaPersonas();
		System.out.println("Sin datos");	
		System.out.println(lista);
		Persona p1=new Persona("Green",17);
		Persona p2=new Persona("Red",18);
		Persona p3=new Persona("Avarice",19);
		Persona p4=new Persona("No name",20);
		Persona p5=new Persona("Two heads",21);
		lista.addPersona(p1);
		lista.addPersona(p2);
		lista.addPersona(p3);
		lista.addPersona(p4);
		lista.addPersona(p5);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		System.out.println("Despues de meter datos");
		System.out.println(lista);
		System.out.println("Existe p2? "+lista.existePersonas(p2));
		lista.deletePersona(p1);
		System.out.println("Existe p1? "+lista.existePersonas(p1));
		lista.modificanombrePersonas(p5, "25 puntos");
		System.out.println("Nuevo nombre: "+ p5);
		Persona p6=new Persona("Algo", 11);
		System.out.println("Existe p6? "+ lista.existePersonas(p6));
		lista.addPersona(new Persona("New", 18));
		System.out.println(lista);
		
	}
}
