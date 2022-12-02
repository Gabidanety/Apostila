package apostila;

import java.util.Scanner;

public class potenciaNew {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		double b,e,res;
		
		System.out.println("Insira base:");
		b = in.nextDouble ();
		System.out.println("Insira expoente");
		e = in.nextDouble();
		
		for(res=1;e>0;e=e-1) {
			res = b*res;
		}
		System.out.println(" "+res);
	}

}