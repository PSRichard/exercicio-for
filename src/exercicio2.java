import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, x, in, out;
		
		in = 0;
		out = 0;
		
		System.out.print("Quantidade de n�meros que ser�o digitados:");
		n = sc.nextInt();
		
		System.out.println("Digite os n�meros:");
		
		for(int i = 0; i < n; i++) {
			x = sc.nextInt();
			if(x >= 10 && x <= 20) {
				in++;
			}
			else {
				out++;
			}
		}
		
		System.out.println("Quantidade de n�meros dentro do intervalo [10,20]:");
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
	}

}
