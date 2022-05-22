public class Main {


    private static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    static int[] arr = generateRandomArray();

    public static void main(String[] args) {

        System.out.println("Task 1");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("The sum of all expenses in a month" + sum + "rubles");


        int[] arr = new int[30];
             int maxSum = 100;
        for(int i = 0; i < arr.length; i++){
            arr[i] = (100_000) + 100_000;
             if (arr[i] > maxSum) {
                 maxSum = arr[i];
             }}
        System.out.println(maxSum ++);}}