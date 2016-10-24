package ex;
/*
 * Topic: 讓使用者輸入一正整數n，用while迴圈計算n!後輸出。
 * Date: 2016/10/24
 * Author: 105021118  鄭曉玫
 */
import java.util.Scanner;
public class ex02_105021118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		int n ,i=1,sum=1;
		
			
			n=scn.nextInt();
			
		while(i<n);
		
			sum*=i;
		    sum++;
		
		
		System.out.println("1*2*...*"+n+"="+sum) ;
		
	}

	}


