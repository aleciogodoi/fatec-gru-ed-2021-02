public class Loops {
	
	public static void main(String[] args) {
		imprime();
		imprime2();
		imprime3();
	}
	
	public static void imprime3() {
		int i = 22;
		do {
			if(par(i))
				System.out.println(i+" � par (do...while)");
			else
				System.out.println(i+" � �mpar (do...while)");
			i++;
		} while (i < 21);
	}
	
	public static void imprime2() {
		int i = 22;
		while (i < 21) {
			if(par(i))
				System.out.println(i+" � par (while)");
			else
				System.out.println(i+" � �mpar (while)");
			i++;
		}
	}
	
	public static void imprime() {
		for (int i=0; i < 21; i++) {
			if(par(i))
				System.out.println(i+" � par (for)");
			else
				System.out.println(i+" � �mpar (for)");
		}	
	}
	
	public static boolean par(int n) { 
		return n % 2 == 0;
	}
}
