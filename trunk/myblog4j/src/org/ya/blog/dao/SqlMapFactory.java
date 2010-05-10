package org.ya.blog.dao;

import java.io.Reader;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class SqlMapFactory {

	public SqlMapFactory() {
	}
	public static SqlMapClient SQLMAP ;
	
	static{
		try{
			String resource = "sqlmapconfig.xml";
			Reader reader = Resources.getResourceAsReader (resource);
			SQLMAP = SqlMapClientBuilder.buildSqlMapClient(reader);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
