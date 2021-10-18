package com.sist.main;
/*
 *  문제 설명
	두 정수 left와 right가 매개변수로 주어집니다. left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
	
	제한사항
	1 ≤ left ≤ right ≤ 1,000
	입출력 예
	left	right	result
	13	17	43
	24	27	52
	입출력 예 설명
	입출력 예 #1
	
	다음 표는 13부터 17까지의 수들의 약수를 모두 나타낸 것입니다.
	수	약수	약수의 개수
	13	1, 13	2
	14	1, 2, 7, 14	4
	15	1, 3, 5, 15	4
	16	1, 2, 4, 8, 16	5
	17	1, 17	2
	따라서, 13 + 14 + 15 - 16 + 17 = 43을 return 해야 합니다.
	입출력 예 #2
	
	다음 표는 24부터 27까지의 수들의 약수를 모두 나타낸 것입니다.
	수	약수	약수의 개수
	24	1, 2, 3, 4, 6, 8, 12, 24	8
	25	1, 5, 25	3
	26	1, 2, 13, 26	4
	27	1, 3, 9, 27	4
	따라서, 24 - 25 + 26 + 27 = 52를 return 해야 합니다.
	
	
	제곱수인 경우 약수의 개수가 홀수
    (i % Math.sqrt(i)== 0  **** 자바 제곱근 구하기 (25) => 5.0
	제곱수가 아닌 경우 약수의 개수가 짝수
 */
import java.util.*;
public class Study1017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b=0;
		
		int sum=0;
		Scanner scan=new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력: ");
		a=scan.nextInt();
		
		System.out.print("두번째 정수 입력: ");
		b=scan.nextInt();
		
		for(int i=a;i<=b;i++)
        {
			int cnt=0;
            for(int j=1;j<=i;j++)
            {
            	if(i%j==0)
            	{
            		cnt++;
            	}
            }
            
            if(cnt%2==0)
            {
            	sum=sum+i;
            }
            else
            {
            	sum=sum-i;
            }
        }
		
		System.out.println(sum);
	}

}





















