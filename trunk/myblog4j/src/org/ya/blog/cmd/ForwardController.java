package org.ya.blog.cmd;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import org.ya.blog.bo.ArticleBO;
import org.ya.blog.bo.TypeBO;
import org.ya.blog.orm.Type;

@Controller
public class ForwardController extends MultiActionController {

	protected Logger log = Logger.getLogger(this.getClass());
	
	@Autowired
	private ArticleBO articleBO;
	
	@Autowired
	private TypeBO typeBO;
	
	
	public ForwardController() {
	}

	
	@RequestMapping("/admin/main.do")
	public String toAdminMainPage(HttpServletRequest  request,HttpServletRequest response)
	{
		log.debug("转到后台管理页面.");
		return "admin/main";
	}
	
	@RequestMapping("/admin/addtypepage.do")
	public String addtypepage(HttpServletRequest  request,HttpServletRequest response)
	{
		log.debug("转到添加类别页面");
		List<Type> list = null;
		try {
			list = typeBO.findAll();
		} catch (SQLException e) {
		}
		request.setAttribute("TypeList", list);
		return "admin/addtype";
	}
	
	@RequestMapping("/admin/articlemng.do")
	public String toArticleMngPage(HttpServletRequest  request,HttpServletRequest response)
	{
		log.debug("转到文章管理页面.");
		
		return "admin/articlemng";
	}
	
	@RequestMapping("/admin/typemng.do")
	public String toTypeMngPage(HttpServletRequest  request,HttpServletRequest response) throws SQLException
	{
		log.debug("转到类别管理");
		List<Type> list = this.typeBO.findAll();
		request.setAttribute("TypeList", list);
		return "admin/typemng";
	}
}
