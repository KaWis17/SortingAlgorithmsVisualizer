package org.example.Model.Strategy;

import org.example.Model.Model;

public abstract class SortingAlgorithm implements Runnable{

  Model model;

  SortingAlgorithm(Model model){
    this.model = model;
  }

  void swap(int[] array, int i, int j) {
    try {
      Thread.sleep(model.getDelay());
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
    model.update();
  }
}
