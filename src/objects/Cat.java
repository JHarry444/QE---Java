package objects;

import objects.inheritance.Pet;

public class Cat extends Pet {

    private int noOfLives = 9;

    public Cat() {
        super();
    }

    public Cat(String name, int age, String breed) {
        super(name, age, breed);
    }

    public Cat(String name, int age, String breed, int noOfLives) {
        super(name, age, breed); // HAS to be first line in every constructor
        this.noOfLives = noOfLives;
//        setName(name);
//        setAge(age);
//        setBreed(breed); // NOT the optimal way but fine for now
    }

    public String getInfo() {
        return "My name is " + getName() + " and I am a " + getAge() + " years old " + getBreed()
                + " with " + noOfLives +" lives left";
    }

    @Override
    public String toString() {
        return "My name is " + getName() + " and I am a " + getAge() + " years old " + getBreed()
                + " with " + noOfLives +" lives left";
    }
    @Override
    public void speak() {
        System.out.println("MROWR");
    }

    public int getNoOfLives() {
        return noOfLives;
    }

    public void setNoOfLives(int noOfLives) {
        this.noOfLives = noOfLives;
    }
}
