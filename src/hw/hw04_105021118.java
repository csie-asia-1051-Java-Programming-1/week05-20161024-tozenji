package hw;
import java.util.Scanner;
public class hw04_105021118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int a,n;
		double sum=0;
		n=scn.nextInt( );
		for(a=1;a<=n;a++){
			if(a%2==1)
				sum=(double)sum+1.0/a;
			else
				sum=(double)sum-1.0/a;
		}
		System.out.print("1-1/2+...");
		if(n%2==1)
			System.out.print("+");
		System.out.println("1/"+n+"="+sum);
		
		
					
	}
	   

}
