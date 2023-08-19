public class StringyStrings {
    public static void main(String[] args) {
        System.out.println(stringy(6));
    }

    public static String stringy(int size) {
        String str = "";
        for (int i = 0; i < (size / 2) + 1; i++) {
            str += "10";
        }
        return str.substring(0,size);
    }
}
//return "10".repeat(size / 2) + (size % 2 != 0 ? '1' : "");

/*
StringBuilder builder = new StringBuilder();
 for (int i = 0; i < size; i++){
    if (i % 2 ==0) {
      builder.append(1);
    } else {
      builder.append(0);
    }
    }
    return builder.toString();
 */