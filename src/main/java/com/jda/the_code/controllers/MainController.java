package com.jda.the_code.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {

	@RequestMapping("/")
	public String index() {
		return "idx.jsp";
	}

	@RequestMapping(value="/submit", method=RequestMethod.POST)
	public String submit(@RequestParam(value="name") String name, 
			@RequestParam(value="location") String location,
			@RequestParam(value="language") String language,
			@RequestParam(value="comment") String comment, 
			HttpSession session) {
		session.setAttribute("name", name);
		session.setAttribute("location", location);
		session.setAttribute("language", language);
		session.setAttribute("comment", comment);
		return "redirect:/result";
	}
	
	@RequestMapping("/result")
	public String result() {
		return "result.jsp";
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