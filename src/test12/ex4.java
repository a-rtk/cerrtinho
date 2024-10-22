package test12;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Uma livraria deseja efetuar uma pesquisa sobre os livros vendidos no mês. Para cada
		// livro vendido o funcionário deve preencher um questionário, informando o tipo
		// ( 1 -
		// Ficção / 2 – Romance / 3 – Aventura ), o sexo do comprador (M-masculino / F -
		// feminino).
		// Sabendo que o fim dos dados é indicado pelo tipo do livro igual a 0 (zero),
		// elabore um
		// programa que informe:
		// • Tipo de livro mais vendido no mês.
		// • Percentual de homens que leem livros de romance.

		Scanner sc = new Scanner(System.in);
		int tipo, gay = 0, homem = 0, cont = 0;
		char sexo;

		do {
			System.out.println("Informe o tipo de livro:");
			System.out.println("'0' para encerrar");
			System.out.println("'1' Ficcao");
			System.out.println("'2' Romance");
			System.out.println("'3' Aventura");
			tipo = sc.nextInt();
			
			switch (tipo) {
			case 1:
				cont = cont++;
		    break;
		    
			case 2:
				int cont1 = 0;
				cont1 = cont1++;
			break;
			
			case 3:
				int cont2 = 0; 
				cont2 = cont2++;
			break;
			}
			

			System.out.println("Informe o sexo:");
			System.out.println("'m' para masculino");
			System.out.println("'f' para feminino");
			System.out.println("ou '0' para encerrar");
			sexo = sc.next().charAt(0);
			
			if (sexo == 'm') {
				homem++;
			}
			if (tipo == 2 && sexo == 'm')
			gay++;

		} while (tipo != 0 && sexo != 0);
		
		System.out.println(gay);
        System.out.println(homem);
        int supergay = gay/homem;
        System.out.println(supergay);
         
	}

}