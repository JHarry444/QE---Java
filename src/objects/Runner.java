package objects;

public class Runner {


    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "Basil";
        d.age = 3;
        d.breed = "Mini Dachshund";

        System.out.println("Name: " + d.name);
        System.out.println("Age: " + d.age);
        System.out.println("Breed: " + d.breed);

        Dog d2 = new Dog();
        d2.name = "Rex";
        d2.age = 8;
        d2.breed = "German Shepherd";

        System.out.println("Name: " + d2.name);
        System.out.println("Age: " + d2.age);
        System.out.println("Breed: " + d2.breed);

        d.bark();
        d2.bark();

        System.out.println(d.getInfo());
        System.out.println(d2.getInfo());
        int a = 0;

        System.out.println(a);

        {
            System.out.println(a);

            int b = 0;
        }

//        System.out.println(b); Can't access b as it's decalred inside the {}
        int i = 0;
//        int i = 0; can't have two variables with the same name in scope
        for (int j = 0; j < 1; j++) {

        }

        for (int j = 0; j < 1; j++) {

        }

//        System.out.println(j); j is created inside the loop so can only be accessed in there
    }
}
