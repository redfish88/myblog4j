package org.ya.blog.bo;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.ya.blog.dao.MemberDAO;
import org.ya.blog.orm.Member;
import org.ya.blog.util.MD5Encoder;

public class MemberBO {

	public MemberBO() {
	}
	
	@Autowired
	private MemberDAO memberDAO;
	
	public Member findByPk(int id) throws SQLException
	{
		return memberDAO.findByPk(id);
	}
	
	/**
	 * 用户登录
	 * @param nickname
	 * @param password
	 * @return
	 * @throws SQLException
	 */
	public Member userLogin(String nickname,String password) throws SQLException
	{
		List<Member> list = memberDAO.findByNickname(nickname);
		if(list.size() > 0)
		{
			if(list.get(0).getPassword().equals(MD5Encoder.encode(password)))
			{
				return list.get(0);
			}
			return null;
		}else
		{
			return null;
		}
	}
}
