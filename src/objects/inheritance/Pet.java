package objects.inheritance;

public class Pet{

    private String name;
    private int age;
    private String breed;

    public Pet() {
        // default constructor
        // generated by java
    }

    public Pet(String name) {
        this.name = name;
    }

    // constructors have no type because they always create an
    // instance of the class they are in
    public Pet(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
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
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
