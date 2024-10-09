package conditionals.solution;

public class FizzBuzz {


    public static String fizzBuzz(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";
        } else if (num % 3 == 0) {
            return "Fizz";
        } else if (num % 5 == 0) {
            return "Buzz";
        } else {
            return  "" + num;
        }

//        System.out.println("HELLO!");
    }


    public static void main(String[] args) {
        System.out.println(fizzBuzz(1));
        System.out.println(fizzBuzz(2));
        System.out.println(fizzBuzz(3));
        System.out.println(fizzBuzz(4));
        System.out.println(fizzBuzz(5));
        System.out.println(fizzBuzz(6));
        System.out.println(fizzBuzz(7));
        System.out.println(fizzBuzz(8));
        System.out.println(fizzBuzz(9));
        System.out.println(fizzBuzz(10));
        System.out.println(fizzBuzz(11));
        System.out.println(fizzBuzz(12));
        System.out.println(fizzBuzz(13));
        System.out.println(fizzBuzz(14));
        System.out.println(fizzBuzz(15));
    }
}
