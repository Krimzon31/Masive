package com.company;

public class Main {

    public static void main(String[] args) {
        int[] Array = {1,8,13,8,9,12};
        int min = Array[0];
        double SredArif = 0;

        for(int i =0; i < Array.length; i++){
            if(Array[i] < min){
                min = Array[i];
            }
        }
        System.out.println("Минимальное значение " + min);

        if(Array.length > 0){
            double sum1 = 0;
            for (int j : Array) {
                sum1 += j;
            }
            SredArif = sum1 / Array.length;
        }
        double sum2 = SredArif + min;
        System.out.println("Среднее арифметическое " + SredArif);
        System.out.println("Сумма минимального значения и среднего арифметического равно " + sum2);
    }
}
