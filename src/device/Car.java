package device;

public class Car extends Device {
    String color;
    Double mileage;
    Boolean ison;

    public Car(String brand, String model) {
        super(brand, model);
    }
}