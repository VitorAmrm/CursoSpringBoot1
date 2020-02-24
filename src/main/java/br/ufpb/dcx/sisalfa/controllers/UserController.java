package br.ufpb.dcx.sisalfa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import br.ufpb.dcx.sisalfa.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService serviceUse;
	
	@RequestMapping("/user")
	public String getUsers(Model model) {
		model.addAttribute("usersList", this.serviceUse.findAll());  			
		return "user";
	}

}
