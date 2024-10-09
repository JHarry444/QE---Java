package objects;

public class Dog {
    private String name;
    private int age;
    private String breed;

    void bark() {
        System.out.println("Woof");
    }

    public String getInfo() {
        return "My name is " + name + " and I am a " + age + " years old " + breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age: " + age);
        }
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
