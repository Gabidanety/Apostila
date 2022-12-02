package apostila;

import java.util.Scanner;

public class IdadeNome {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in); 
		
		int i=1,nome,idade,menor,maior;
		menor = 200;
		maior = 0;
		
		do {
			System.out.println("Coloque o seu nome: ");
			nome = in.nextInt();
			System.out.println("Coloque sua idade: ");
			idade = in.nextInt();
			
		}while(i<=10);
	}

}
