package com.sist.config;
import java.util.*;

import org.springframework.context.annotation.Bean;

import com.sist.dao.*;
import com.sist.main.*;

public class HotelConfig {
	@Bean("dao")
	public HotelDAO hotelDAO()
	{
		HotelDAO dao=new HotelDAO("oracle.jdbc.driver.OracleDriver");
		dao.setUrl("jdbc:oracle:thin:@211.238.142.181:1521:XE");
		dao.setUsername("hr");
		dao.setPassword("happy");
		return dao;
	}
	
	@Bean("mc1")
	public MainClass2 mainClass()
	{
		MainClass2 mc=new MainClass2();
		mc.setDao(hotelDAO());
		return mc;
	}

}
