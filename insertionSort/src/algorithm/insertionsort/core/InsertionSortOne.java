package algorithm.insertionsort.core;

import java.util.Arrays;

public class InsertionSortOne {

    public void InsertionSortOne(Integer[] arr)
    {
        int i,j,currentValue = 0;

        for (i = 1; i < arr.length; i++)
        {
            currentValue = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > currentValue)
            {
                arr[j+1] = arr[j];
                j =-1;
            }
            arr[j+1] = currentValue;
        }

        Arrays.stream(arr).forEach(System.out::println);
    }
}
