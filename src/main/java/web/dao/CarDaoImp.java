package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao{

    @Override
    public  List<Car> getList(int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Tesla","Igor",100));
        cars.add(new Car("Mercedes","Kristina",200));
        cars.add(new Car("BMW","Max",300));
        cars.add(new Car("Bugatti","Alex",400));
        cars.add(new Car("Aston Martin","Oleg",500));
        if (count > 5) {count = 5;}

        return cars.subList(0,count);
    }
}
