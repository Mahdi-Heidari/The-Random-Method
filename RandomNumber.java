package randomnumber;

import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {

        Random random = new Random();
        System.out.println("Ranodm number between:\n");

        // Returns a ranodm number between 0-9 including both.
        System.out.print("0-9 including both:\t\t");
        System.out.println((int) (random.nextDouble() * 10));
//        System.out.println(random.nextInt(10));

        // Returns a ranodm number between 0-9 excluding 9.
        System.out.print("0-9 excluding 9:\t\t");
        System.out.println((int) (random.nextDouble() * 9));
//        System.out.println(random.nextInt(9));

        // Returns a ranodm number between 0-26 indcluding 26.
        System.out.print("0-26 indcluding 26:\t\t");
        System.out.println((int) (1 + random.nextDouble() * 27));

//        Returns a random number between 20-36 excluding 20.
        System.out.print("20-36 excluding 20:\t\t");
        System.out.println((int) (21 + random.nextDouble() * 17));

//        Returns a random number between 0.0-9.9  including both.
        System.out.print("0.0-9.9 including both:\t\t");
        double randomNumber1 = random.nextDouble() * 10;
        System.out.printf("%.1f\n", randomNumber1);

//        Returns a random number between 1.1-26.5 excluding both.
        System.out.print("1.1-26.5 excluding both:\t");
        double randomNumber2 = 1.2 + random.nextDouble() * 25.4;
        System.out.printf("%.1f\n", randomNumber2);

//        Returns a random number between 0.0-98.9 including 98.9.
        System.out.print("0.0-98.9 including 98.9:\t");
        double randomNumber3 = random.nextDouble() * 99;
        System.out.printf("%.1f\n", randomNumber3);

    }

}
