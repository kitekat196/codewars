public class SelectiveFearOfNumbers {
    public static void main(String[] args) {
        System.out.println(AmIAfraid("Sunday",-666));
    }

    static public boolean AmIAfraid(final String day, final int num) {
        switch (day) {
            case "Monday" -> {
                if (num == 12) {
                    return true;
                }
            }
            case "Tuesday" -> {
                if (num > 95) {
                    return true;
                }
            }
            case "Wednesday" -> {
                if (num == 34){
                    return true;
                }
            }
            case "Thursday" -> {
                if (num == 0){
                    return true;
                }
            }
            case "Friday" -> {
                if (num % 2 == 0){
                    return true;
                }
            }
            case "Saturday" -> {
                if (num == 56){
                    return true;
                }
            }
            case "Sunday" -> {
                if (num == 666 || num == -666){
                    return true;
                }
            }
        }
        return false;
    }
}
 /*
 return switch (day) {
            case "Monday" -> num == 12;
            case "Tuesday" -> num > 95;
            case "Wednesday" -> num == 34;
            case "Thursday" -> num == 0;
            case "Friday" -> num % 2 == 0;
            case "Saturday" -> num == 56;
            case "Sunday" -> Math.abs(num) == 666;
            default -> throw new IllegalArgumentException("Unknown day!");
        };
  */