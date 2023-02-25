import Logic.Messages;
import Logic.Methods;
import Logic.Games;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Methods methods = new Methods();
        Messages messages = new Messages();
        Games randomOneToTen = new Games();
        System.out.println(messages.welcomeMessage());

        Scanner scanner = new Scanner(System.in);

        boolean gameIsRunning = true;

        while (gameIsRunning) {


            int chooseGameType = methods.playerInputValidator(scanner, messages.mainMenu(), messages.wrongButtonMessage());

            switch (chooseGameType) {
                case 1:
                    randomOneToTen.game1_10();
                    break;
                case 2:
                    randomOneToTen.game1_20();
                    break;
                case 3:
                    randomOneToTen.game1_30();
                    break;
                case 4:
                    randomOneToTen.game1_40();
                    break;
                case 5:
                    randomOneToTen.game1_50();
                    break;
                case 6:
//                    randomOneToTen.game1_0();
                    break;
                case 0:
                    System.out.println(messages.exitGame());
                    gameIsRunning = false;
                    break;
            }
        }
    }
}