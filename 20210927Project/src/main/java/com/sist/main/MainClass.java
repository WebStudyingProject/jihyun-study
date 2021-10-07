package com.sist.main;
import com.sist.dao.*;
import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainClass {
	private HotelDAO dao;

	public void setDao(HotelDAO dao) {
	this.dao = dao;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext app=new ClassPathXmlApplicationContext("app.xml");
		MainClass mc=(MainClass)app.getBean("mc");
		
		System.out.print("구 입력:");
		Scanner scan=new Scanner(System.in);
		String gu=scan.nextLine();
		
		List<HotelVO> list=mc.dao.hotelListData(gu);
		
		for(HotelVO vo:list)
		{
			System.out.println(vo.getName()+"("+vo.getScore()+")");
		}
		scan.close();
	}

}
