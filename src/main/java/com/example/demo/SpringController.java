package com.example.demo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class SpringController{
	@RequestMapping("/")
	@ResponseBody
  String home(){
    return "Hello world";
  }

  public static void main(String[] args) throws Exception {
    SpringApplication.run(SpringController.class,args);
  }
}
