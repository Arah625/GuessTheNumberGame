import Logic.Messages;
import Logic.Methods;
import Logic.Game;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Methods methods = new Methods();
        Messages messages = new Messages();
        System.out.println(messages.welcomeMessage());

        Scanner scanner = new Scanner(System.in);

        boolean gameIsRunning = true;

        while (gameIsRunning) {

            int chooseGameType = methods.playerInputValidator(scanner, messages.mainMenu(), messages.wrongButtonMessage());

            switch (chooseGameType) {
                case 1:
                    new Game(1);
                    break;
                case 2:
                    new Game(2);
                    break;
                case 3:
                    new Game(3);
                    break;
                case 4:
                    new Game(4);
                    break;
                case 5:
                    new Game(5);
                    break;
                case 6:
                    new Game();
                    break;
                case 0:
                    System.out.println(messages.exitGame());
                    gameIsRunning = false;
                    break;
            }
        }
    }
}