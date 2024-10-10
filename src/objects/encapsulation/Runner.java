package objects.encapsulation;

import objects.Cat;
import objects.Dog;

public class Runner {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.setAge(-12);
//        d.name = "Barry";
//        d.breed = "?";
        System.out.println(d.getInfo());

//        Cat c = new Cat();
        Cat c = new Cat("Fluffy", 12, "Siamese");
//        c.setAge(12);
//        c.setBreed("Siamese");
//        c.setName("Fluffy");

        c.speak();

        System.out.println(c.getInfo());




    }
}
