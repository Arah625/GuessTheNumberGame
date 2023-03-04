package Logic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game extends Methods {

    public Game(int numberRange) {
        boolean gameOneToTenIsRunning = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println(messages.menuGameRange(numberRange));
        while (gameOneToTenIsRunning) {
            int chooseGameSystem = playerInputValidator(scanner, messages.menuPlayOrLeave(), messages.wrongButtonMessage());
            switch (chooseGameSystem) {
                case 1:
                    oneTryMode(scanner, randomNumberSelector(numberRange));
                    break;
                case 2:
                    multipleTriesMode(scanner, randomNumberSelector(numberRange));
                    break;
                case 0:
                    System.out.println(messages.backToMainMenuMessage());
                    gameOneToTenIsRunning = false;
                    break;
            }
        }
    }

    public Game() throws InputMismatchException {
        boolean gameOneToTenIsRunning = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println(messages.menuGameRange(6));
        while (gameOneToTenIsRunning) {
            int chooseGameSystem = playerInputValidator(scanner, messages.menuPlayOrLeave(), messages.wrongButtonMessage());
            switch (chooseGameSystem) {
                case 1:
                    oneTryMode(scanner, randomRange(scanner));
                    break;
                case 2:
                    multipleTriesMode(scanner, randomRange(scanner));
                    break;
                case 0:
                    System.out.println(messages.backToMainMenuMessage());
                    gameOneToTenIsRunning = false;
                    break;
            }
        }
    }

}


