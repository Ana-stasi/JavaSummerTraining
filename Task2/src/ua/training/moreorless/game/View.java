/*
 * Created by Anastasiia Lapa on 27.06.2021.
 */
package ua.training.moreorless.game;

public class View {

    public static final String SPACE = " ";
    public static final String OPENING_SQUARE_BRACKET = "[";
    public static final String CLOSING_SQUARE_BRACKET = "]";

    public static final String INPUT_NUMBER = "Input number from range ";
    public static final String WRONG_NUMBER_INPUT = "Input isn`t number! Try again.";
    public static final String CONGRATULATION_MESSAGE = "You guessed! Hidden number is ";
    public static final String NUMBER_IS_BIGGER = " is bigger than hidden number";
    public static final String NUMBER_IS_SMALLER = " is smaller then hidden number";
    public static final String NUMBER_IS_OUT_OF_RANGE = " is out of range ";
    public static final String STATISTICS = "Your input: ";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printErrorMessage(String error) {
        System.err.println(error);
    }
}
