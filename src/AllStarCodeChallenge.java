public class AllStarCodeChallenge {
    public static int strCount(String str, char letter) {
        return (int) str.chars().filter(c -> c == letter).count();
    }
}
