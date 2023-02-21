package org.example.View;

import java.awt.*;
import javax.swing.*;

import org.example.Model.Model;


public class View extends JFrame {

  private Model model;
  private final JPanel mainPanel;
  private JPanel wrapper;
  private JSlider slider;
  private JComboBox comboBox;
  private JButton startButton;

  public View(){
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(1250, 750);
    mainPanel = new JPanel();
    mainPanel.setBackground(Color.BLACK);
    mainPanel.setLayout(new BorderLayout());

    addMenuPanel();
    addWrapperPanel();
    addFooterPanel();

    add(mainPanel);
    setVisible(true);
  }

  public void setModel(Model model) {
    this.model = model;
  }

  public void update(){
    addWrapperPanel();
  }

  private void addMenuPanel(){
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(2,3));

    //Info about selected values
    panel.add(new JTextArea("INFO 1"));

    //Choosing soring algorithm
    String[] sortingAlgs = {"QuickSort", "MergeSort", "BubbleSort"};
    panel.add(comboBox = new JComboBox(sortingAlgs));

    //Start-pause button
    panel.add(startButton = new JButton("START"));

    //
    panel.add(new JSlider(JSlider.HORIZONTAL, 1, 10, 5));

    //Setting array size slider
    slider = new JSlider(JSlider.HORIZONTAL, 10, 100, 30);
    slider.setPaintLabels(true);
    slider.setPaintTrack(true);
    slider.setPaintTicks(true);
    slider.setMajorTickSpacing(10);
    panel.add(slider);

    //reset-stop button
    panel.add(new JButton("RESET"));

    mainPanel.add(panel, BorderLayout.NORTH);
  }

  private void addWrapperPanel(){
    if(model == null)
      return;
    if(wrapper != null)
      mainPanel.remove(wrapper);
    wrapper = new JPanel();
    int arrayLength = model.getInputLength();
    int[] array = model.getArray();
    wrapper.setLayout(new GridLayout(1, arrayLength));
    if(arrayLength > 0 ){
      Bar[] bars = new Bar[model.getInputLength()];
      for(int i=0; i<arrayLength; ++i){
        bars[i] = new Bar(arrayLength, array[i]);
        wrapper.add(bars[i]);
      }
    }
    mainPanel.add(wrapper);
    setVisible(true);
  }

  private void addFooterPanel(){
    JTextArea area = new JTextArea("Created by Krzysztof Wiśniewski");
    area.setMinimumSize(new Dimension(100, 50));
    add(area, BorderLayout.SOUTH);
  }

  public JSlider getSlider(){
    return slider;
  }

  public JComboBox getComboBox(){
    return comboBox;
  }

  public JButton getStartButton(){
    return startButton;
  }
}
