package objects;

public class Dog {
    String name;
    int age;
    String breed;

    void bark() {
        System.out.println("Woof");
    }

    String getInfo() {
        return "My name is " + name  + " and I am a " + age + " years old " + breed;
    }
}
