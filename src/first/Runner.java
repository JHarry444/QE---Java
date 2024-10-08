package first;

public class Runner {

    // will not run as it is not the 'main' set of instructions
    public static void matt() {
        // printing out words
        System.out.println("Hello");
        System.out.println("Matt");
        System.out.println("!");
    }

    public static void main(String[] args) {
        // printing out words
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("!");

        cammy();
        matt();
    }



    public static void cammy() {
        // printing out words
        System.out.println("Hello");
        System.out.println("Cammy");
        System.out.println("!");
    }
}
