public class Main {

    public static void main(String[] args) {
        System.out.println("Задача 1");
        int sum = 0;
        int[] arr = generateRandomArray();
        for (int j : arr) {
            sum += j;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");


        System.out.println("Задача 2");

        int maxNumber = 99999;
        int minNumber = 200001;
        for (int j : arr)
            if (minNumber > j) {
                minNumber = j;
            }
        System.out.println("Минимальная сумма трат за день составила " + minNumber + " рублей");


        for (int j : arr) {
            if (maxNumber < j) {
                maxNumber = j;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxNumber + " рублей");

        System.out.println("Задача 3");
        double average = 0;
        for (int j : arr) {
            average += j / arr.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int f = reverseFullName.length - 1; f >= 0; f--) {
            System.out.print(reverseFullName[f]);
        }

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }

        return arr;
    }
}


