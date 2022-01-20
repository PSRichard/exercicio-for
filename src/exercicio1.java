import java.util.Locale;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.print("Digite um número inteiro entre 1 e 1000:");
		x = sc.nextInt();
		
		System.out.println("Números ímpares: ");
		
		for(int i = 1; i <= x ; i = i+2) {
			System.out.println(i);
		}
		
		sc.close();
	}

}
