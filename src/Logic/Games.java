package Logic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Games extends Methods {

    Methods methods = new Methods();
    Messages messages = new Messages();


    public void game1_10() throws InputMismatchException {
        boolean gameOneToTenIsRunning = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println(messages.menuGameRange(1));
        while (gameOneToTenIsRunning) {
            int chooseGameSystem = methods.playerInputValidator(scanner, messages.menuPlayOrLeave(), messages.wrongButtonMessage());
            switch (chooseGameSystem) {
                case 1:
                    methods.oneTryMode(scanner, methods.randomNumber1_10());
                    break;
                case 2:
                    methods.multipleTriesMode(scanner, methods.randomNumber1_10());
                    break;
                case 0:
                    System.out.println(messages.backToMainMenuMessage());
                    gameOneToTenIsRunning = false;
                    break;
            }
        }
    }

    public void game1_20() throws InputMismatchException {
        boolean gameOneToTenIsRunning = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println(messages.menuGameRange(2));
        while (gameOneToTenIsRunning) {
            int chooseGameSystem = methods.playerInputValidator(scanner, messages.menuPlayOrLeave(), messages.wrongButtonMessage());
            switch (chooseGameSystem) {
                case 1:
                    methods.oneTryMode(scanner, methods.randomNumber1_20());
                    break;
                case 2:
                    methods.multipleTriesMode(scanner, methods.randomNumber1_20());
                    break;
                case 0:
                    System.out.println(messages.backToMainMenuMessage());
                    gameOneToTenIsRunning = false;
                    break;
            }
        }
    }

    public void game1_30() throws InputMismatchException {
        boolean gameOneToTenIsRunning = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println(messages.menuGameRange(3));
        while (gameOneToTenIsRunning) {
            int chooseGameSystem = methods.playerInputValidator(scanner, messages.menuPlayOrLeave(), messages.wrongButtonMessage());
            switch (chooseGameSystem) {
                case 1:
                    methods.oneTryMode(scanner, methods.randomNumber1_30());
                    break;
                case 2:
                    methods.multipleTriesMode(scanner, methods.randomNumber1_30());
                    break;
                case 0:
                    System.out.println(messages.backToMainMenuMessage());
                    gameOneToTenIsRunning = false;
                    break;
            }
        }
    }

    public void game1_40() throws InputMismatchException {
        boolean gameOneToTenIsRunning = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println(messages.menuGameRange(4));
        while (gameOneToTenIsRunning) {
            int chooseGameSystem = methods.playerInputValidator(scanner, messages.menuPlayOrLeave(), messages.wrongButtonMessage());
            switch (chooseGameSystem) {
                case 1:
                    methods.oneTryMode(scanner, methods.randomNumber1_40());
                    break;
                case 2:
                    methods.multipleTriesMode(scanner, methods.randomNumber1_40());
                    break;
                case 0:
                    System.out.println(messages.backToMainMenuMessage());
                    gameOneToTenIsRunning = false;
                    break;
            }
        }
    }

    public void game1_50() throws InputMismatchException {
        boolean gameOneToTenIsRunning = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println(messages.menuGameRange(5));
        while (gameOneToTenIsRunning) {
            int chooseGameSystem = methods.playerInputValidator(scanner, messages.menuPlayOrLeave(), messages.wrongButtonMessage());
            switch (chooseGameSystem) {
                case 1:
                    methods.oneTryMode(scanner, methods.randomNumber1_50());
                    break;
                case 2:
                    methods.multipleTriesMode(scanner, methods.randomNumber1_50());
                    break;
                case 0:
                    System.out.println(messages.backToMainMenuMessage());
                    gameOneToTenIsRunning = false;
                    break;
            }
        }
    }

    public void gamePlayerRange() throws InputMismatchException {
        boolean gameOneToTenIsRunning = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println(messages.menuGameRange(6));
        while (gameOneToTenIsRunning) {
            int chooseGameSystem = methods.playerInputValidator(scanner, messages.menuPlayOrLeave(), messages.wrongButtonMessage());
            switch (chooseGameSystem) {
                case 1:
                    methods.oneTryMode(scanner, methods.randomRange(scanner));
                    break;
                case 2:
                    methods.multipleTriesMode(scanner, methods.randomRange(scanner));
                    break;
                case 0:
                    System.out.println(messages.backToMainMenuMessage());
                    gameOneToTenIsRunning = false;
                    break;
            }
        }
    }

}


