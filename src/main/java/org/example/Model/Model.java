package org.example.Model;

import java.util.ArrayList;
import java.util.Observable;
import org.example.Model.Strategy.SortingAlgorithm;
import org.example.View.View;

public class Model extends Observable {

  private ArrayList<View> observers = new ArrayList<>();
  private int[] input;
  private SortingAlgorithm sortingAlgorithm;
  private int delay;
  public Model(){

  }

  public void addObserver(View view){
    observers.add(view);
  }

  public void deleteObserver(View view){
    observers.remove(view);
  }

  public void update(){
    for(View view : observers){
      view.update();
    }
  }

  public SortingAlgorithm getSortingAlgorithm() {
    return sortingAlgorithm;
  }

  public void setSortingAlgorithm(SortingAlgorithm sortingAlgorithm) {
    this.sortingAlgorithm = sortingAlgorithm;
    update();
  }

  public int getDelay() {
    return delay;
  }

  public void setDelay(int delay) {
    this.delay = delay;
    update();
  }

  public int[] getInput() {
    return input;
  }

  public int getInputLength(){
    if(input != null)
      return input.length;
    return 0;
  }

  public void setInput(int[] input) {
    this.input = input;
    update();
  }
}
