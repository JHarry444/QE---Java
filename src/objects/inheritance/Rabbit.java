package objects.inheritance;

public class Rabbit extends Pet {



     public Rabbit() {
         super();
         // Pet();
     }

    @Override
    public void speak() {
        System.out.println("Nibble Nibble");
    }
}
