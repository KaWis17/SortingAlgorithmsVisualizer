package org.example;

import org.example.Controller.Controller;
import org.example.Model.Strategy.BubbleSort;
import org.example.Model.Model;
import org.example.View.View;

public class Main {
  public static void main(String[] args) throws InterruptedException {
    Model model = new Model();
    View view = new View();

    Controller controller = new Controller(model, view);

    controller.setSortingAlgorithm(new BubbleSort());
    controller.setDelay(5);
    int[] array = {5, 10, 15};
    controller.setInput(array);
    Thread.sleep(2500);
    array = new int[69];
    controller.setInput(array);
  }
}