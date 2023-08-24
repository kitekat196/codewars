public class RGBToHexConversion {
    public static String rgb(int r, int g, int b) {
        String strRGB = "";
        int[] numb = new int[]{r, g ,b};
        for (int i = 0; i < numb.length; i++) {
            if (numb[i] > 9 && numb[i] <= 255){
                strRGB += Integer.toHexString(numb[i]).toUpperCase();
            } else if (numb[i] < 0) {
                strRGB += "00";
            } else if (numb[i] > 255){
                strRGB += Integer.toHexString(255).toUpperCase();
            }
             else {
                strRGB += 0 + "" + numb[i];
            }
        }
        return strRGB;
    }

}
/*
String.format("%02X%02X%02X",
        r >= 0 ? r <= 255 ? r : 255 : 0,
        g >= 0 ? g <= 255 ? g : 255 : 0,
        b >= 0 ? b <= 255 ? b : 255 : 0);
 */
