package ch06.sec09;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car("포르쉐");
        Car yourCar = new Car("벤츠");

        myCar.setSpeed(100);
        yourCar.setSpeed(100);

        myCar.run();
        yourCar.run();
    }
}
