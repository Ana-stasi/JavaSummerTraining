/*
 * Created by Anastasiia Lapa on 23.06.2021.
 */
package ua.training;

import java.util.Scanner;

public class Controller {

    private static final String FIRST_WORD = "Hello";
    private static final String SECOND_WORD = "world!";

    private View view;
    private Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        String firstWord = getWord(scanner, FIRST_WORD, View.INPUT_FIRST_WORD);
        String secondWord = getWord(scanner, SECOND_WORD, View.INPUT_SECOND_WORD);
        model.setSentence(firstWord + " " + secondWord);
        view.printMessage(View.RESULT_SENTENCE + model.getSentence());
    }

    private String getWord(Scanner scanner, String word, String request) {
        view.printMessage(request);
        String input = scanner.nextLine();
        while (!input.equals(word)) {
            view.printErrorMessage(View.WRONG_WORD_INPUT);
            input = scanner.nextLine();
        }
        return input;
    }
}
