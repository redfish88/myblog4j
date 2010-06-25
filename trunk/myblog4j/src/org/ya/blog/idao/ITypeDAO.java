package org.ya.blog.idao;

import java.sql.SQLException;
import java.util.List;

import org.ya.blog.orm.Type;

public interface ITypeDAO {

	public abstract void addType(Type instance) throws SQLException;

	public abstract void deleteType(int id) throws SQLException;

	public abstract void updateType(Type instance) throws SQLException;

	public abstract Type findByPk(int id) throws SQLException;

	public abstract List<Type> findAll() throws SQLException;
}