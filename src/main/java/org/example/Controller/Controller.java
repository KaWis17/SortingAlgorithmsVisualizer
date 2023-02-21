package org.example.Controller;

import org.example.Model.Strategy.BubbleSort;
import org.example.Model.Strategy.QuickSort;
import org.example.Model.Strategy.SortingAlgorithm;
import org.example.Model.Model;
import org.example.View.View;

public class Controller {
  private Model model;
  private View view;

  public Controller(Model model, View view) {
    this.model = model;
    this.view = view;

    model.addObserver(view);
    view.setModel(model);

    addListeners();
    view.update();
  }

  private void addListeners(){
    getView().getSlider().addChangeListener(e -> {
      int value = getView().getSlider().getValue();
      getModel().setArraySize(value);
    });

    getView().getComboBox().addActionListener(e -> {
      String chosen = (String) getView().getComboBox().getSelectedItem();
      System.out.println(chosen);

      if(chosen.equals("QuickSort"))
        model.setSortingAlgorithm(new QuickSort(getModel()));
      else
        model.setSortingAlgorithm(new BubbleSort(getModel()));
    });

    getView().getStartButton().addActionListener(e -> {
      try {
        getModel().sort();
      } catch (InterruptedException ex) {
        throw new RuntimeException(ex);
      }
    });
  }

  public Model getModel() {
    return model;
  }

  public void setModel(Model model) {
    this.model = model;
  }

  public View getView() {
    return view;
  }

  public void setView(View view) {
    this.view = view;
  }

  public int[] getInput(){
    return model.getArray();
  }

  public void setSortingAlgorithm(SortingAlgorithm sortingAlgorithm){
    model.setSortingAlgorithm(sortingAlgorithm);
  }

  public SortingAlgorithm getSortingAlgorithm(){
    return model.getSortingAlgorithm();
  }

  public void setDelay(int delay){
    model.setDelay(delay);
  }

  public int getDelay(){
    return model.getDelay();
  }
}
