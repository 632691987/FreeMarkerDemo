package com.example.freemarker.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("common")
public class StudyController {

  @GetMapping("case1")
  public String case1Method(ModelMap modelMap) {
    modelMap.addAttribute("user", "vincent");
    return "case1";
  }

}
