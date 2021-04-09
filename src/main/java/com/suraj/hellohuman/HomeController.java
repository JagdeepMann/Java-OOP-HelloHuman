package com.suraj.hellohuman;

// Create an application that will render a page with either a default value of "human" or with the name provided in the URL query string.

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HomeController {
    @RequestMapping("/")
    public String index(@RequestParam(value="name", required=false) String searchQuery) {
        if(searchQuery != null) {
        	return "Hello " + searchQuery +" Welcome to SpringBoot!";
        }
        else {
        	return "Hello Human " +" Welcome to SpringBoot!";
        }
    
    }
}