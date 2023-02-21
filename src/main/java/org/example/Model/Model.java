package org.example.Model;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Random;

import org.example.Model.Strategy.SortingAlgorithm;
import org.example.View.View;

public class Model extends Observable {

  private ArrayList<View> observers = new ArrayList<>();
  private int[] array;
  private int inputLength;
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

  public int[] getArray() {
    return array;
  }

  public int getInputLength(){
    if(array != null)
      return array.length;
    return 0;
  }

  public void setArray(int[] array) {
    this.array = array;
    update();
  }

  public void setArraySize(int value){

    array = new int[value];

    for(int i=0; i<value; ++i){
      array[i] = i+1;
    }

    Random rand = new Random();

    for (int i = 0; i < array.length; i++) {
      int randomIndexToSwap = rand.nextInt(array.length);
      int temp = array[randomIndexToSwap];
      array[randomIndexToSwap] = array[i];
      array[i] = temp;
    }

    update();
  }
}
