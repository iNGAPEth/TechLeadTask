package com.company;

public class ReverseArray {
    public static void main(String[] args) {
        String[] array = {"Каждый ", "охотник ", "желает ", "знать ", "где ", "сидит ", "фазан "};

        for (int x = 0; x < array.length; x++) {
            System.out.print(array[x]);
        }
            System.out.println();

        int y = array.length;
        String temp;

        for (int x = 0; x < y / 2; x++) {
            temp = array[y - x - 1];
            array[y - x - 1] = array[x];
            array[x] = temp;
        }
        for(int x = 0; x < array.length; x++) {
            System.out.print(array[x]);
        }
    }
}
