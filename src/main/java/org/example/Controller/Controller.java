package org.example.Controller;

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
  }

  public void sort(){

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

  public void setInput(int[] input){
    model.setInput(input);
  }

  public int[] getInput(){
    return model.getInput();
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
