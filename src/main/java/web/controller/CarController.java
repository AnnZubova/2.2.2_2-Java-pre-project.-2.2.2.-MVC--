package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.servise.CarServiceImpl;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCarNew(@RequestParam(defaultValue = "5") Integer count, ModelMap model) {
        CarServiceImpl carsServiceImpl = new CarServiceImpl();
        List<Car> myCar = carsServiceImpl.printCar(count);
        model.addAttribute("cars", myCar);
        return "cars";
    }
}
