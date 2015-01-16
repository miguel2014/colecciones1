package diapositivas;

public class arrays {
	public static void main(String[] args) {
		
		//int[][] valores=new int[4][3];
		//
		int [][] valores= {
			{14,24,52},
			{4,86,51},
			{723,81,319},
			{4320,1121,120}	
		};
		for (int i = 0; i < valores.length; i++) {
			for (int c = 0; c < valores[0].length; c++) {
				System.out.print(valores[i][c]+"\t");
			}
			System.out.println("\n");
		}
	
		int suma=0;
		int numeromedia=0;
		for (int i = 0; i < valores.length; i++) {
			for (int c = 0; c < valores[0].length; c++) {
				suma+=valores[i][c];
				numeromedia++;
			}
		}
		System.out.println("La media es "+ suma/numeromedia);
	}
}
