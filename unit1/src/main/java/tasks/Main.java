package tasks;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //Task 2. Start
        Integer[] numbers = new Integer[]{1, 2, 3, 4, 5, 6};
        //cycle for

        for (int i = 1; i < numbers.length; i += 2) {
            numbers[i] = numbers[i] * numbers[i - 1];
        }


        //cycle do while
        Integer[] numbers1 = new Integer[]{1, 2, 3, 4, 5, 6};

        Integer i = 1;
        do {
            numbers1[i] = numbers1[i] * numbers1[i - 1];

            i += 2;
        }
        while (i < numbers1.length);


        //cycle while
        Integer[] numbers2 = new Integer[]{1, 2, 3, 4, 5, 6};

        i = 1;
        while (i < numbers2.length) {
            numbers2[i] = numbers2[i] * numbers2[i - 1];

            i += 2;
        }

        //Task 2. finish

        //Task 3
        calculateFunction(1,6,2);

        //Task 4
        Arrays.toString(Main.getMax(new int[]{1, 2, 3, 10, 5 ,20}));

        //Task 5
        printMatrix(5);
    }

    //Task 3
    public static void calculateFunction(int a, int b, int h) {

        System.out.println(" x | y \n");

        for (int i = a; b >= i ; i+=h) {
            System.out.println(String.format(" %s | %s ", i, Math.tan(2 * i) - 3));
        }
    }

    //Task 4 method
    private static Integer[] getMax(int[] arr) {
        int pairQuantity = arr.length / 4;
        Integer[] result = new Integer[pairQuantity];

        for (int i = 1; i <= pairQuantity; i++) {
            result[i - 1] = Math.max(arr[i - 1] + arr[arr.length - i], arr[i] + arr[arr.length - 1 - i]);
        }
        return result;
    }

    //Task5
    public static void printMatrix(Integer size) {
        int[][] result = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || i + j == size - 1) {
                    result[i][j] = 1;
                } else {
                    result[i][j] = 0;
                }
            }
            System.out.println(Arrays.toString(result[i]));
        }
    }

}