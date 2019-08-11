package GuessingGame;

import java.util.Random;
import java.util.Scanner;

public class MainGuessingGame {

    private static final int upperBound = 100;

    public static void main(String[] args) {
        Random random = new Random();
        int randNumber = random.nextInt(upperBound);
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 7; ++i) {
            int playerNumber = scanner.nextInt();
            if(playerNumber == randNumber) {
                System.out.println("Win!!");
                return;
            }
            if(playerNumber < randNumber)
                System.out.println("ZA MALO");
            else
                System.out.println("ZA DUZO");
        }
        System.out.println(randNumber);
    }
}
