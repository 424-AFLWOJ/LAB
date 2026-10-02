package edu.course.lab01;

/**
 * Небольшие методы для первой лабораторной работы.
 */
public final class CourseToolkit {

    private CourseToolkit() {
        // Утилитарный класс не должен иметь экземпляров.
    }

    /**
     * Возвращает true, если число четное.
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    /**
     * Проверяет, является ли число простым.
     */
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int divisor = 2; divisor * divisor <= number; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * Проверяет, читается ли строка одинаково слева направо и справа налево.
     * Регистр и пробелы учитываются.
     */
    public static boolean isPalindrome(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Текст не должен быть null");
        }

        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    /**
     * Вычисляет среднее арифметическое элементов массива.
     */
    public static double average(int[] values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть null или пустым");
        }

        long sum = 0;
        for (int value : values) {
            sum += value;
        }

        return (double) sum / values.length;
    }

    /** Возвращает минимальный элемент массива. */
    public static int min(int[] values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть null или пустым");
        }

        int result = values[0];
        for (int value : values) {
            if (value < result) {
                result = value;
            }
        }
        return result;
    }

    /** Возвращает максимальный элемент массива. */
    public static int max(int[] values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть null или пустым");
        }

        int result = values[0];
        for (int value : values) {
            if (value > result) {
                result = value;
            }
        }
        return result;
    }

}
