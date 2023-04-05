package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.List;

@Repository
public class CarDaoImp implements CarDao{
    @Override
    public  List<Car> getList(List<Car> cars, int count) {
        if (count > 5) {count = 5;}
        return cars.subList(0,count);
    }
}
