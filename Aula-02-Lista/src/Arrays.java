
public class Arrays {

	public static void main(String[] args) {
		int[] inteiros = new int[4];
		
		for (int indice=0; indice < inteiros.length; indice++) {
			inteiros[indice] = indice * 2;
			System.out.println(indice+"-"+inteiros[indice]);
		}
		
		String[] nomes = {"Pedro", "José", "Maria", "Ana" };
		for (int indice=0; indice < nomes.length; indice++) {
			System.out.println(indice+"-"+nomes[indice]);
		}
		
		String[][] jv =  {
				{".", ".", "."},
				{".", "X", "."},
				{".", ".", "."},	
		};
		
		for (int linha=0; linha < 3; linha++) {
			for (int coluna=0; coluna < 3; coluna++) {
				System.out.print(jv[linha] [coluna]+" ");
			}
			System.out.println();
		}
	}

}
