import device.Car;

public class Human extends Animal {
    String firstname;
    String lastname;
    final Integer yearOfBirth;
    Car car;
    Animal pet;

    Human(Integer yearOfBirth){
        super("homo sapiens");
        this.yearOfBirth = yearOfBirth;
    }
}