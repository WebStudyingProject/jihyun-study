package com.sist.main;
import java.util.*;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sist.config.*;
import com.sist.dao.*;
public class MainClass2 {
	private HotelDAO dao;

	public void setDao(HotelDAO dao) {
	this.dao = dao;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext app=
				new AnnotationConfigApplicationContext(HotelConfig.class);
		MainClass2 mc1=(MainClass2)app.getBean("mc1");
		
		
		System.out.print("주소 입력 : ");
		Scanner scan=new Scanner(System.in);
		String gu=scan.nextLine();
		
		List<HotelVO> list=mc1.dao.hotelListData(gu);
		
		for(HotelVO vo:list)
		{
			System.out.println(vo.getName()+"("+vo.getScore()+")");
		}
		scan.close();

	}

}
