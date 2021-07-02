/*
 * Created by Anastasiia Lapa on 27.06.2021.
 */
package ua.training;

public class View {
    public static final String INPUT_FIRST_WORD = "Input first word: ";
    public static final String INPUT_SECOND_WORD = "Input second word: ";
    public static final String WRONG_WORD_INPUT = "Wrong input! Try again.";
    public static final String RESULT_SENTENCE = "Result sentence: ";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printErrorMessage(String error) {
        System.err.println(error);
    }
}
