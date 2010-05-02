package org.ya.blog.cmd;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class ForwardController extends MultiActionController {

	public ForwardController() {
	}

	public ModelAndView toAdminLoginPage(HttpServletRequest  request,HttpServletRequest response)
	{
		System.out.println("转到登录页.");
		return new ModelAndView("admin/main");
	}
}
