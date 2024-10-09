package objects.encapsulation;

import objects.Dog;

public class Runner {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.setAge(-12);
        d.name = "Barry";
//        d.breed = "?";
        System.out.println(d.getInfo());
    }
}
