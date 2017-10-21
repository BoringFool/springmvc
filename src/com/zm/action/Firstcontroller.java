package com.zm.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mvc")
public class Firstcontroller{

	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
}
