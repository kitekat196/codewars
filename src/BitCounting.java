public class BitCounting {
    public static void main(String[] args) {
        System.out.println(countBits(1234)); //4
    }
    public static int countBits(int n){
       return Integer.bitCount(n);
    }
}
