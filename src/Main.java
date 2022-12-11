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

        Car auto = new Car("Audi", "RS3");
        auto.color = "Black";
        auto.mileage = 264000.4;
        auto.ison = true;


        System.out.println("Marka to " + auto.brand);
        System.out.println("Model to " + auto.model);
        System.out.println("Kolor to " + auto.color);
        System.out.println("Przebieg to " + auto.mileage);
        System.out.println("Czy jest odpalone " + auto.ison);

        Car auto2 = new Car("Merc", "A45s");
        auto2.color = "Yellow";
        auto2.mileage = 2640.5;
        auto2.ison = false;


        System.out.println("Marka to " + auto2.brand);
        System.out.println("Model to " + auto2.model);
        System.out.println("Kolor to " + auto2.color);
        System.out.println("Przebieg to " + auto2.mileage);
        System.out.println("Czy jest odpalone " + auto2.ison);


        Human bro = new Human(1888);
        System.out.println(bro.yearOfBirth);
        Human sister = new Human(1990);
        System.out.println(sister.yearOfBirth);

        bro.pet = dog;
        System.out.println(bro.pet.name);

        Car auto3 = new Car("Nissan", "Patrol");
        Car auto4 = new Car("Nissan", "Patrol");

        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();




    }
}