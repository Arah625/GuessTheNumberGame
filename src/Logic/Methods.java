package Logic;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Methods {
    Random random = new Random();
    Messages menu = new Messages();

    public int randomNumber(int min, int max) {
        return random.nextInt((max - min) + 1) + min;
    }

    public int randomNumber1_10() {
        int min = 1;
        int max = 10;
        return random.nextInt((max - min) + 1) + min;
    }

    public int randomNumber1_20() {
        int min = 1;
        int max = 20;
        return random.nextInt((max - min) + 1) + min;
    }

    public int randomNumber1_30() {
        int min = 1;
        int max = 30;
        return random.nextInt((max - min) + 1) + min;
    }

    public int randomNumber1_40() {
        int min = 1;
        int max = 40;
        return random.nextInt((max - min) + 1) + min;
    }

    public int randomNumber1_50() {
        int min = 1;
        int max = 50;
        return random.nextInt((max - min) + 1) + min;
    }


    public void checkNumbersForOneTry(int computerNumber, int playerNumber) {
        if (playerNumber == computerNumber) {
            System.out.println(menu.congratulationsGuessedTheNumber());
        } else {
            System.out.println(menu.reachedMaximumNumberOfTriesAndNotGuessed(computerNumber));
        }
    }


    public int playerInputValidator(Scanner scan, String optionsMessage, String errorMessage) {
        while (true) {
            System.out.println(optionsMessage);
            try {
                return scan.nextInt();
            }
            catch (InputMismatchException exc) {
                System.out.println(errorMessage);
            }
            finally {
                scan.nextLine();
            }
        }
    }
    public void multipleTriesMode(Scanner scanner, int computerNumber){
        int guessCount =0;
        int playerNumber;
        int numberOfTries = playerInputValidator(scanner, menu.howManyTriesYouWantToHave(), menu.inputAmountOfTriesErrorMessage());
        System.out.println(menu.computerDrewNumberMessage());
        while (guessCount < numberOfTries) {
            guessCount++;
            playerNumber = playerInputValidator(scanner, menu.howManyGuessesUsed(guessCount, numberOfTries), menu.thatIsNotNumberErrorMessage());
            if (playerNumber == computerNumber) {
                System.out.println(menu.congratulationsGuessedTheNumber());
                break;
            }
            if (playerNumber != computerNumber && guessCount == numberOfTries) {
                System.out.println(menu.reachedMaximumNumberOfTriesAndNotGuessed(computerNumber));
            } else if (playerNumber != computerNumber) {
                System.out.println(menu.tryToGuessAgainMessage());
            }
        }
    }

    public void oneTryMode (Scanner scanner, int randomNumberRange){
        int playerNumber;
        int computerNumber;
        computerNumber = randomNumberRange;
        System.out.println(menu.computerDrewNumberMessage());
        playerNumber = playerInputValidator(scanner, menu.youHaveOnlyOneTryToGuessTheNumber(), menu.thatIsNotNumberErrorMessage());
        checkNumbersForOneTry(computerNumber, playerNumber);
    }



}
