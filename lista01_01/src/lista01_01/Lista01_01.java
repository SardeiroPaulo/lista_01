package lista01_01;

import java.util.Scanner;

public class Lista01_01 {

	public static void main(String[] args) {
		// exercicio maior de 3 números
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os 3 números inteiros para verificar qual o maior entre ele: ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
		if ( a > b && a > c) {
			System.out.println(a);
		}
		else if 
			(b > a && b > c )
			System.out.println(b);
		else 
			System.out.println(c);
		
		
		sc.close();
	}

}
