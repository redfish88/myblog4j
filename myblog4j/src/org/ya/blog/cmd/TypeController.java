package org.ya.blog.cmd;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.ya.blog.bo.TypeBO;
import org.ya.blog.orm.Type;

@Controller
public class TypeController {


	
	protected Logger log = Logger.getLogger(this.getClass());
	
	@Autowired
	private TypeBO typeBO;
	
	public TypeController() {
	}

	
	@RequestMapping("/admin/addtype.do")
	public String addType(HttpServletRequest  request,HttpServletRequest response)
	{
		log.info("添加类别.");
		String type = request.getParameter("type");
		String depict = request.getParameter("depict");
		String rootId = request.getParameter("parent");
		
		Type instance = new Type();
		instance.setType(type);
		instance.setDepict(depict);
		instance.setRootId(Integer.parseInt(rootId));
		
		try {
			this.typeBO.addType(instance);
		} catch (SQLException e) {
		}
		
		return "redirect:/admin/typemng.do";
	}
}
