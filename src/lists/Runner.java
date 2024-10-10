package lists;

import objects.Cat;
import objects.Dog;
import objects.inheritance.Pet;

import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(2); // 0
        nums.add(4); // 1
        nums.add(6); // 2
        nums.add(8); // 3
        nums.add(10); // 4

        System.out.println(nums);

        System.out.println(nums.get(0));
        System.out.println(nums.get(nums.size() - 1));

        nums.remove(0);

        System.out.println(nums);

        ArrayList<String> names = new ArrayList<>();

        names.add("Jordan");
        names.add("Cameron");

        System.out.println(names);

        names.add(1, "Shafeeq");

        System.out.println(names);

        names.remove("Jordan");

        System.out.println(names);

        names.remove(0);

        System.out.println(names);

        ArrayList<Integer> num2 = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            num2.add(i * 10);
        }

        System.out.println(num2);

        for (int i = 0; i < num2.size(); i++) {
            System.out.println(i + ": " + num2.get(i));
        }


        ArrayList<Pet> pets = new ArrayList();

        pets.add(new Cat("Fluffy", 12, "Siamese"));
        pets.add(new Dog("Rex", 6, "Alsatian"));

        for (int i = 0; i < pets.size(); i++) {
            Pet pet = pets.get(i);

            System.out.println(pet.getInfo());
        }

        System.out.println(pets);
    }
}
