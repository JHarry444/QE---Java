package objects.poly;

import objects.Cat;
import objects.Dog;
import objects.inheritance.Pet;

public class Runner {

    public static void main(String[] args) {
        Dog d = new Dog("Basil", 3, "Dachshund");

        Cat c = new Cat("Felix",30, "Black and White");

        d.speak();

        c.speak();
        Pet p = new Pet();
    }
}
