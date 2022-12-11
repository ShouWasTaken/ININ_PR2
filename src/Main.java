import device.Car;
import device.Phone;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("canis");
        dog.name = "Szarik";
        //     dog.isAlive = true;

        //   System.out.println("Zwierze nazywa sie " + dog.name);
        //     System.out.println(dog.isAlive);

        //    System.out.println(dog.weight);
        //    dog.feed();
        //    System.out.println(dog.weight);




        Human bro = new Human(1888);
        System.out.println(bro.yearOfBirth);
        Human sister = new Human(1990);
        System.out.println(sister.yearOfBirth);

        bro.pet = dog;
        System.out.println(bro.pet.name);

        Car auto3 = new Car("Nissan", "Patrol");
        Car auto4 = new Car("Nissan", "Patrol");
        Car auto5 = new Car("Audi","A4");
        Phone phone1 = new Phone("Samsung", "A10");




    }
}