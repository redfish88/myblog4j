package org.ya.blog.dao;

import java.sql.SQLException;

import org.ya.blog.orm.Member;

import com.ibatis.sqlmap.client.SqlMapClient;

public class MemberDAO {

	public MemberDAO() {
	}

	public void saveMember() throws SQLException
	{
		Member instance = new Member();
		instance.setEmail("redfish@w-ya.com");
		instance.setPassword("123");
		instance.setAlias("redfish");
		instance.setNickname("lvrenkun");

		
		SqlMapFactory.SQLMAP.insert("addMember", instance);
		
	}
	
	public Member findByPk(int id) throws SQLException
	{
		
		Member instance = (Member)SqlMapFactory.SQLMAP.queryForObject("findByPk",id);
		return instance;
	}
	
	public static void main(String [] args) throws SQLException
	{
		MemberDAO dao = new MemberDAO();
		Member instance = dao.findByPk(1);
//		System.out.println(instance.getNickname());
		dao.saveMember();
	}
}
