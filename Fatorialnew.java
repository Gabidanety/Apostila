package apostila;

import java.util.Scanner;

public class Fatorialnew {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		int i=1,f,res=1;
		System.out.println("coloque o Fatorial");
		f = in.nextInt();
		do {
			res = res*i;
			i++;
		}while(i<=f);
		System.out.println(res);
		
		
	}

}
