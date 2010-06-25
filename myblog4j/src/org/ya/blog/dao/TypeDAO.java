package org.ya.blog.dao;

import java.sql.SQLException;
import java.util.List;

import org.ya.blog.idao.ITypeDAO;
import org.ya.blog.orm.Type;

public class TypeDAO implements ITypeDAO {

	public TypeDAO() {
	}
	
	/* (non-Javadoc)
	 * @see org.ya.blog.dao.ITypeDAO#addType(org.ya.blog.orm.Type)
	 */
	public void addType(Type instance) throws SQLException
	{
		SqlMapFactory.SQLMAP.insert("addType",instance);
	}
	
	public List<Type> findAll() throws SQLException
	{
		return SqlMapFactory.SQLMAP.queryForList("findAll");
	}
	/* (non-Javadoc)
	 * @see org.ya.blog.dao.ITypeDAO#deleteType(int)
	 */
	public void deleteType(int id) throws SQLException
	{
		SqlMapFactory.SQLMAP.delete("deleteType",id);
	}
	
	/* (non-Javadoc)
	 * @see org.ya.blog.dao.ITypeDAO#updateType(org.ya.blog.orm.Type)
	 */
	public void updateType(Type instance) throws SQLException
	{
		SqlMapFactory.SQLMAP.update("updateType", instance);
	}
	
	/* (non-Javadoc)
	 * @see org.ya.blog.dao.ITypeDAO#findByPk(int)
	 */
	public Type findByPk(int id) throws SQLException
	{
		return (Type)SqlMapFactory.SQLMAP.queryForObject("findByPk",id);
	}

}
