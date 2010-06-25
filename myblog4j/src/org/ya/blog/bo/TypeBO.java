package org.ya.blog.bo;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.ya.blog.idao.ITypeDAO;
import org.ya.blog.orm.Type;

public class TypeBO {

	@Autowired
	private ITypeDAO typeDAO;
	
	public TypeBO() {
	}

	public void addType(Type instance) throws SQLException
	{
		this.typeDAO.addType(instance);
	}
	
	public void deleteType(int id) throws SQLException
	{
		this.typeDAO.deleteType(id);
	}
	
	public List<Type> findAll() throws SQLException
	{
		return this.typeDAO.findAll();
	}
}
