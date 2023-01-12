package com.company;
public class StringSplit {
    public static void main(String[] args) {
        String cheriWords = "Automation Quality Assurance Engineer";
        String[] arraySplit = cheriWords.split(" ");

        for (int i = 0; i < arraySplit.length; i++) {
            System.out.println(arraySplit[i]);
        }
    }
}
