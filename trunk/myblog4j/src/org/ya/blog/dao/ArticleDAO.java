package org.ya.blog.dao;

import java.sql.SQLException;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.ya.blog.orm.Article;

public class ArticleDAO extends SqlMapClientDaoSupport  {

	public ArticleDAO() {
	}

	/**
	 * 
	 * Description:发表文章 
	 * @Version1.0 Jul 16, 2010 3:32:04 PM by 孙玮男（lukesun@w-ya.com）创建
	 * @param instance
	 * @throws SQLException
	 */
	public void postArticle(Article instance) throws SQLException
	{
		super.getSqlMapClientTemplate().insert("addArticle", instance);
	}
	
	/**
	 * 
	 * Description:根据ID删除实体 
	 * @Version1.0 Jul 16, 2010 3:33:31 PM by 孙玮男（lukesun@w-ya.com）创建
	 * @param id
	 * @throws SQLException
	 */
	public void deleteArticle(int id) throws SQLException
	{
		super.getSqlMapClientTemplate().delete("delArticle", id);
	}
	
	/**
	 * 
	 * Description: 根据主键查找
	 * @Version1.0 Jul 16, 2010 3:47:58 PM by 孙玮男（lukesun@w-ya.com）创建
	 * @param id
	 * @throws SQLException
	 */
	public void findByPK(int id) throws SQLException
	{
		super.getSqlMapClientTemplate().queryForList("findArticleByPk",id);
	}
	
	/**
	 * 
	 * Description: 更新实体
	 * @Version1.0 Jul 16, 2010 3:48:15 PM by 孙玮男（lukesun@w-ya.com）创建
	 * @param instance
	 * @throws SQLException
	 */
	public void updateArticle(Article instance)throws SQLException
	{
		super.getSqlMapClientTemplate().update("updateArticle", instance);
	}
}
