package apostila;
import java.util.Scanner;

public class VelhoNovo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int i,nasc,idade,ano,maior=0,menor=200;
	
		
		
		System.out.println("insira o ano atual:");
		ano = sc.nextInt();
		
		for(i=1;i<=10;i++) {
			
			System.out.println("insira data de nascimento:");
			nasc = sc.nextInt();
			idade = ano-nasc;
			System.out.println("Voce tem:"+idade);
			
			if(maior<=idade){
				maior =idade;
			}else if(menor>=idade) {
				menor = idade;
			}
		}
		System.out.println("O mais velho tem "+maior);
		System.out.println("O mais novo tem "+menor);
		
	}

}