package apostila;

import java.util.Scanner;
public class SimNao {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int i=1,ano,nasc,idade,res;
		System.out.println("Insira o ano atual:");
		ano = in.nextInt();

		do {
			System.out.println("insira sua data de nascimento:");
			nasc = in.nextInt();
			idade = (ano-nasc);
			System.out.println(idade);
				if(idade>=18){
					System.out.println("Maior de Idade ");
				}else {
					System.out.println("Menor de Idade ");
				}
				
			System.out.println("Deseja continuar a execucao?  1- Para sim ou 2- Para não");
				res = in.nextInt ();
					if(res==1){
						res= res+0;
					}else {
						 i++;
					}
			}while (i==1);

	}

}
