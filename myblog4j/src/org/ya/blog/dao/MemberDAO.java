package org.ya.blog.dao;

import java.sql.SQLException;

import org.ya.blog.idao.IMemberDAO;
import org.ya.blog.orm.Member;

import com.ibatis.sqlmap.client.SqlMapClient;

public class MemberDAO implements IMemberDAO {

	public MemberDAO() {
	}

	/* (non-Javadoc)
	 * @see org.ya.blog.dao.IMemberDAO#saveMember(org.ya.blog.orm.Member)
	 */
	public void saveMember(Member instance) throws SQLException
	{	
		SqlMapFactory.SQLMAP.insert("addMember", instance);	
	}
	
	/* (non-Javadoc)
	 * @see org.ya.blog.dao.IMemberDAO#findByPk(int)
	 */
	public Member findByPk(int id) throws SQLException
	{
		
		Member instance = (Member)SqlMapFactory.SQLMAP.queryForObject("findByPk",id);
		return instance;
	}
	
	/* (non-Javadoc)
	 * @see org.ya.blog.dao.IMemberDAO#updateMember(org.ya.blog.orm.Member)
	 */
	public void updateMember(Member instance) throws SQLException
	{
		SqlMapFactory.SQLMAP.update("updateMember", instance);
	}
	
	/* (non-Javadoc)
	 * @see org.ya.blog.dao.IMemberDAO#deleteMember(int)
	 */
	public void deleteMember(int id) throws SQLException
	{
		SqlMapFactory.SQLMAP.delete("delMember",id);
	}
	
}
