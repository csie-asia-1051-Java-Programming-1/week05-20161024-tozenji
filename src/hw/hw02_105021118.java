package hw;
import java.util.Scanner;
public class hw02_105021118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int m=0,sum=0,n;
		n=scn.nextInt();
		while(sum<=n){
	    System.out.println("m="+m+",sum="+sum);
	    m++;
	    sum+=m;
			
		}
	}

}
