package web.servise;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {

    private static int CAR_COUNT;
    @Override
    public List<Car> printCar(Integer count) {
        List<Car> printCar;
        {
            printCar = new ArrayList<>();
            printCar.add(new Car(++CAR_COUNT, "CRV", "3"));
            printCar.add(new Car(++CAR_COUNT, "Mazda ", "b"));
            printCar.add(new Car(++CAR_COUNT, "Toyota Camry", "XV10"));
            printCar.add(new Car(++CAR_COUNT, "Lada Niva", "2121"));
            printCar.add(new Car(++CAR_COUNT, "Opel Astra", "F"));

        }
        return printCar.stream().limit(count).collect(Collectors.toList());
    }
}
