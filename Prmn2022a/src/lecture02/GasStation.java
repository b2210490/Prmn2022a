package lecture02;

import lecture02.Car;

public class GasStation {
    void refuel(Car car) {
        car.fuel += 20;
        System.out.println("給油したことによりfuelが20増えました。");
    }
}
