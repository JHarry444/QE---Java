package objects;

import objects.inheritance.Pet;

public class Cat extends Pet {

    private int noOfLives = 9;

    public Cat() {

    }

    public Cat(String name, int age, String breed) {
        setName(name);
        setAge(age);
        setBreed(breed); // NOT the optimal way but fine for now
    }
    public void meow() {
        System.out.println("MROWR");
    }

    public int getNoOfLives() {
        return noOfLives;
    }

    public void setNoOfLives(int noOfLives) {
        this.noOfLives = noOfLives;
    }
}
