package com.sist.dao;

import java.sql.*;
import java.util.*;

public class HotelDAO {
	private Connection conn;
	private PreparedStatement ps;
	private String url,username,password;
	
	public void setUrl(String url) {
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public HotelDAO(String driverName)
	{
		try
		{
			Class.forName(driverName);
		}catch(Exception ex) {}
	}
	
	public void getConnection()
	{
		try
		{
			conn=DriverManager.getConnection(url,username,password);
		}catch(Exception ex) {}
	}
	
	public void disConnection()
	{
		try
		{
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
		}catch(Exception ex) {}
	}
	
	public List<HotelVO> hotelListData(String gu)
	{
		List<HotelVO> list=new ArrayList<HotelVO>();
		try
		{
			getConnection();
			String sql="SELECT name,score FROM seoul_hotel WHERE address LIKE '%'||?||'%'";
			ps=conn.prepareStatement(sql);
			
			ps.setString(1, gu);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				HotelVO vo=new HotelVO();
				vo.setName(rs.getString(1));
				vo.setScore(rs.getDouble(2));
			}
			rs.close();
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
		return list;
	}

}

//211.238.142.181


















