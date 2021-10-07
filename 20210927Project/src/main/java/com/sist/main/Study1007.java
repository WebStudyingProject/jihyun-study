package com.sist.main;
import java.util.*;
/*
 *  문제 설명
	이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
	별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.
	
	제한 조건
	n과 m은 각각 1000 이하인 자연수입니다.
 */
public class Study1007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=0;
		//0<=a && a<=1000
		Scanner s = new Scanner(System.in);
		while(true)
		{
			System.out.println("가로:");
	        a = s.nextInt();
	        
	        if(a>=0 && a<=1000)
	        {
	        	break;
	        }
	        else
	        {
	        	System.out.println("다시 입력하시오!");
	        }
		}  
		
		while(true)
		{
			System.out.println("세로:");
	        b = s.nextInt();
	        
	        if(b>=0 && b<=1000)
	        {
	        	break;
	        }
	        else
	        {
	        	System.out.println("다시 입력하시오!");
	        }
		}  
		
		
        for (int i=0; i<b; i++) 
        {
            for (int j=0; j<a; j++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println(a + b);
        
	}

}
