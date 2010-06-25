package org.ya.blog.cmd;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProfileController {

	protected Logger log = Logger.getLogger(this.getClass());
	
	public ProfileController() {
	}

	@RequestMapping("/admin/profile.do")
	public String toAdminMainPage(HttpServletRequest  request,HttpServletRequest response)
	{
		log.info("转到个人信息管理页面.");
		return "admin/profile";
	}
}
