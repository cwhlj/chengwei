package com.chengwei.action;

import com.chengwei.entity.User;
import com.chengwei.service.IUserService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by chengwei on 2016/12/12 14:26.
 */
public class UserAction {
	@Resource
	private IUserService userService;

	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model){
		int userId = Integer.parseInt(request.getParameter("id"));
		User user = this.userService.getUserById(userId);
		model.addAttribute("user", user);
		return "showUser";
	}

	@RequestMapping("/login")
	public String login(HttpServletRequest request) throws Exception{
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		String userName = request.getParameter("name");
		String password = request.getParameter("password");
		User user = userService.login(userName, password);
		if(user==null){
			request.setAttribute("user", user);
			request.setAttribute("errorMsg", "用户名或密码错误！");
			return "login";
		}else{
			session.setAttribute("user", user);
			return "main";
		}
	}
}
