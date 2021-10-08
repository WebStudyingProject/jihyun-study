package com.sist.main;
/*
 *  프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
	전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
	
	제한 조건
	s는 길이 4 이상, 20이하인 문자열입니다.
	입출력 예
	phone_number	return
	"01033334444"	"*******4444"
	"027778888"	"*****8888"
	
	.(?=.{4})
	. => 임의의 문자 한개
	(?=.) => 뒷쪽에 임의의 문자 한 개를 제외하고 선택
	{숫자} => 숫자 만큼의 자릿수
	
 */
import java.util.*;
public class Study1008 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String pn="";
		
		while(true)
		{
			System.out.print("번호를 입력하세요 : ");
			pn=sc.next();
			
			if(pn.length()>=4 && pn.length()<=20)
			{
				break;
			}
			
			else
			{
				System.out.println("다시 입력하시오!");
				continue;
			}
		}
		
		System.out.print(pn.replaceAll(".(?=.{4})", "*"));
		

	}

}
















