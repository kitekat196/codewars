public class NameOnBillboard {
    public static int billboard(String name, int price) {
        int count = 0;
        for (int i = 0; i < name.length(); i++){
            count += price;
        }
        return count;
    }
}
