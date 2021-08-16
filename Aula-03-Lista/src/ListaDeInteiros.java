
public class ListaDeInteiros {
	// Atributos/propriedades
	int[] dados;
	int tamanho;
	int capacidade;

	// Método Construtor
	ListaDeInteiros(int c) {
		dados = new int[c];
		capacidade = c;
	}

	public boolean vazia() {
		return tamanho == 0;
	}

	public boolean cheia() {
		return tamanho == capacidade;
	}

	public void adicionaFinal(int item) {
		if (cheia()) {
			System.out.println("Item (" + item + ") não incluido! Lista Cheia!");
		} else {
			dados[tamanho] = item; // item no final da lista
			tamanho++; // somando 1 a tamanho
		}
	}

	public void imprimir() {
		System.out.print("\n[");
		for (int i = 0; i < tamanho; i++) {
			System.out.print(dados[i]);
			if (i < tamanho - 1)
				System.out.print(", ");
		}
		System.out.print("]");
	}

}