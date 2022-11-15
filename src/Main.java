public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();

       }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        for (int i: arr)
            sum += i;

        System.out.println("Сумма трат за месяц составила "+sum+" рублей");


        System.out.println("Задача 2");
        int maxNumber=99999;
        int minNumber=200001;
        for (int j : arr)
            if (minNumber > j) {
                minNumber = j;
            }
        System.out.println("Минимальная сумма трат за день составила "+minNumber+" рублей");

        for (int j : arr) {
            if (maxNumber < j) {
                maxNumber = j;
            }
        }
        System.out.println("Максимальная сумма трат за день составила "+maxNumber+" рублей");

        System.out.println("Задача 3");

        return arr;


    }




    }


