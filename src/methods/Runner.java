package methods;

import methods.demo.Calculator;
import methods.demo.Greeter;

public class Runner {

    public static void main(String[] args) {
        System.out.println("Calling greeting:");
        Greeter.greeting();
        Greeter.greeting();
        Greeter.greeting();
        System.out.println("Called greeting");

        System.out.println("Greeting myself");
        Greeter.greet("Jordan");
        System.out.println("Greeting my assistant");
        Greeter.greet("Cammy");
        System.out.println("Greeting the dogs");
        Greeter.greet("Doggos");

        System.out.println("2 + 2 = " + Calculator.add(2,2 ));

        System.out.println(Calculator.add(2,3 ) * Calculator.add(6, 7));

        int sum  = Calculator.add(9,9 );
        System.out.println("SUM: " + sum);
    }


}
