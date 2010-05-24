package org.ya.blog.dao;

import java.sql.SQLException;

import org.ya.blog.orm.Article;

public class ArticleDAO {

	public ArticleDAO() {
	}

	public void postArticle(Article instance) throws SQLException
	{
		SqlMapFactory.SQLMAP.insert("addArticle",instance);
	}
	
	public void deleteArticle(int id) throws SQLException
	{
		SqlMapFactory.SQLMAP.insert("deleteArticle",id);
	}
	
	public void findByPK(int id) throws SQLException
	{
		SqlMapFactory.SQLMAP.queryForList("findByPK", id);
	}
	
	public void updateArticle(Article instance)throws SQLException
	{
		SqlMapFactory.SQLMAP.update("updateArticle",instance);
	}
}
