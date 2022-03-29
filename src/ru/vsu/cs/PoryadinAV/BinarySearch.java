package ru.vsu.cs.PoryadinAV;

import java.util.List;

public class BinarySearch {
    // возвращает индекс элемента в массиве со значением value
    // или -1, если такого нет
    public static <T extends Comparable<? super T>> int indexOf(T[] data, T value) {
        int mid = data.length / 2;
        int left = 0;
        int right = data.length - 1;

        while (left <= right) {
            if (data[mid].compareTo(value) == 0) {
                return mid;
            } else {
                if (data[mid].compareTo(value) < 0) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
                mid = (left + right) / 2;
            }
        }

        return -1;
    }

    //     возвращает наименьший индекс элемента, строго большего value
//     или -1, если такого нет
    public static <T extends Comparable<? super T>> int indexOfHigher(T[] data, T value) {
        int foundIndex = indexOf(data, value);
        if (foundIndex != data.length) {
            return foundIndex + 1;
        }

        return -1;
    }

    public static <T extends Comparable<? super T>> int indexOfLower(T[] data, T value) {
        int foundIndex = indexOf(data, value);
        if (foundIndex != 0) {
            return foundIndex - 1;
        }

        return -1;
    }

    // и такие же методы для списков (по сути копия кода
    // с разницей только в способе обращения к элементам)
    public static <T extends Comparable<? super T>> int indexOf(List<? super T> data, T value) {
        int mid = data.size() / 2;
        int left = 0;
        int right = data.size() - 1;

        while (left <= right) {
            if (data.get(mid) == value) {
                return mid;
            } else {
                T midValue = (T) data.get(mid);
                if (midValue.compareTo(value) < 0) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
                mid = (left + right) / 2;
            }
        }

        return -1;
    }

    public static <T extends Comparable<? super T>> int indexOfHigher(List<? super T> data, T value) {
        int foundIndex = indexOf(data, value);
        if (foundIndex != data.size()) {
            return foundIndex + 1;
        }

        return -1;
    }

    public static <T extends Comparable<? super T>> int indexOfLower(List<? super T> data, T value) {
        int foundIndex = indexOf(data, value);
        if (foundIndex != 0) {
            return foundIndex - 1;
        }

        return -1;
    }
}
