package conditionals;

public class Runner {

    public static void main(String[] args) {
        if (false) {
            System.out.println("IF");
        } else if (false) {
            System.out.println("ELSE IF");
        } else {
            System.out.println("ELSE");
        }

        int num = 111;

        if (num % 2 == 0) {
            System.out.println("IS EVEN");
        } else if (num < 100) {
            System.out.println("LESS THAN HUNDRED");
        } else {
            System.out.println("NEITHER EVEN NOR UNDER A HUNDRED");
        }

        int num2 = 7;

        if (num2 % 2 == 1  || num2 < 10) {
            System.out.println("NUM2 is ODD OR less than 10");
        }

        if (num2 % 2 == 1 && num2 < 10) {
            System.out.println("NUM2 is ODD AND less than 10");
        }



    }
}
