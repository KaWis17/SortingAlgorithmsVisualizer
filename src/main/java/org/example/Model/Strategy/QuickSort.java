package org.example.Model.Strategy;

import org.example.Model.Model;

public class QuickSort extends SortingAlgorithm implements Runnable{

    public QuickSort(Model model){
        super(model);
    }
    @Override
    public void run() {
        int[] input = model.getArray();
        quick(input, 0, input.length-1);
    }

    private void quick(int[] input, int L, int R){
        if(L<R){
            int p = partition(input, L, R);

            quick(input, L, p-1);
            quick(input, p+1, R);
        }
    }

    private int partition(int[] input, int L, int R){
        int p = input[R];
        int i = L-1;

        for(int j=L; j<=R-1; j++){
            if(input[j]<p){
                i++;
                swap(input, i, j);
            }
        }

        swap(input, i+1, R);
        return i+1;
    }
}
