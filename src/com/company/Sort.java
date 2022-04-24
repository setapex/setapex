package com.company;

public class Sort {
    public static void sort(int[] array) {//selection
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;
        }
    }
    public static void inSort(int[] array1) {//Insertion
        for (int i = 1; i < array1.length; i++) {
            int current = array1[i];
            int j = i - 1;
            while(j >= 0 && current < array1[j]) {
                array1[j+1] = array1[j];
                j--;
            }
            // в этой точке мы вышли, так что j так же -1
            // или в первом элементе, где текущий >= a[j]
            array1[j+1] = current;
        }
    }
}
