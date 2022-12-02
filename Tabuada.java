package apostila;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner in= new Scanner (System.in);
		
		int i,res,n;
		
		System.out.println(" Coloque o numero da tabuada que deseja: ");
		n = in.nextInt();
		
		for(i=0;i<=10;i++) {
			res = n*i;
			System.out.println(n+"x"+i+"="+res);
		}
	}

}
