import java.util.Arrays;

public class FindTheStrayNumber {
    public static void main(String[] args) {
        int[] mas = {17, 17, 3, 17, 17, 17, 17};
        System.out.println(stray(mas));
    }

    static int stray(int[] numbers) {
        return Arrays.stream(numbers).reduce(0, (a, b) -> a ^ b);
    }
}
