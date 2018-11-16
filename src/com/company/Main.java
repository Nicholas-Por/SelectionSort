package com.company;

public class Main {

    public static void SelectionSort(int[] arr)
    {
	 int p0 = 0;
	 int p1 = 0;
	 int min = 0;
	 for (int i = 0; i < arr.length; i++)
        {
            p0 = i;
            min = arr[i];
            for(int j = i++; j < arr.length; j++)
            {
                if (arr[j] < min)
                {
                    p1 = j;
                    min = arr[j];

                }
                swap();
            }
        }
    }
}
