package org.ya.blog.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.ya.blog.idao.IArticleDAO;
import org.ya.blog.orm.Article;

public class ArticleDAO extends SqlMapClientDaoSupport implements IArticleDAO  {

	public ArticleDAO() {
	}

	/* (non-Javadoc)
	 * @see org.ya.blog.dao.IArticleDAO#postArticle(org.ya.blog.orm.Article)
	 */
	public void postArticle(Article instance) throws SQLException
	{
		super.getSqlMapClientTemplate().insert("addArticle", instance);
	}
	
	/* (non-Javadoc)
	 * @see org.ya.blog.dao.IArticleDAO#deleteArticle(int)
	 */
	public void deleteArticle(int id) throws SQLException
	{
		super.getSqlMapClientTemplate().delete("delArticle", id);
	}
	
	/* (non-Javadoc)
	 * @see org.ya.blog.dao.IArticleDAO#findByPK(int)
	 */
	public void findByPK(int id) throws SQLException
	{
		super.getSqlMapClientTemplate().queryForList("findArticleByPk",id);
	}
	
	/* (non-Javadoc)
	 * @see org.ya.blog.dao.IArticleDAO#updateArticle(org.ya.blog.orm.Article)
	 */
	public void updateArticle(Article instance)throws SQLException
	{
		super.getSqlMapClientTemplate().update("updateArticle", instance);
	}
	
	/* (non-Javadoc)
	 * @see org.ya.blog.dao.IArticleDAO#findByPage()
	 */
	public List<Article> findByPage() throws SQLException
	{
		return null;
	}
}
