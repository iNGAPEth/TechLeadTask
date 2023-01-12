package com.company;

import java.util.List;
import java.util.stream.Collectors;
public class StreamCollection {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,3,4,-5,-8);
        System.out.println(convertCollect(numbers));
    }
    public static List<Integer> convertCollect(List<Integer> numbers) {
        return numbers
                .stream()
                .map(numb -> {
                    if (numb < 0)
                        return numb * (-1);
                        return numb;
                })
                .collect(Collectors.toList());
    }
}
