public class Program2c {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        System.out.println("Original Array:");
        printArray(originalArray);

        int[] reversedArray = new int[originalArray.length];
        for (int i = originalArray.length - 1; i >= 0; i--) {
            reversedArray[originalArray.length - 1 - i] = originalArray[i];
        }

        System.out.println("Reversed Array:");
        printArray(reversedArray);
    }

    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}