package com.sravan.controller;

import org.springframework.security.openid.OpenIDAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	 @RequestMapping("/login")
	    public String login() {
	        return "login";
	    }

	    @RequestMapping("/")
	    public String show(Model model, OpenIDAuthenticationToken authentication) {
	        model.addAttribute("authentication", authentication);
	        return "show";
	    }
}