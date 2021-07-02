/*
 * Created by Anastasiia Lapa on 27.06.2021.
 */
package ua.training.moreorless.game;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        new Controller(model, view).run();
    }
}
