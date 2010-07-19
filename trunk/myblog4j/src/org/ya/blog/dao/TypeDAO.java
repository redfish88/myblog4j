package org.ya.blog.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.ya.blog.idao.ITypeDAO;
import org.ya.blog.orm.Type;

public class TypeDAO extends SqlMapClientDaoSupport implements ITypeDAO {

	public TypeDAO() {
	}
	
	/* (non-Javadoc)
	 * @see org.ya.blog.dao.ITypeDAO#addType(org.ya.blog.orm.Type)
	 */
	public void addType(Type instance) throws SQLException
	{
		super.getSqlMapClientTemplate().insert("addType",instance);
	}
	
	public List<Type> findAll() throws SQLException
	{
		return super.getSqlMapClientTemplate().queryForList("findAll");
	}
	/* (non-Javadoc)
	 * @see org.ya.blog.dao.ITypeDAO#deleteType(int)
	 */
	public void deleteType(int id) throws SQLException
	{
		super.getSqlMapClientTemplate().delete("deleteType",id);
	}
	
	/* (non-Javadoc)
	 * @see org.ya.blog.dao.ITypeDAO#updateType(org.ya.blog.orm.Type)
	 */
	public void updateType(Type instance) throws SQLException
	{
		super.getSqlMapClientTemplate().update("updateType", instance);
	}
	
	/* (non-Javadoc)
	 * @see org.ya.blog.dao.ITypeDAO#findByPk(int)
	 */
	public Type findByPk(int id) throws SQLException
	{
		return (Type)super.getSqlMapClientTemplate().queryForObject("findByPk",id);
	}

}
