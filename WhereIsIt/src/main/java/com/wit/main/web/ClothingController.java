package com.wit.main.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClothingController {

	@RequestMapping("clothingWhere")
	public String clothingWhere () {
		return "viewpage/clothingWhere";
	}
	
}
