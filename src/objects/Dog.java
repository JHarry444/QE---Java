package objects;

import objects.inheritance.Pet;

public class Dog extends Pet {

    public Dog() {

    }

    public Dog(String name, int age, String breed) {
        setName(name);
        setAge(age);
        setBreed(breed); // NOT the optimal way but fine for now
    }
    @Override // shows that this method is overriding another
    public void speak() {
        System.out.println("Woof");
    }


}
