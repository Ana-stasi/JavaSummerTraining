/*
 * Created by Anastasiia Lapa on 27.06.2021.
 */
package ua.training.moreorless.game;

import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        model.setBoundsOfRange();
        model.setSecretValue();
        int number = getNumber(scanner);
        int result;
        while ((result = model.checkInput(number)) != 0) {
            if (result == 1)
                view.printMessage(number + View.NUMBER_IS_BIGGER);
            else
                view.printMessage(number + View.NUMBER_IS_SMALLER);
            number = getNumber(scanner);
        }
        view.printMessage(View.CONGRATULATION_MESSAGE + number);
        view.printMessage(View.STATISTICS + model.getStatisticList());
    }

    private int getNumber(Scanner sc) {
        int result;
        while (true) {
            view.printMessage(getInputMessage());
            while (!sc.hasNextInt()) {
                view.printErrorMessage(View.WRONG_NUMBER_INPUT);
                sc.next();
            }
            result = sc.nextInt();
            if (result >= model.getMaxValue() || result <= model.getMinValue()) {
                view.printErrorMessage(result + View.NUMBER_IS_OUT_OF_RANGE);
                continue;
            }
            break;
        }
        return result;
    }

    private String getInputMessage() {
        return  View.INPUT_NUMBER +
                View.OPENING_SQUARE_BRACKET + model.getMinValue() +
                View.SPACE + model.getMaxValue() +
                View.CLOSING_SQUARE_BRACKET + View.SPACE;
    }
}
