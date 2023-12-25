package web.servise;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {

    private static int CAR_COUNT;
    private final List<Car> cars = new ArrayList<>();;
    {
        cars.add(new Car(++CAR_COUNT, "BMW", "3"));
        cars.add(new Car(++CAR_COUNT, "Mazda ", "b"));
        cars.add(new Car(++CAR_COUNT, "Toyota Camry", "XV10"));
        cars.add(new Car(++CAR_COUNT, "Lada Niva", "2121"));
        cars.add(new Car(++CAR_COUNT, "Opel Astra", "F"));

    }

    @Override
    public List<Car> printCar(Integer count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
