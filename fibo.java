package apostila;
import java.util.Scanner;
public class fibo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		int n,ant1=0,ant2=0,atual=1,i;
		
	   System.out.println("Digite a possicao, e descubra o numero que ocupa essa posicao, na sequecia de fibonacci");
		n = in.nextInt();

	    for(i=1;i<=n;i++){
	        System.out.println(" ");
	        System.out.println(atual + "-");
	        ant1 = ant2;
	        ant2 = atual;
	        atual = ant1+ant2;
	    }
	    System.out.println(" O numero da possicao " + n + " e " + ant2);
	}

}