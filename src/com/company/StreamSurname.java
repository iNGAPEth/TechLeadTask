package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class StreamSurname {
    public static void main(String[] args) {
        List<String> surname = new ArrayList<>();
        surname.add("Иванов");
        surname.add("Андреев");
        surname.add("Сидоров");
        surname.add("Анфилов");
        surname.add("Васильев");

        List<String> newSurname = surname
                .stream()
                .filter(nick -> nick.charAt(0) == 'А')
                .collect(Collectors.toList());
        System.out.println(newSurname);
    }
}
