package org.ya.blog.dao;

import java.sql.SQLException;

import org.ya.blog.orm.Member;

import com.ibatis.sqlmap.client.SqlMapClient;

public class MemberDAO {

	public MemberDAO() {
	}

	/**
	 * 保存用户
	 * @param instance
	 * @throws SQLException
	 */
	public void saveMember(Member instance) throws SQLException
	{	
		SqlMapFactory.SQLMAP.insert("addMember", instance);	
	}
	
	/**
	 * 根据主键进行查询
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public Member findByPk(int id) throws SQLException
	{
		
		Member instance = (Member)SqlMapFactory.SQLMAP.queryForObject("findByPk",id);
		return instance;
	}
	
	/**
	 * 更新用户
	 * @param instance
	 * @throws SQLException
	 */
	public void updateMember(Member instance) throws SQLException
	{
		SqlMapFactory.SQLMAP.update("updateMember", instance);
	}
	
	/**
	 * 删除用户
	 * @param id
	 * @throws SQLException
	 */
	public void deleteMember(int id) throws SQLException
	{
		SqlMapFactory.SQLMAP.delete("delMember",id);
	}
	
	public static void main(String [] args) throws SQLException
	{
//		MemberDAO dao = new MemberDAO();
//		Member instance = dao.findByPk(1);
////		System.out.println(instance.getNickname());
//		dao.saveMember();
	}
}
