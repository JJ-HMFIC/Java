package ch14.sec00;

public class Bridge {
    int counter;
    String name;
    String address;

    public Bridge() {
        this.counter = 0 ;
        this.name = "아무개";
        this.address = "모름";
    }
    synchronized public void across(String name, String address) {
        counter++;
        this.name = name;
        this.address = address;
        check();
    }

    private void check() {
        if (name.charAt(0) != address.charAt(0)) {
            System.out.println("문제 발생!!! " + this); // this-> 이 객체의 toString 호출
        }
    }

    @Override
    public String toString() {
        return "Bridge{" +
                "counter=" + counter +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
