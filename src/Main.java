public class Main {
    public static int myNumber = 1;

    public static void test(int num) {
        System.out.println(num);
        //System.out.println(a);
        int a = 9;
        if (7 < 10) {
            System.out.println(num);
            System.out.println(a);
            int b = 1;
            System.out.println(b);
            //int b = 7;
        }
        if (9 == 9) {
            int b = 9;
        }
        //System.out.println(b);
        //System.out.println(num);
    }

    public static void main(String[] args) {

        double[] numbers = {1.5, -2.3, 4.7, -3.2, 2.8, 6.1, -1.9, 5.4, -0.6, 3.9, -2.5, 1.2, -4.6, 3.7, -0.8};

        double sum = 0;
        int count = 0;
        boolean foundNegative = false;

        for (double number : numbers) {
            if (foundNegative && number > 0) {
                sum += number;
                count++;
            } else if (number < 0) {
                foundNegative = true;
            }
        }

        double average = sum / count;

        System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + average);
    }
}