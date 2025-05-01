package ch06.sec06.exam05;

public class Car {
    String company;
    String model;
    String color;
    int speed;

    public Car(String company) {
        this.company = company;
    }

    public Car(String company, String model) {
        this.company = company;
        this.model = model;
    }

    public Car(String company, String color, String model) {
        this.company = company;
        this.color = color;
        this.model = model;
    }

    public Car(String company, String model, String color, int speed) {
        this.company = company;
        this.model = model;
        this.color = color;
        this.speed = speed;
    }




}
