import java.util.stream.IntStream;

public class SumOfMultiples {
    public static void main(String[] args) {
        System.out.println(solution(47 ,9969));
    }
    public static int solution(int n, int m){
        if (n <= 0|| m <= 0) throw new IllegalArgumentException();
        else return IntStream.range(n, m).filter(x -> x % n == 0).sum();
    }
}