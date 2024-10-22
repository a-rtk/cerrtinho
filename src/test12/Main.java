package test12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("qual % do IPI atual? ");
		double IPI = sc.nextDouble();
		System.out.println("Qual valor da peça 1? ");
		double v1 = sc.nextDouble();
		System.out.println("qual a quantidade de peças? ");
		int q1 = sc.nextInt();
		
		System.out.println("Qual valor da peça 2? ");
		double v2 = sc.nextDouble();
		System.out.println("qual a quantidade de peças? ");
		int q2 = sc.nextInt();
		
		double resultado = (v1*q1 + v2*q2)*(IPI/100 + 1);
		System.out.println("o valor total a ser pago é R$" + resultado);
		sc.close();
			
	}
}	
		
		