package apostila;
import java.util.Scanner;
public class somatoria {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		int i=1,n,s;
		
		System.out.println("coloque o número que deseja");
		n = in.nextInt();

		do {
			s = n+i;
			System.out.println(s);
			i++;

		}while(i<=100); 

	}

}
