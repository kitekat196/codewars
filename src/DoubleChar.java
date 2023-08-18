public class DoubleChar {
    public static void main(String[] args) {
        System.out.println(solution("String"));
    }


    public static String solution(String str){
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            char buff = str.charAt(i);
            newString = newString + buff + "" + buff;
        }
        return newString;
    }
}
//str.replaceAll(".", "$0$0");