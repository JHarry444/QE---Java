package loops;

public class Coins {


    public static void main(String[] args) {
        change(556, 1_000);
    }

    public static void change(int cost, int amount) {
        int change = amount - cost;


        int fiveP = 0;
        int twoP = 0;
        int oneP = 0;

        // subtract five pences from the change until I can't any more
        while (change >= 5) {
            change = change - 5;
            fiveP++;
        }

        while (change >= 2) {
            change = change - 2;
            twoP++;
        }

        while (change >= 1) {
            change = change - 1;
            oneP++;
        }

        System.out.println("5p: " + fiveP);
        System.out.println("2p: " + twoP);
        System.out.println("1p: " + oneP);
    }
}
