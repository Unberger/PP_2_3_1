package web.service;

import org.springframework.stereotype.Service;
import web.controller.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService{
    private List<Car> carList;
    {
        carList = new ArrayList<>();
        carList.add(new Car("Lada", "Lada", 1970));
        carList.add(new Car("BMW", "Bayerische Motoren Werke", 1916));
        carList.add(new Car("Toyota", "Toyota Motor Corporation", 1937));
        carList.add(new Car("Audi", "Audi", 1909));
        carList.add(new Car("UAZ", "Ulyanovsk Automobile Plant", 1941));
    }
    @Override
    public List<Car> getCar(int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
