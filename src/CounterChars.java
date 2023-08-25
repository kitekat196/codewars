import java.util.Scanner;
public class CounterChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(asd(sc.nextLine(), sc.nextLine().charAt(0)));
    }
    public static int asd(String str, char ch){
        return (int) str.chars().filter(x -> x == ch).count();
    }
}
