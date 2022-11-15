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

        System.out.println(sum);


        return arr;
    }




    }


