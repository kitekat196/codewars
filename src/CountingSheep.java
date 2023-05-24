import java.util.Arrays;

public class CountingSheep {
    public static void main(String[] args) {
        Boolean[] arrayOfSheeps = {true, false, true, true, false};
        System.out.println(countSheeps(arrayOfSheeps));
    }
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        return (int)Arrays.stream(arrayOfSheeps).filter(x -> x == Boolean.TRUE).count();
    }
}