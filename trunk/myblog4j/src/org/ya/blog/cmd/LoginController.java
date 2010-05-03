package org.ya.blog.cmd;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LoginController implements Controller {

	public LoginController() {
	}

	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		String nickname = arg0.getParameter("nickname");
		String password = arg0.getParameter("pwd");
		if(nickname == null || nickname == "" || password == null || password == "")
		{
			return new ModelAndView("../../admin/login");
		}
		HttpSession session = arg0.getSession();
		Cookie cookie = new Cookie("BlogOL",nickname);
		arg1.addCookie(cookie);
//		session.setAttribute("BlogOL", );
		return new ModelAndView("admin/main");
	}

}
