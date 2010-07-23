package org.ya.blog.bo;

import java.sql.SQLException;

import org.ya.blog.idao.IArticleDAO;
import org.ya.blog.orm.Article;

public class ArticleBO {
	
	private IArticleDAO articleDAO;

	public ArticleBO() {
	}

	public void postArticle(Article instance) throws SQLException
	{
		if(instance == null)
		{
			throw new IllegalArgumentException("无效的实体");
		}
		this.articleDAO.postArticle(instance);
	}
}
