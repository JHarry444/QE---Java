package loops;

import conditionals.solution.FizzBuzz;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.println("I: "+ i);
        }

        for (int i = 1; i <= 15 ; i++) {
            System.out.println(FizzBuzz.fizzBuzz(i));
        }
        // i += 5 -> i = i + 5
        for (int i = 5; i < 101; i = i + 5) {
            System.out.println("I: " + i);
        }

        for (int i = 100; i >=0; i--) {
            if (i % 10 == 0) {
                continue; // skip every multiple of 10
            } else if (i < 40) {
                break; // stop under 40
            }
            System.out.println("I: "+ i);
        }

        Scanner scan = new Scanner(System.in);

        Integer num = null; // null -> no value
//        int i = null; ints CANNOT be null
//        while (num == null || num < 1 || num > 10) {
//            System.out.println("Please enter a number from 1 -> 10");
//
//            num = Integer.parseInt(scan.nextLine());
//
//            if (num < 1 || num > 10) {
//                System.out.println("Invalid num: " + num);
//            }
//        }

        do {
            System.out.println("Please enter a number from 1 -> 10");

            num = Integer.parseInt(scan.nextLine());

            if (num < 1 || num > 10) {
                System.out.println("Invalid num: " + num);
            }
        } while (num < 1 || num > 10);
    }
}
