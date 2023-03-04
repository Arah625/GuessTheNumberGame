package Logic;

public class Colors {

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String YELLOW = "\u001B[33m";
    public static final String CYAN = "\u001B[36m";
    public static final String RED_BOLD = "\033[1;31m";
    public static final String GREEN_BOLD = "\033[1;32m";
    public static final String YELLOW_BOLD = "\033[1;33m";
    public static final String PURPLE_BOLD = "\033[1;35m";
    public static final String CYAN_BOLD = "\033[1;36m";
    public static final String BLUE_UNDERLINED = "\033[4;34m";
    public static final String CYAN_UNDERLINED = "\033[4;36m";
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";

    public String cyan(String text) {
        return CYAN + text + RESET;
    }

    public String cyanBold(String text) {
        return CYAN_BOLD + text + RESET;
    }

    public String cyanBoldUnderlined(String text) {
        return CYAN_UNDERLINED + CYAN_BOLD + text + RESET;
    }

    public String purpleBold(String text) {
        return PURPLE_BOLD + text + RESET;
    }

    public String yellow(String text) {
        return YELLOW + text + RESET;
    }

    public String blueUnderlined(String text) {
        return BLUE_UNDERLINED + text + RESET;
    }

    public String red(String text) {
        return RED + text + RESET;
    }

    public String redBoldBright(String text) {
        return RED_BOLD_BRIGHT + text + RESET;
    }

    public String redBold(String text) {
        return RED_BOLD + text + RESET;
    }

    public String yellowBold(String text) {
        return YELLOW_BOLD + text + RESET;
    }

    public String greenBold(String text) {
        return GREEN_BOLD + text + RESET;
    }

}
