/*
 * Created by Anastasiia Lapa on 23.06.2021.
 */
package ua.training;

public class Main {

    public static void main(String[] args) {
        View view = new View();
        Model model = new Model();
        new Controller(view, model).run();
    }
}
