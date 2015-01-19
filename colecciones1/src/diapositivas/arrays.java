package diapositivas;

import javax.print.attribute.standard.NumberOfInterveningJobs;

public class arrays {
	public static void main(String[] args) {
		
		//int[][] valores=new int[4][3];
		//Declaramos un array bidimensional de 4*3
		int [][] valores= {
			{14,24,52},
			{4,86,51},
			{723,81,319},
			{4320,1121,120}	
		};
		//Creamos 2 variables para hacer la media
		int suma=0;
		int numeromedia=0;
		//Mostramos todos los valores
		//Valores.length=4
		//Valores[0].length=3 == valores[i].length ya que i=0
		//Despues de mostrar le sumamos los valores en suma y en numeromedia para mostrar el 
		//total de valores 4*3=12
		for (int i = 0; i < valores.length; i++) {
			for (int c = 0; c < valores[i].length; c++) {
				System.out.print(valores[i][c]+"\t");
				suma+=valores[i][c];
				numeromedia++;
			}
			System.out.println();
		}
		
		System.out.println("\nLa media es "+ suma/numeromedia+"\n");
		//Definimos un nuevo array con los valores invertidos
		/*
		 * i=3
		 * valores.length=4 en memoria se almacena 0,1,2,3
		 * valores.length-1= 4-1 =3
		 * Metemos contadorcolumnas dentro de for porque si no cuando termine con la primera fila
		 * no se vaciara para ello lo metemos en el bucle
		 * 
		 * Como funciona:
		 * contadorfilas=0;
		 * contadorcolumnas=0;
		 * i=3
		 * c=2
		 * valores[i][c]=120
		 * En la primera posicion de nuevosvalores nos pone 120
		 * nuevosValores[contadorfilas][contadorcolumnas]=valores[i][c]
		 * nuevosValores[0][0]=valores[3][2]
		 * 
		 * Nuevo valor:
		 * 
		 * contadorfilas=0;
		 * contadorcolumnas=1;
		 * i=3
		 * c=1
		 * valores[i][c]=120
		 * En la segunda posicion de nuevosvalores nos pone 1121
		 * nuevosValores[contadorfilas][contadorcolumnas]=valores[i][c]
		 * nuevosValores[0][1]=valores[3][1]
		 * 
		 * Nuevo valor:
		 * 
		 * contadorfilas=0;
		 * contadorcolumnas=2;
		 * i=3
		 * c=0
		 * valores[i][c]=4320
		 * En la tercera posicion de nuevosvalores nos pone 4320
		 * nuevosValores[contadorfilas][contadorcolumnas]=valores[i][c]
		 * nuevosValores[0][2]=valores[3][0]
		 * 
		 * Nuevo valor:
		 * 
		 * contadorfilas=1;
		 * contadorcolumnas=0;
		 * i=2
		 * c=2
		 * valores[i][c]=120
		 * En la primera posicion de la nueva fila nuevosvalores nos pone 319
		 * nuevosValores[contadorfilas][contadorcolumnas]=valores[i][c]
		 * nuevosValores[1][0]=valores[2][2]
		 * .......
		 * 
		 * */
		int contadorfilas=0;
		int [][] nuevosValores=new int[4][3];
		
		for (int i = valores.length-1; i >=0; i--) {
			int contadorcolumnas=0;
			for (int c = valores[i].length-1; c>=0; c--) {

				nuevosValores[contadorfilas][contadorcolumnas]=valores[i][c];
				contadorcolumnas++;
				
			}
			contadorfilas++;
		}
		//Lo imprimimos
		for (int i = 0; i < nuevosValores.length; i++) {
			for (int c = 0; c < nuevosValores[i].length; c++) {
				System.out.print(nuevosValores[i][c]+"\t");
				suma+=nuevosValores[i][c];
			}
			System.out.println();
		}
		
	}
}
