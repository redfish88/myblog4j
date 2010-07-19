package org.ya.blog.cmd;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.ya.blog.idao.ITypeDAO;

@Controller
public class TypeController {


	
	protected Logger log = Logger.getLogger(this.getClass());
	
	public TypeController() {
	}

	
	@RequestMapping("/admin/addtype.do")
	public String addType(HttpServletRequest  request,HttpServletRequest response)
	{
		log.info("添加类别.");
		
		
		return "";
	}
}
