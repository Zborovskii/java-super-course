package tasks;

public class Main {

    public static void main(String[] args) {
        //Task 2. Start

        Integer[] numbers = new Integer[]{1, 2, 3, 4, 5, 6};
        Integer[] result = new Integer[9];

        //cycle for
        for (Integer i = 0; i < numbers.length; i++) {
            if ((i - 1) % 2 == 0) {
                result[i] = numbers[i] * numbers[i - 1];
            } else {
                result[i] = numbers[i];
            }
        }

        //cycle do while
        Integer i = 0;
        do {
            if ((i - 1) % 2 == 0) {
                result[i] = numbers[i] * numbers[i - 1];
            } else {
                result[i] = numbers[i];
            }
            i++;
        }
        while (i < numbers.length);

        //cycle while
        i = 0;
        while (i < numbers.length) {
            if ((i - 1) % 2 == 0) {
                result[i] = numbers[i] * numbers[i - 1];
            } else {
                result[i] = numbers[i];
            }
            i++;
        }
        //Task 2. finish

        //Task 4
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Main.getMax(arr);

    }

    //Task 3
    public static void function(Double x) {
        Double y = Math.tan(2 * x) - 3;

        //        System.out.println(" x | y \n" + String.format(" %s | %s ", x, y));
    }

    //Task 4 method
    private static Integer getMax(int[] arr) {
        return Math.max((arr[0] + arr[arr.length - 1]), arr[1] + arr[arr.length - 2]);
    }

    //Task5
    public static void printMatrix(Integer size) {
        String result = "";

        for (Integer i = 0; i < size; i++) {
            for (Integer j = 0; j < size; j++) {
                if (i == j || i + j == size - 1) {
                    result += "1";
                } else {
                    result += "0";
                }
            }
            result += "\n";
        }

        //        System.out.println(result);
    }
}