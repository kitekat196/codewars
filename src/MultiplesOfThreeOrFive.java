public class MultiplesOfThreeOrFive {
    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    public static int solution(int number){
        int sum = 0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0){
                sum+= i;
            }
        }
        return sum;
    }
}
//return IntStream.range(3, number).filter(n -> n % 3 == 0 || n % 5 == 0).sum();
