import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n;
		double nota1, nota2, nota3, media;
		
		System.out.print("Número de casos: ");
		n = sc.nextInt();
		
		for(int i = 0 ; i < n ; i++) {
			System.out.println("Digite as notas:");
			nota1 = sc.nextDouble();
			nota2 = sc.nextDouble();
			nota3 = sc.nextDouble();
			
			media = (nota1 * 2.0  +  nota2 * 3.0  +  nota3 * 5.0)/10.0;
			
			System.out.printf("Média: %.1f%n", media);
			
		}
		
		
		sc.close();
	}

}
