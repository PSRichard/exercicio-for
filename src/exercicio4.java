import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double x, y, total;
		
		System.out.print("Digite o número de contas: ");
		n = sc.nextInt();
		
		for(int i = 0 ; i < n ; i++) {
			System.out.print("Digite o primeiro número: ");
			x = sc.nextDouble();
			System.out.print("Digite o segundo número: ");
			y = sc.nextDouble();
			
			if(y != 0) {
				total = x / y;
				System.out.println();
				System.out.printf("A divisão de %.1f por %.1f, é igual a %.1f.%n", x, y, total);
				System.out.println();
			}
			else {
				System.out.println("Divisão impossivel");
			}
		}
		
		
		sc.close();
	}

}
