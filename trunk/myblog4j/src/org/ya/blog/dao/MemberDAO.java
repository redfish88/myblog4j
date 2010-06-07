package org.ya.blog.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.ya.blog.idao.IMemberDAO;
import org.ya.blog.orm.Member;

public class MemberDAO extends SqlMapClientDaoSupport implements IMemberDAO  {

	public MemberDAO() {
	}

	/* (non-Javadoc)
	 * @see org.ya.blog.dao.IMemberDAO#saveMember(org.ya.blog.orm.Member)
	 */
	public void saveMember(Member instance) throws SQLException
	{	
		super.getSqlMapClient().insert("addMember", instance);	
	}
	
	/* (non-Javadoc)
	 * @see org.ya.blog.dao.IMemberDAO#findByPk(int)
	 */
	public Member findByPk(int id) throws SQLException
	{
		
		Member instance = (Member)super.getSqlMapClient().queryForObject("findByPk",id);
		return instance;
	}
	
	/* (non-Javadoc)
	 * @see org.ya.blog.dao.IMemberDAO#updateMember(org.ya.blog.orm.Member)
	 */
	public void updateMember(Member instance) throws SQLException
	{
		super.getSqlMapClient().update("updateMember", instance);
	}
	
	/* (non-Javadoc)
	 * @see org.ya.blog.dao.IMemberDAO#deleteMember(int)
	 */
	public void deleteMember(int id) throws SQLException
	{
		super.getSqlMapClient().delete("delMember",id);
	}
	
	public List<Member> findByNickname(String nickname) throws SQLException
	{
		return super.getSqlMapClient().queryForList("findByNickname",nickname);
	}
}
