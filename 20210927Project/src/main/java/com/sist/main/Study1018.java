package com.sist.main;
import java.util.*;
/*
 * 
 */
public class Study1018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,a=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력: ");
		n=scan.nextInt();
		
		for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                a=a+i;
            }
        }
		
		System.out.println(a);

	}
	

}
