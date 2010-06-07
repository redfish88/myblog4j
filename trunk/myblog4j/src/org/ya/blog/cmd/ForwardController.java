package org.ya.blog.cmd;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

@Controller
public class ForwardController extends MultiActionController {

	protected Logger log = Logger.getLogger(this.getClass());
	
	public ForwardController() {
	}


	
	@RequestMapping("/admin/main.do")
	public String toAdminMainPage(HttpServletRequest  request,HttpServletRequest response)
	{
		log.info("转到后台管理页面.");
		return "admin/main";
	}
	
	@RequestMapping("/admin/articlemng.do")
	public String toArticleMngPage(HttpServletRequest  request,HttpServletRequest response)
	{
		log.info("转到文章管理页面.");
		
		return "admin/articlemng";
	}
}
