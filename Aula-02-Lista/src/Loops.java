public class Loops {
	
	public static void main(String[] args) {
		imprime();
	}
	
	public static void imprime() {
		for (int i=0; i < 21; i++) {
			if(par(i))
				System.out.println(i+" � par");
			else
				System.out.println(i+" � �mpar");
		}	
	}
	
	public static boolean par(int n) { 
		return n % 2 == 0;
	}
}
