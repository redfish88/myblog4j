package org.ya.blog.cmd;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.ya.blog.bo.MemberBO;
import org.ya.blog.orm.Member;

@Controller
public class LoginController{

	public LoginController() {
	}
	
	@Autowired
	private MemberBO memberBO;
	
	@RequestMapping("/admin/login.do")
	public String handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		String nickname = arg0.getParameter("nickname");
		String password = arg0.getParameter("pwd");
		if(nickname == null || nickname == "" || password == null || password == "")
		{
			return "redirect:/index.jsp";
		}
		Member instance = this.memberBO.userLogin(nickname, password);
		if(instance != null)
		{
			//登录验证成功
			HttpSession session = arg0.getSession();
			Cookie cookie = new Cookie("MyBlogOL",nickname);
			arg1.addCookie(cookie);
			session.setAttribute("MyBlogOL", instance);
			return "redirect:/admin/main.do";			
		}else
		{
			return "redirect:/index.jsp";
		}

	}

}
