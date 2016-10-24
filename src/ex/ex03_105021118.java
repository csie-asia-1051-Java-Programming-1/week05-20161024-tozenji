package ex;
/*
 * Topic: 讓使用者輸入一正整數 n，並輸出 2^1+2^2+2^3+...+2^n 的值。
 * Date: 2016/10/24
 * Author: 105021118  鄭曉玫
 */
import java.util.Scanner;
public class ex03_105021118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		long n=scn.nextLong( );
		long i=(long)(Math.pow(2, n)-1 );
		System.out.println(2*i);
	}

}
