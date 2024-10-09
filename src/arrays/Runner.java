package arrays;

public class Runner {

    public static void main(String[] args) {
        String[] names = {"Jordan", "Cameron", "Matt", "Tom", "Agata", "Rourke"};

        System.out.println("0: " + names[0]);
        System.out.println("1: " + names[1]);
        System.out.println("2: " + names[2]);

        for (int i = 0; i < names.length; i++) {
            System.out.println(i + ": " + names[i]);
        }

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("NUMS[2]: " + nums[2]);
        nums[2] = nums[2] * 2;
        System.out.println("NUMS[2]: " + nums[2]);

        // makes a default array of length
        int[] blank = new int[10];

        for (int i = 0; i < blank.length; i++) {
            System.out.println("I: " + blank[i]);
        }
    }
}
