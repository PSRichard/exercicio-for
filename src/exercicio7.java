import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, quadrado, cubo;
		
		System.out.print("Digite um número inteiro: ");
		n = sc.nextInt();
		
		for(int i = 1 ; i <= n ; i++) {
			quadrado =  (int) Math.pow(i,2);
			cubo = (int) Math.pow(i, 3);
			
			System.out.printf("%d %d %d%n", i, quadrado, cubo);
		}
		
		sc.close();
	}

}
