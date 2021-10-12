package com.sist.main;
import java.util.*;
/*
 *  문제 설명
	정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
	
	제한 조건
	num은 int 범위의 정수입니다.
	0은 짝수입니다.
	입출력 예
	num	return
	3	"Odd"
	4	"Even"
	
	return num % 2 == 0 ? "Even": "Odd";
 */
public class Study1012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner s=new Scanner(System.in);
		
		
		while(true)
		{
			System.out.print("정수 입력: ");
			num=s.nextInt();
			
			if(num%2==0)
			{
				System.out.println(num+" Even");
			}
			else if(num%2==1)
			{
				System.out.println(num+" Odd");
			}
			
		}
		
	}

}
