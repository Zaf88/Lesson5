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
        int Sum1 = 200_000;
        int Sum2 = 100_000;
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            Sum += a;
        }
        for (int i = 0; i < arr.length; i++) {
            int j = arr[i];
            if (j >= Sum1) {
                Sum1 = j;
            }
        }
        System.out.println("Maximum expense in a day" + Sum1 + "rubles");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= Sum2) {
                Sum2 = arr[i];
            }
        }
        System.out.print("Minimum expense in a day" + Sum2 + "rubles");


        float averageSum = 0;
        for (int i = 0; i < arr.length; i++) {
            averageSum = sum / arr.length;
        }
        System.out.println("averageSum expense in a month" + averageSum + "rubles");


        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i =  reverseFullName.length -1; i>=0; i--) {
        System.out.print(reverseFullName[i]);}}}







