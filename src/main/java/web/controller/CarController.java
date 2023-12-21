package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.servise.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private final CarServiceImpl carServ;
    @Autowired
    public CarController(CarServiceImpl carServ) {
        this.carServ = carServ;
    }
    @GetMapping("/cars")
    public String printCarNew(@RequestParam(defaultValue = "5") int count, ModelMap model) {
        List<Car> car = carServ.printCar(count);
        model.addAttribute("cars", car);
        return "cars";
    }
}
