package org.example.View;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Random;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import org.example.Model.Model;

public class View extends JFrame {

  private Model model;
  private JPanel mainPanel;
  private JPanel[] panels;

  public View(){
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(1250, 750);

    mainPanel = new JPanel();
    mainPanel.setBackground(Color.BLACK);
    add(mainPanel);
    setVisible(true);
  }

  public Model getModel() {
    return model;
  }

  public void setModel(Model model) {
    this.model = model;
  }

  public void update(){
    updateInput();
    updateDelay();
    updateSortingAlgorithm();
  }

  private void updateInput(){
    remove(mainPanel);
    mainPanel = new JPanel();
    int arrayLength = model.getInputLength();
    mainPanel.setLayout(new GridLayout(1, arrayLength));
    if(arrayLength > 0 ){
      panels = new JPanel[model.getInputLength()];
      for(JPanel panel : panels){
        panel = new JPanel();
        panel.setBackground(new Color(new Random().nextInt(255)));
        mainPanel.add(panel);
      }
    }
    add(mainPanel);
    setVisible(true);
  }

  private void updateDelay(){

  }

  private void updateSortingAlgorithm(){

  }
}
