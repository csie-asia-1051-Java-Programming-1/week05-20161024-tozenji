package hw;
import java.util.Scanner;
public class hw03_105021118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int N = n;
		int c = 1;
		while(N<=10000){
			N*=n;
			c++;
					
		}
		System.out.println(n+"^"+c+">10000");
	}

}
