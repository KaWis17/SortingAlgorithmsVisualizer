package org.example;

import org.example.Controller.Controller;
import org.example.Model.Strategy.BubbleSort;
import org.example.Model.Model;
import org.example.View.Bar;
import org.example.View.View;

import javax.swing.*;

public class Main {
  public static void main(String[] args) throws InterruptedException {
    Model model = new Model();
    View view = new View();
    Controller controller = new Controller(model, view);


  }
}