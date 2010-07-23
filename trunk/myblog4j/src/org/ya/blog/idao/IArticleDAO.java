package org.ya.blog.idao;

import java.sql.SQLException;
import java.util.List;

import org.ya.blog.orm.Article;

public interface IArticleDAO {

	/**
	 * 
	 * Description:发表文章 
	 * @Version1.0 Jul 16, 2010 3:32:04 PM by 孙玮男（lukesun@w-ya.com）创建
	 * @param instance
	 * @throws SQLException
	 */
	public abstract void postArticle(Article instance) throws SQLException;

	/**
	 * 
	 * Description:根据ID删除实体 
	 * @Version1.0 Jul 16, 2010 3:33:31 PM by 孙玮男（lukesun@w-ya.com）创建
	 * @param id
	 * @throws SQLException
	 */
	public abstract void deleteArticle(int id) throws SQLException;

	/**
	 * 
	 * Description: 根据主键查找
	 * @Version1.0 Jul 16, 2010 3:47:58 PM by 孙玮男（lukesun@w-ya.com）创建
	 * @param id
	 * @throws SQLException
	 */
	public abstract void findByPK(int id) throws SQLException;

	/**
	 * 
	 * Description: 更新实体
	 * @Version1.0 Jul 16, 2010 3:48:15 PM by 孙玮男（lukesun@w-ya.com）创建
	 * @param instance
	 * @throws SQLException
	 */
	public abstract void updateArticle(Article instance) throws SQLException;

	/**
	 * 分页查询
	 * @return
	 * @throws SQLException
	 */
	public abstract List<Article> findByPage() throws SQLException;

}