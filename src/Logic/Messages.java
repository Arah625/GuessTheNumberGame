package Logic;

public class Messages {

    Colors color = new Colors();

    String opponent = color.cyanBoldUnderlined("Computer") + color.cyanBold(": ");

    public String welcomeMessage() {
        return color.yellowBold("Welcome to Guess The Number Game!");
    }

    public String menuGameRange(int option) {
        String gameRange = null;
        switch (option){
            case 1:
                gameRange = color.yellow("You have chosen to play Guess The Number Game, range 1 - 10!");
                break;
            case 2:
                gameRange = color.yellow("You have chosen to play Guess The Number Game, range 1 - 20!");
                break;
            case 3:
                gameRange = color.yellow("You have chosen to play Guess The Number Game, range 1 - 30!");
                break;
            case 4:
                gameRange = color.yellow("You have chosen to play Guess The Number Game, range 1 - 40!");
                break;
            case 5:
                gameRange = color.yellow("You have chosen to play Guess The Number Game, range 1 - 50!");
                break;
            case 6:
                gameRange = color.yellow("You have chosen to play Guess The Number Game, range 1 - 10!");
                break;

        }
        return gameRange;
    }

    public String menuPlayOrLeave() {
        return opponent + color.cyan("What do you want to do?") +
                "\n1 - play the game with one try" +
                "\n2 - play the game with tries" +
                "\n0 - get back to main menu";
    }

    public String computerDrewNumberMessage() {
        return opponent + color.cyan("I am ready to play!") +
                "\n" + opponent + color.cyan("What number am I thinking of?");
    }

    public String congratulationsGuessedTheNumber() {
        return opponent + color.greenBold("Congratulations! You have guessed the number!");
    }

    public String tryToGuessAgainMessage() {
        return opponent + color.cyan("That is not my number. Guess again");
    }

    public String howManyTriesYouWantToHave() {
        return opponent + color.cyan("How many guesses you want to have?");
    }

    public String reachedMaximumNumberOfTriesAndNotGuessed(int computerNumber) {
        return opponent + color.red("Sorry, you have reached maximum number of tries and did not guess the number which was: ") +
                color.redBold(String.valueOf(computerNumber));
    }

    public String howManyGuessesUsed(int numberOfGuesses, int numberOfTries) {
        return color.blueUnderlined("Guesses: " + numberOfGuesses + " of " + numberOfTries);
    }

    public String backToMainMenuMessage() {
        return color.yellow("Chosen: Back to main menu");
    }

    public String youHaveOnlyOneTryToGuessTheNumber() {
        return opponent + color.cyan("You have only one try to guess the number I am thinking of");
    }

    public String wrongButtonMessage() {
        return color.redBoldBright("Wrong button! Please select one of the options shown below");
    }

    public String inputAmountOfTriesErrorMessage() {
        return color.redBoldBright("Please input amount of tries you want to have");
    }

    public String thatIsNotNumberErrorMessage() {
        return color.redBoldBright("That is not a number! Please input number value");
    }

    public String mainMenu() {
        return opponent + (color.cyan("Select your Game Type")) +
                "\n1 - Random number within range 1 - 10" +
                "\n2 - Random number within range 1 - 20" +
                "\n3 - Random number within range 1 - 30" +
                "\n4 - Random number within range 1 - 40" +
                "\n5 - Random number within range 1 - 50" +
                "\n6 - Random number within range you set!" +
                "\n0 - Exit game";
    }

    public String exitGame() {
        return color.yellow("Chosen: Exit game");
    }

    public String numberOutOfRange(int maxNumber) {
        return color.redBoldBright("Your number is out of game range: 1" + maxNumber);
    }


}
