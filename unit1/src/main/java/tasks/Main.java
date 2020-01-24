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
        Main.getMax(new int[]{1,2,3,4});
    }

    //Task 3
    public static void calculateFunction(int a, int b, int h) {

        System.out.println(" x | y \n");

        for (int i = a; b > i * h; i++) {
            System.out.println(String.format(" %s | %s ", i, Math.tan(2 * i) - 3));
        }
    }

    //Task 4 method
    private static Integer[] getMax(int[] arr) {
        int pairQuantity = arr.length / 2;
        Integer[] result = new Integer[pairQuantity];

        for (int i = 1; i <= pairQuantity; i++) {
            result[i - 1] = Math.max(arr[i - 1], arr[arr.length - i]);
        }

        return result;
    }

    //Task5

    public static void printMatrix(Integer size) {
        StringBuilder result = new StringBuilder();

        for (Integer i = 0; i < size; i++) {
            for (Integer j = 0; j < size; j++) {
                if (i == j || i + j == size - 1) {
                    result.append("1");
                } else {
                    result.append("0");
                }
            }
            result.append("\n");
        }

        System.out.println(result);
    }

}