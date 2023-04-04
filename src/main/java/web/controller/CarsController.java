package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiseImpl;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    private final CarService carService;
    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }
    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int count,ModelMap model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Tesla","Igor",100));
        cars.add(new Car("Mercedes","Kristina",200));
        cars.add(new Car("BMW","Max",300));
        cars.add(new Car("Bugatti","Alex",400));
        cars.add(new Car("Aston Martin","Oleg",500));
        model.addAttribute("cars", carService.getList(cars,count));
        return "cars";
    }
}
