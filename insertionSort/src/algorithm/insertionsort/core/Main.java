package algorithm.insertionsort.core;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //InsertionSort IS = new InsertionSort();
        InsertionSortOne ISO = new InsertionSortOne();

        Integer[] arr = {12,11,13,5,6};
        ISO.InsertionSortOne(arr);
    }
}
