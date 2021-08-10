package com.jda.the_code.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {

	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}

	@RequestMapping(value="/guess", method=RequestMethod.POST)
	public String guess(@RequestParam(value="code") String code,
			RedirectAttributes redirectAttributes, HttpSession session) {
		if(code.equals("bushido")){
			session.setAttribute("code", "bushido");
			return "redirect:/code";
		}
		else {
			redirectAttributes.addFlashAttribute("error", "You must train harder!");
			return "redirect:/";
		}
	}
	
	@RequestMapping("/code")
	public String code(HttpSession session) {
		if(session.getAttribute("code") != null) {
			if(session.getAttribute("code").equals("bushido")) {
				return "code.jsp";			
			}
			else {
				return "redirect:/";
			}			
		}
		else {
			return "redirect:/";
		}
	}
}