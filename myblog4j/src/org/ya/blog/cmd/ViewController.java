package org.ya.blog.cmd;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

	public ViewController() {
	}

	@RequestMapping("/index.do")
	public String index(HttpServletRequest  request,HttpServletRequest response)
	{
		
		return "";
	}
}
