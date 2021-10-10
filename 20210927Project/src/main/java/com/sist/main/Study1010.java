package com.sist.main;
/*
 *  문제 설명
	단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
	
	재한사항
	s는 길이가 1 이상, 100이하인 스트링입니다.
	입출력 예
	s	return
	"abcde"	"c"
	"qwer"	"we"
 */
import java.util.*;
public class Study1010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="";
		String ss="";
		
		Scanner scan=new Scanner(System.in);
		System.out.print("단어 입력 : ");
		s=scan.next();
		
		int a=s.length();

		
		if(a%2==0)
			ss=s.substring((a/2)-1,(a/2)+1);
		else
			ss=s.substring((a/2),(a/2)+1);
		
		System.out.println(ss);
	}

}
