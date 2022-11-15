public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();

       }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        int i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        System.out.println(arr[i-1]);
        return arr;

    }




    }


