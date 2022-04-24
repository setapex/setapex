package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] mass = new int[5];
        int[] mass1 = new int[]{2, 4, 1, 5, 3};
        int[] mass2 = new int[]{6, 3, 9, 2, 4};
        Scanner in = new Scanner(System.in);
        int z = 0;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = in.nextInt();
            z = z + mass[i];
        }
        for (int j : mass) {
            System.out.printf("%d ", j);
        }
        System.out.println();
        Arrays.sort(mass, 0, mass.length);//если принять (длина-1) то последний член не сортируется
        System.out.println(Arrays.toString(mass));//более удобный метод для вывода массивов
        System.out.println(mass[2]);//если именно значение массива
        double sred = z / mass.length;//если среднее значение суммы массива
        double sred1 = (mass[0] + mass[4]) / 2;//если среднее значение между min и max
        System.out.println(sred);
        System.out.println(sred1);

        Sort arr = new Sort();
        System.out.println("Selection and Insertion Sort");
        System.out.println("The second array is:");
        System.out.println(Arrays.toString(mass1));
        System.out.println("The third array is:");
        System.out.println(Arrays.toString(mass2));
        arr.sort(mass1);
        arr.inSort(mass2);
        System.out.println("The second sorted array is:");
        System.out.println(Arrays.toString(mass1));
        System.out.println("The third sorted array is:");
        System.out.println(Arrays.toString(mass2));
        System.out.println();
        System.out.println();

        System.out.println("Square");
        Square squares=new Square();
        System.out.println("1=radius 2=diametr");
        int el=in.nextInt();
        if(el == 1){
            System.out.println(squares.square(7));
        } else if(el==2){
            System.out.println(squares.square(10,true));
        }
        System.out.println();
        System.out.println();


        Return ret=new Return();
        System.out.println(ret.retur(7));
        System.out.println();
        System.out.println();
        System.out.println("Ne prost chisla");

        for(int i = 3; i <= 120; i ++){
            boolean check = false;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    check = true;
                    break;
                }
            }
            if(check){
                System.out.println(i);
            }
        }
        }
    }

