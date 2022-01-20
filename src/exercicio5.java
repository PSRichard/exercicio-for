import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, fatorial;
		
		fatorial = 1;
		
				
		System.out.print("Digite um número inteiro: ");
		n = sc.nextInt();
		
		for(int i = n ; i >=1 ; i--) {
			if(i > 0) {
				fatorial = fatorial * i;	
			}
		}

		System.out.printf("Fatorial de %d: %d", n, fatorial);
		
		sc.close();
	}

}
