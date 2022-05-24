public class Main {


    private static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        System.out.println("Task 1");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("The sum of all expenses in a month" + sum + "rubles");


        int Sum = 0;
        int maxSum = 200_000;
        int minSum = 100_000;
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            Sum += a;
        }
        for (int i = 0; i < arr.length; i++) {
            int j = arr[i];
            if (j >= maxSum) {
                maxSum = j;
            }
        }
        System.out.println("Maximum expense in a day" + maxSum + "rubles");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= minSum) {
                minSum = arr[i];
            }
        }
        System.out.print("Minimum expense in a day" + minSum + "rubles");


        float averageSum = 0;
        for (int i = 0; i < arr.length; i++) {
            averageSum = sum / arr.length;
             System.out.println("averageSum expense in a month" + averageSum + "rubles");}}}








