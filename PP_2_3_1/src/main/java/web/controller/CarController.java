package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImp;


@Controller
public class CarController {

    @Autowired
    private CarServiceImp carServiceImp;

    @GetMapping("/cars")
    public String showCar(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        model.addAttribute("tableCar", carServiceImp.getCar(count));
        return "cars";
    }
}
