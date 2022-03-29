package ru.vsu.cs.PoryadinAV;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Integer[] testIntegerArray = {1, 2, 3, 4, 5};
        String[] testStringArray = {"a", "aa", "aaa", "aaaa", "aaaaa"};
        List<Integer> testIntegerList = new ArrayList<>(List.of(testIntegerArray));
        List<String> testStringList = new ArrayList<>(List.of(testStringArray));

        System.out.println("Примеры работы каких методов вывести?");
        System.out.println("1 - indexOf");
        System.out.println("2 - indexOfHigher");
        System.out.println("3 - indexOfLower");
        System.out.print("Введите номер: ");

        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();

        switch (answer) {
            case 1 -> {
                allSearches(testIntegerArray, testStringArray, testIntegerList, testStringList);
            }
            case 2 -> {
                allSearchesHigher(testIntegerArray, testStringArray, testIntegerList, testStringList);
            }
            case 3 -> {
                allSearchesLower(testIntegerArray, testStringArray, testIntegerList, testStringList);
            }
            default -> {
                System.out.println("Некорректный ввод, попробуйте заново");
            }
        }
    }

    private static void allSearches(Integer[] testIntegerArray, String[] testStringArray,
                                    List<Integer> testIntegerList, List<String> testStringList) {
        System.out.println("array = {1, 2, 3, 4, 5}, value = 2");
        System.out.println("Binary search = " + BinarySearch.indexOf(testIntegerArray, 2) + "\n");

        System.out.println("array = {'a', 'aa', 'aaa', 'aaaa', 'aaaaa'}, value = 'aa'");
        System.out.println("Binary search = " + BinarySearch.indexOf(testStringArray, "aa") + "\n");

        System.out.println("list = {1, 2, 3, 4, 5}, value = 4");
        System.out.println("Binary search = " + BinarySearch.indexOf(testIntegerList, 4) + "\n");

        System.out.println("list = {'a', 'aa', 'aaa', 'aaaa', 'aaaaa'}, value = 'aaaa'");
        System.out.println("Binary search = " + BinarySearch.indexOf(testStringList, "aaaa") + "\n");
    }

    private static void allSearchesHigher(Integer[] testIntegerArray, String[] testStringArray,
                                          List<Integer> testIntegerList, List<String> testStringList) {
        System.out.println("array = {1, 2, 3, 4, 5}, value = 2");
        System.out.println("Binary search = " + BinarySearch.indexOfHigher(testIntegerArray, 2) + "\n");

        System.out.println("array = {'a', 'aa', 'aaa', 'aaaa', 'aaaaa'}, value = 'aa'");
        System.out.println("Binary search = " + BinarySearch.indexOfHigher(testStringArray, "aa") + "\n");

        System.out.println("list = {1, 2, 3, 4, 5}, value = 4");
        System.out.println("Binary search = " + BinarySearch.indexOfHigher(testIntegerList, 4) + "\n");

        System.out.println("list = {'a', 'aa', 'aaa', 'aaaa', 'aaaaa'}, value = 'aaaa'");
        System.out.println("Binary search = " + BinarySearch.indexOfHigher(testStringList, "aaaa") + "\n");
    }

    private static void allSearchesLower(Integer[] testIntegerArray, String[] testStringArray,
                                          List<Integer> testIntegerList, List<String> testStringList) {
        System.out.println("array = {1, 2, 3, 4, 5}, value = 2");
        System.out.println("Binary search = " + BinarySearch.indexOfLower(testIntegerArray, 2) + "\n");

        System.out.println("array = {'a', 'aa', 'aaa', 'aaaa', 'aaaaa'}, value = 'aa'");
        System.out.println("Binary search = " + BinarySearch.indexOfLower(testStringArray, "aa") + "\n");

        System.out.println("list = {1, 2, 3, 4, 5}, value = 4");
        System.out.println("Binary search = " + BinarySearch.indexOfLower(testIntegerList, 4) + "\n");

        System.out.println("list = {'a', 'aa', 'aaa', 'aaaa', 'aaaaa'}, value = 'aaaa'");
        System.out.println("Binary search = " + BinarySearch.indexOfLower(testStringList, "aaaa") + "\n");
    }

}
