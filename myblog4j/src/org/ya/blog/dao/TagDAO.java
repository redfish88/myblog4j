package org.ya.blog.dao;

import java.sql.SQLException;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.ya.blog.idao.ITagDAO;
import org.ya.blog.orm.Tag;

public class TagDAO extends SqlMapClientDaoSupport  implements ITagDAO {

	public TagDAO() {
	}

	/* (non-Javadoc)
	 * @see org.ya.blog.dao.ITagDAO#addType(org.ya.blog.orm.Tag)
	 */
	public void addType(Tag instance) throws SQLException
	{
		SqlMapFactory.SQLMAP.insert("addTag",instance);
	}
	
	/* (non-Javadoc)
	 * @see org.ya.blog.dao.ITagDAO#deleteType(int)
	 */
	public void deleteType(int id) throws SQLException
	{
		SqlMapFactory.SQLMAP.delete("deleteTag",id);
	}
	
	/* (non-Javadoc)
	 * @see org.ya.blog.dao.ITagDAO#updateType(org.ya.blog.orm.Tag)
	 */
	public void updateType(Tag instance) throws SQLException
	{
		SqlMapFactory.SQLMAP.update("updateTag", instance);
	}
	
	/* (non-Javadoc)
	 * @see org.ya.blog.dao.ITagDAO#findByPk(int)
	 */
	public Tag findByPk(int id) throws SQLException
	{
		return (Tag)SqlMapFactory.SQLMAP.queryForObject("findByPk",id);
	}
}
