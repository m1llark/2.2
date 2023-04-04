package web.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiseImpl implements CarService{
    @Override
    public  List<Car> getList(List<Car> cars, int count) {
        if (count > 5) {count = 5;}
        return cars.subList(0,count);
    }
}
