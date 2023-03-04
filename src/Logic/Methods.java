package Logic;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Methods extends RandomNumber {
    Random random = new Random();
    Messages messages = new Messages();


    public int randomNumberSelector(int rangeNumber) {
        int rndNbr = 0;
        switch (rangeNumber) {
            case 1:
                rndNbr = randomNumber(1, 10);
                break;
            case 2:
                rndNbr = randomNumber(1, 20);
                break;
            case 3:
                rndNbr = randomNumber(1, 30);
                break;
            case 4:
                rndNbr = randomNumber(1, 40);
                break;
            case 5:
                rndNbr = randomNumber(1, 50);
                break;
        }
        return rndNbr;
    }

    public int randomRange(Scanner scanner) {
        int firstValue = playerInputValidator(scanner, messages.setFirstValue(), messages.thatIsNotNumberErrorMessage());
        int secondValue = playerInputValidator(scanner, messages.setSecondValue(), messages.thatIsNotNumberErrorMessage());
        while (secondValue == firstValue) {
            System.out.println(messages.secondValueMustBeDifferent(firstValue));
            secondValue = playerInputValidator(scanner, messages.setSecondValue(), messages.thatIsNotNumberErrorMessage());
        }
        int max = Math.max(firstValue, secondValue);
        int min = Math.min(firstValue, secondValue);
        return random.nextInt((max - min) + 1) + min;
    }


    public void checkNumbersForOneTry(int computerNumber, int playerNumber) {
        if (playerNumber == computerNumber) {
            System.out.println(messages.congratulationsGuessedTheNumber());
        } else {
            System.out.println(messages.reachedMaximumNumberOfTriesAndNotGuessed(computerNumber));
        }
    }

    public int playerInputValidator(Scanner scan, String optionsMessage, String errorMessage) {
        while (true) {
            System.out.println(optionsMessage);
            try {
                return scan.nextInt();
            } catch (InputMismatchException exc) {
                System.out.println(errorMessage);
            } finally {
                scan.nextLine();
            }
        }
    }

    public void multipleTriesMode(Scanner scanner, int computerNumber) {
        int guessCount = 0;
        int playerNumber;
        int numberOfTries = playerInputValidator(scanner, messages.howManyTriesYouWantToHave(), messages.inputAmountOfTriesErrorMessage());
        System.out.println(messages.computerDrewNumberMessage());
        while (guessCount < numberOfTries) {
            guessCount++;
            playerNumber = playerInputValidator(scanner, messages.howManyGuessesUsed(guessCount, numberOfTries), messages.thatIsNotNumberErrorMessage());
            if (playerNumber == computerNumber) {
                System.out.println(messages.congratulationsGuessedTheNumber());
                break;
            }
            if (playerNumber != computerNumber && guessCount == numberOfTries) {
                System.out.println(messages.reachedMaximumNumberOfTriesAndNotGuessed(computerNumber));
            } else if (playerNumber != computerNumber) {
                System.out.println(messages.tryToGuessAgainMessage());
            }
        }
    }

    public void oneTryMode(Scanner scanner, int randomNumberRange) {
        int playerNumber;
        int computerNumber;
        computerNumber = randomNumberRange;
        System.out.println(messages.computerDrewNumberMessage());
        playerNumber = playerInputValidator(scanner, messages.youHaveOnlyOneTryToGuessTheNumber(), messages.thatIsNotNumberErrorMessage());
        checkNumbersForOneTry(computerNumber, playerNumber);
    }


}
