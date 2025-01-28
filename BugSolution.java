public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        if (arr.length > 0) {
            for (int i = 0; i < arr.length; i++) { // Corrected loop
                arr[i] = i * 10;
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}