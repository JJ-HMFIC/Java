package ch06.sec06.exam05;

public class CarExample {
    public static void main(String[] args) {
        Car car1 = new Car("현대자동차");
        Car car2 = new Car("현대자동차","자가용");
        Car car3 = new Car("현대자동차","자가용","빨강");
        Car car4 = new Car("현대자동차","자가용","빨강",200);


        System.out.println("car1.company : " + car1.company);
        System.out.println();
        System.out.println("car2.company : " + car2.company);
        System.out.println("car2.model : " + car2.model);
        System.out.println();
        System.out.println("car3.company : " + car3.company);
        System.out.println("car3.model : " + car3.model);
        System.out.println("car3.color : " + car3.color);
        System.out.println();
        System.out.println("car4.company : " + car4.company);
        System.out.println("car4.model : " + car4.model);
        System.out.println("car4.color : " + car4.color);
        System.out.println("car4.speed : " + car4.speed);


    }
}
