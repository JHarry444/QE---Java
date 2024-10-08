package variables;

public class Runner {
    public static void main(String[] args) {
        int x = 27;
        System.out.println();

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);

        boolean bool = false;
        byte b = 12;
        short s = 112;
        int i = 256;
        long l = 23432433453545345L;
        float f = 12.9F;
        double d = 43453453.434535;
        char c = 'J';
        String string = "Jordan Harrison";

        System.out.println('j' == 'J');
        System.out.println(l);
        System.out.println(f);
        System.out.println(999_999_999);
        System.out.println("999_999_999");
        System.out.println(5 / 2F);

        i = i + 1;

        System.out.println(i);

        i++;
        System.out.println(i);

        System.out.println(i++);
        System.out.println(++i);

        System.out.println('a' + 'b');
        // concatenating two strings to make one big one
        System.out.println("a" + "b");
        System.out.println("a" + 'b');

        int z = 99;

        System.out.println("Z: " + z);
        System.out.println(z++);
        System.out.println("Z: " + z);
        System.out.println(++z);
        System.out.println("Z: " + z);

    }
}
