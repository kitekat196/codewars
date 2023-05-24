public class PersonalizedMessage {
    public static void main(String[] args) {

    }
    static String greet(String name, String owner) {
        return name.equals(owner) ? "Hello boss" : "Hello guest";
    }
}
