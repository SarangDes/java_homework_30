public class ArrayPrinter {

    public static void printArray(int[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    public static void printArray(double[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    public static void printArray(float[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        int[] intArrayEmpty = {};
        double[] doubleArrayEmpty = {};
        float[] floatArrayEmpty = {};
        
        System.out.print("Empty int array: ");
        printArray(intArrayEmpty);
        
        System.out.print("Empty double array: ");
        printArray(doubleArrayEmpty);
        
        System.out.print("Empty float array: ");
        printArray(floatArrayEmpty);

        int[] intArrayOne = {5};
        double[] doubleArrayOne = {5.5};
        float[] floatArrayOne = {5.5f};

        System.out.print("One-element int array: ");
        printArray(intArrayOne);
        
        System.out.print("One-element double array: ");
        printArray(doubleArrayOne);
        
        System.out.print("One-element float array: ");
        printArray(floatArrayOne);

        int[] intArrayMany = {1, 2, 3, 4};
        double[] doubleArrayMany = {1.1, 2.2, 3.3, 4.4};
        float[] floatArrayMany = {1.1f, 2.2f, 3.3f, 4.4f};

        System.out.print("n-element int array: ");
        printArray(intArrayMany);
        
        System.out.print("n-element double array: ");
        printArray(doubleArrayMany);
        
        System.out.print("n-element float array: ");
        printArray(floatArrayMany);
    }
}
