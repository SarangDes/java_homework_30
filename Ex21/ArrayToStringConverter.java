public class ArrayToStringConverter {

    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] emptyArray = {};
        System.out.println("Empty array: " + arrayToString(emptyArray));

        int[] oneElementArray = {5};
        System.out.println("One-element array: " + arrayToString(oneElementArray));

        int[] nElementArray = {1, 2, 3, 4};
        System.out.println("n-element array: " + arrayToString(nElementArray));
    }
}
