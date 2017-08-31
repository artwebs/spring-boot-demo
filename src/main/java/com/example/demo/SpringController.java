package com.example.demo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class SpringController{
  @RequestMapping("/")
  @ResponseBody
  String home(){
    return "Hello world";
  }

}
