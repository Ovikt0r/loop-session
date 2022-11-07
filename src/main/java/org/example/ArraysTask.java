package org.example;

import java.util.Arrays;

public class ArraysTask {
    static final int[] array1 = new int[]{2, 4, -6, 12, -65, 66, 34, 86, -3, 54, 56, 44, -32, 23, 45, 98, 43, -42, 22, 11, -189};

    public static void main(String[] args) {
        printSumAndAmountEvenElements();
        printMinNegativeAndMinPositiveElements();
        System.out.println("The original array: \n" + Arrays.toString(array1));
        System.out.println("A new array with positive elements increased by one " +
                "and negative elements decreased by one : \n" + Arrays.toString(increasePositiveAndDecreaseNegativeByOne()));
        System.out.println("Maximum positive number is " + findMax());
        System.out.println("Maximum negative number is " + findMin());
        System.out.println("A new array with changed maximum and minimum : \n" + Arrays.toString(changeMaxAndMin()));

    }

    public static void printSumAndAmountEvenElements() {
        int amount = 0;
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0) {
                sum += array1[i];
                amount++;
            }
        }
        System.out.println("Amount of even elements : " + amount);
        System.out.println("Sum of pair elements : " + sum);
    }

    public static void printMinNegativeAndMinPositiveElements() {
        int edgeMinNegativeNumber = -2147483648;
        int edgeMinPositiveNumber = 2147483647;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < 0 && array1[i] > edgeMinNegativeNumber) {
                edgeMinNegativeNumber = array1[i];
            }
            if (array1[i] > 0 && array1[i] < edgeMinPositiveNumber) {
                edgeMinPositiveNumber = array1[i];
            }
        }
        System.out.println("Minimal negative number is " + edgeMinNegativeNumber);
        System.out.println("Minimal positive number is " + edgeMinPositiveNumber);
    }

    public static int[] increasePositiveAndDecreaseNegativeByOne() {
        int[] copyArray = Arrays.copyOf(array1, array1.length);
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > 0) {
                copyArray[i] += 1;
            }
            if (array1[i] < 0) {
                copyArray[i] -= 1;
            }
        }
        return copyArray;
    }

    public static int findMax() {
        int tempForMaximum = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > tempForMaximum) {
                tempForMaximum = array1[i];
            }
        }
        return tempForMaximum;
    }
    public static int findMin() {
        int tempForMinimum = -1;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < tempForMinimum) {
                tempForMinimum = array1[i];
            }
        }
        return tempForMinimum;
    }

    public static int[] changeMaxAndMin() {
        int[] copyArray = Arrays.copyOf(array1, array1.length);
        for (int j = 0; j < array1.length; j++) {
            if (array1[j] == findMax()) {
                copyArray[j] = findMin();
            }
            if (array1[j] == findMin()) {
                copyArray[j] = findMax();
            }
        }
        return copyArray;
    }
}