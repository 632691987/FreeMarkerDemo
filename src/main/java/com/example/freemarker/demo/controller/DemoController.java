package com.example.freemarker.demo.controller;

import com.example.freemarker.demo.dto.Car;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DemoController {

  private static List<Car> carList = new ArrayList<>();

  static {
    carList.add(new Car("make1", "model1"));
    carList.add(new Car("make2", "model2"));
    carList.add(new Car("make3", "model3"));
    carList.add(new Car("make4", "model4"));
    carList.add(new Car("make5", "model5"));
  }

  @GetMapping(value = "/cars")
  public String init(ModelMap model) {
    model.addAttribute("carList", carList);
    return "index";
  }

  @PostMapping(value = "/add")
  public String addCar(@ModelAttribute("car") Car car) {
    if (null != car && null != car.getMake() && null != car.getModel() && !car.getMake().isEmpty() && !car.getModel().isEmpty()) {
      carList.add(car);
    }
    return "redirect:/cars";
  }

}
