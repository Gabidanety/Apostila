package apostila;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i;
		double s,inss;
		
		for(i=1;i<=4;i++) {
			System.out.println("Coloque o se salario:");
				s = in.nextInt();
				if(s<2000) {
				inss = s - 100/8.5;
				System.out.println("Seu inss: "+inss);
				}else {
					inss = s-11/100;
					System.out.println("Seu inss: "+inss);
				}
		}
	}

}
