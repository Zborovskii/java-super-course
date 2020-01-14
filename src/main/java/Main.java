public class Main {

    public static void main(String[] args) {
        //Task 2. Start

        Integer[] numbers = new Integer[4];
        Integer index = 0;

        for (Integer i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                numbers[index] = i;
                index++;
            }
        }

        //cycle for
        for (Integer i = 1; i < numbers.length; i += 2) {
            System.out.println(numbers[i] * numbers[i - 1]);
        }

        //cycle do while
        Integer i = 1;
        do {
            System.out.println(numbers[i] * numbers[i - 1]);
            i += 2;

        }
        while (i < 4);

        //cycle while
        i = 1;
        while (i < 4) {
            System.out.println(numbers[i] * numbers[i - 1]);
            i += 2;
        }
        //Task 2. finish


        //Task 4
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Main.getMax(arr);

    }


    //Task 3
    public static void function(Double x) {
        Double y = Math.tan(2 * x) - 3;

        System.out.println(" x | y \n" + String.format(" %s | %s ", x, y));
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

        System.out.println(result);
    }
}
