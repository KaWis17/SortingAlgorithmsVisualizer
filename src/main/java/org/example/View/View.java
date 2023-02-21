package org.example.View;

import java.awt.*;
import javax.swing.*;

import org.example.Model.Model;

public class View extends JFrame {

  private Model model;
  private JPanel mainPanel;
  private Bar[] bars;
  private JPanel wrapper;
  JSlider slider;

  public View(){
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(1250, 750);
    mainPanel = new JPanel();
    mainPanel.setBackground(Color.BLACK);
    mainPanel.setLayout(new BorderLayout());

    mainPanel.add(wrapper = new JPanel(), BorderLayout.CENTER);
    addSlider();
    add(mainPanel);
    mainPanel.add(new JPanel(), BorderLayout.SOUTH);
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
    mainPanel.remove(wrapper);
    wrapper = new JPanel();
    int arrayLength = model.getInputLength();
    int array[] = model.getArray();
    wrapper.setLayout(new GridLayout(1, arrayLength));
    if(arrayLength > 0 ){
      bars = new Bar[model.getInputLength()];
      for(int i=0; i<arrayLength; ++i){
        bars[i] = new Bar(1, arrayLength, array[i]);
        wrapper.add(bars[i]);
      }
    }
    mainPanel.add(wrapper);
    setVisible(true);
  }

  private void updateDelay(){

  }

  private void updateSortingAlgorithm(){

  }

  private void addSlider(){
    slider = new JSlider(JSlider.HORIZONTAL, 10, 100, 30);

    JPanel panel = new JPanel();
    panel.add(slider);
    mainPanel.add(panel, BorderLayout.NORTH);
  }

  public JSlider getSlider(){
    return slider;
  }
}
