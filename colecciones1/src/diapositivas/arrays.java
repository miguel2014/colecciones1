package diapositivas;

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
			System.out.println("\n");
		}
		System.out.println("La media es "+ suma/numeromedia);
	}
}
