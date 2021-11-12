package com.eventosapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
// mostrando p spring boot que essa aba é um controller
@Controller
public class IndexController {
	
	
	@RequestMapping("/") // quando o usuario digitar essa requisição, o controller irá redirecionar á essa página index
	//criando um método
	public String index() {
			return "index";
	}
}
