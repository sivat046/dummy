package com.example.dummy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DummyController {
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(Model model)
    {
    	System.out.println("Update");
        model.addAttribute("message","Hello Siva");
        return "helloworld";
    }
}
