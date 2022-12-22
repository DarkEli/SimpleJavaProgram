import java.util.Random;

public class RollingDice {

    public static void main(String[] args) {
        System.out.println("Elliott Au");

        Random RanNumber = new Random();
        int a = RanNumber.nextInt(6);

        System.out.println("You rolled a " + a);
    }
}
