package org.ya.blog.idao;

import java.sql.SQLException;
import java.util.List;

import org.ya.blog.orm.Member;

public interface IMemberDAO {

	/**
	 * 保存用户
	 * @param instance
	 * @throws SQLException
	 */
	public abstract void saveMember(Member instance) throws SQLException;

	/**
	 * 根据主键进行查询
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public abstract Member findByPk(int id) throws SQLException;

	/**
	 * 更新用户
	 * @param instance
	 * @throws SQLException
	 */
	public abstract void updateMember(Member instance) throws SQLException;

	/**
	 * 删除用户
	 * @param id
	 * @throws SQLException
	 */
	public abstract void deleteMember(int id) throws SQLException;

	public abstract List<Member> findByNickname(String nickname) throws SQLException;
}