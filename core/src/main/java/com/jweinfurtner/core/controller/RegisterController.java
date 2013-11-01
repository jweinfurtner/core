/**
 * 
 */
package com.jweinfurtner.core.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jweinfurtner.core.form.RegisterForm;

@Controller
@RequestMapping(value = "/register")
public class RegisterController {

	@RequestMapping(method = RequestMethod.GET)
	public String getRegister(Model model) {

		return "register";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String register(Model model, @Valid RegisterForm registerForm,
			BindingResult bindingResult) {

		return "";
	}
}
