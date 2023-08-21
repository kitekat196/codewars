public class NoZerosForHeros {
    public static int noBoringZeros(int n) {
        String nstr = n+"";
        for (int i = nstr.length()-1; i > 1; i--) {
            if (nstr.charAt(i) == '0'){
               nstr = nstr.substring(0, i);
            } else  {
                return Integer.parseInt(nstr);
            }
        }

        return Integer.parseInt(nstr);
    }

}
 //return n == 0 || n % 10 != 0 ? n : noBoringZeros(n/10);