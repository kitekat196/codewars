public class TripleTrouble {
    public static String tripleTrouble(String one, String two, String three) {
        String str = "";
        for (int i = 0; i < one.length(); i++) {
            str += "" + one.charAt(i) + two.charAt(i) + three.charAt(i);
        }
       return str;
    }
}
