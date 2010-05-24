package org.ya.blog.idao;

import java.sql.SQLException;

import org.ya.blog.orm.Tag;

public interface ITagDAO {

	public abstract void addType(Tag instance) throws SQLException;

	public abstract void deleteType(int id) throws SQLException;

	public abstract void updateType(Tag instance) throws SQLException;

	public abstract Tag findByPk(int id) throws SQLException;

}