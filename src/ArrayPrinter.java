import java.util.Arrays;

public class ArrayPrinter {
    public static void main(String[] args) {
    }
    public static String printArray(Object[] array) {
        String str = "";
        for (int i = 0; i < array.length; i++) {
            str += array[i] + ",";
        }
        str = str.substring(0, str.length()-1);
        return str;
    }
}
// return Arrays.stream(array).map(Object::toString).collect(Collectors.joining(","));
// return Arrays.toString(a).replaceAll("[\\[\\]\\s]", "");