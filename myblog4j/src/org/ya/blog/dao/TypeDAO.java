package org.ya.blog.dao;

import java.sql.SQLException;

import org.ya.blog.orm.Type;

public class TypeDAO {

	public TypeDAO() {
	}
	
	public void addType(Type instance) throws SQLException
	{
		SqlMapFactory.SQLMAP.insert("addType",instance);
	}
	
	public void deleteType(int id) throws SQLException
	{
		SqlMapFactory.SQLMAP.delete("deleteType",id);
	}
	
	public void updateType(Type instance) throws SQLException
	{
		SqlMapFactory.SQLMAP.update("updateType", instance);
	}
	
	public Type findByPk(int id) throws SQLException
	{
		return (Type)SqlMapFactory.SQLMAP.queryForObject("findByPk",id);
	}

}
