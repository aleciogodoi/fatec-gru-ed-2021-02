import java.util.Scanner;  // Importando a Classe Scanner

class EntradaDados {
  public static void main(String[] args) {
    Scanner meuScanner = new Scanner(System.in);  // Cria um objeto Scanner
    System.out.print("Entre com seu nome: ");
    String nome = meuScanner.nextLine();          // Lê os dados digitados
    
    System.out.print("\nEntre com sua idade: ");
    int idade = meuScanner.nextInt();          // Lê os dados digitados
    
    System.out.print("\nEntre com sua altura: ");
    double altura = meuScanner.nextDouble();
    
    System.out.println("Seu nome é: " + nome + ", idade: "+idade+" ano(s) e altura: "+altura+" metros");    // Imprime nome
  }
}



