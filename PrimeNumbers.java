package be.vdab;

public class PrimeNumbers {
    public static void main(String[] args) {
        boolean primeNumber = true;
        for (int i = 2; i < 50; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primeNumber = false;
                }
            }
            if (primeNumber) {
                System.out.print(i + ", ");
            } else {
                primeNumber = true;
            }
        }
    }
}
