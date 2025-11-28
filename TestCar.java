class Car {
    String model;
    int year;

    void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

public class TestCar {
    public static void main(String[] args) {

        Car c = new Car();
        c.model = "BMW";
        c.year = 2022;

        c.displayInfo();
    }
}
