package org.ya.blog.dao;

import java.sql.SQLException;

import org.ya.blog.orm.Tag;

public class TagDAO {

	public TagDAO() {
	}

	public void addType(Tag instance) throws SQLException
	{
		SqlMapFactory.SQLMAP.insert("addTag",instance);
	}
	
	public void deleteType(int id) throws SQLException
	{
		SqlMapFactory.SQLMAP.delete("deleteTag",id);
	}
	
	public void updateType(Tag instance) throws SQLException
	{
		SqlMapFactory.SQLMAP.update("updateTag", instance);
	}
	
	public Tag findByPk(int id) throws SQLException
	{
		return (Tag)SqlMapFactory.SQLMAP.queryForObject("findByPk",id);
	}
}
