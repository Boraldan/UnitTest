package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class Task2 {

    public static int findMax(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            throw new IllegalArgumentException("Список не должен быть пустым");
        }
        int max = numbers.get(0);
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static List<String> filterStrings(List<String> words, int minLength) {
        if (minLength < 0) {
            throw new IllegalArgumentException("Минимальная длина не может быть отрицательной");
        }
        return words.stream()
                .filter(word -> word.length() >= minLength)
                .collect(Collectors.toList());
    }

}
