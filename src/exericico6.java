import java.util.Scanner;

public class exericico6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Digite um número: ");
		n = sc.nextInt();
		
		for (int i = 1 ; i >= 1 ; i++) {
			if(n % i == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
