package apostila;

import java.util.Scanner;

public class MargemLucro {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int i=1,prod,lucro,res,venda;
		
			do {
				System.out.println("Coloque o produto:");
					prod = in.nextInt();
				System.out.println("Coloque a margem de lucro:");
					lucro = in.nextInt();
					venda = lucro/prod*100;
					System.out.println("O preco de venda e "+venda+"%");
					
					System.out.println ( "Deseja continuar a execucao? 1- Para sim ou 2- Para nao" );
					res = in.nextInt ();
						if ( res == 1 ){
							res = res + 0 ;
						} else {
							  i++;
						}
				
			}while(i==1);
	}

}
