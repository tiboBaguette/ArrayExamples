package be.vdab;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] lijst = new int[10];
        Random generator1 = new Random();

        for (int i = 0; i < 10 ; i++) {
            lijst[i] = generator1.nextInt(100);
            System.out.print(lijst[i] + ", ");
        }

        int min1 = 999999;
        int min2 = 999999;
        int currentNumber;

        for (int i = 0; i < lijst.length; i++) {
            currentNumber = lijst[i] ;

            if (currentNumber < min1) {
                min2 = min1;
                min1 = currentNumber;
            } else if (currentNumber < min2) {
                min2 = currentNumber;
            }
        }

        System.out.println("\nMin1 = " + min1 + ", Min2 = " + min2);
    }
}
