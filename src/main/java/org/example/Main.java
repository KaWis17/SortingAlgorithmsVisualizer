package org.example;

import org.example.Controller.Controller;
import org.example.Model.Strategy.BubbleSort;
import org.example.Model.Model;
import org.example.View.Bar;
import org.example.View.View;

import javax.swing.*;

public class Main {
  public static void main(String[] args) {
    View view = new View();
    Model model = new Model();
    Controller controller = new Controller(model, view);
  }
}