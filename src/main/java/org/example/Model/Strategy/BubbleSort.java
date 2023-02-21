package org.example.Model.Strategy;

import org.example.Model.Model;

public class BubbleSort extends SortingAlgorithm implements Runnable{

  public BubbleSort(Model model){
    super(model);
  }
  public void run() {
    int[] input = model.getArray();

      boolean swapped;

      for(int i=0; i<input.length-1; ++i){
        swapped = false;
        for(int j=0; j<input.length-i-1; j++){
          if(input[j] > input[j+1]){
            swap(input, j, j+1);
            swapped = true;
          }
        }
        if(!swapped)
          break;
      }

  }
}
