package com.company;

import java.util.List;
import java.util.stream.Collectors;
public class StreamHundred {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(8, 101, 100, 99);
        System.out.println(evenOdd(numbers));
    }
    private static List<Integer> evenOdd(List<Integer> numbers) {
        return numbers
                .stream()
                .map(numb -> {
                    if (numb % 2 == 0) {
                        return numb * 100;
                    } else {
                        return numb - 100;
                    }
                })
                .collect(Collectors.toList());
    }
}
