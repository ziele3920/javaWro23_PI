package PrimeNumbers;

import java.util.List;

public class PrimeMain {
    public static void main(String[] args) {
        PrimeCalculator primeCalculator = new PrimeCalculator();
        System.out.println(primeCalculator.isPrime(5));
        List<Integer> list = primeCalculator.getPrimeNumbers(99);
        for(int i : list) {
            System.out.print(i + " ");
        }

    }
}
