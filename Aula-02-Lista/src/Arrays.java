
public class Arrays {

	public static void main(String[] args) {
		int[] inteiros = new int[4];

		for (int indice = 0; indice < inteiros.length; indice++) {
			inteiros[indice] = indice * 2;
			System.out.println(indice + "-" + inteiros[indice]);
		}

		String[] nomes = { "Pedro", "José", "Maria", "Ana" };
		for (int indice = 0; indice < nomes.length; indice++) {
			System.out.println(indice + "-" + nomes[indice]);
		}

		String[][] jv = { { "X", "0", "0" }, 
						  { "X", "0", "X" }, 
						  { "0", "X", "0" }, };
		if (verificaGanhador(jv))
			System.out.println("Temos um ganhador");
		/*
		 * for (int linha=0; linha < 3; linha++) { for (int coluna=0; coluna < 3;
		 * coluna++) { System.out.print(jv[linha] [coluna]+" "); } System.out.println();
		 * }
		 */
	}

	public static boolean verificaGanhador(String[][] j) {
		boolean ganhou = false;
		String aux;
		// Ganhador diagonal principal
		aux = j[0][0] + j[1][1] + j[2][2];

		// Ganhador diagonal principal
		if (aux.equals("XXX") || aux.equals("000")) {
			ganhou = true;
		} else {
			// Ganhador diagonal secundária
			aux = "";
			aux = j[0][2] + j[1][1] + j[2][0];
			if (aux.equals("XXX") || aux.equals("000")) {
				ganhou = true;
			} else {
				// Ganhador por linhas
				for (int lin = 0; lin < 3; lin++) {
					aux = "";
					for (int col = 0; col < 3; col++) {
						aux = aux + j[lin][col];
					}
					System.out.println(aux);
					if (aux.equals("000") || aux.equals("XXX")) {
						ganhou = true;
						break;
					}
				}

				// Ganhador por colunas
				for (int col = 0; col < 3; col++) {
					aux = "";
					for (int lin = 0; lin < 3; lin++) {
						aux = aux + j[lin][col];
					}
					System.out.println(aux);
					if (aux.equals("000") || aux.equals("XXX")) {
						ganhou = true;
						break;
					}
				}
			}
		}
		return ganhou;
	}

}
