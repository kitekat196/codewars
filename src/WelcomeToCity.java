public class WelcomeToCity {
    public static void main(String[] args) {
        String[] asd = {"pipa", "pupa"};
        System.out.println(sayHello( asd, "asd", "zxc"));
    }
    public static String sayHello(String [] name, String city, String state){
       String str = "Hello,";
        for (int i = 0; i < name.length; i++) {
            str += " " + name[i] ;
        }
        str += "! Welcome to " + city + ", " + state + "!";
        return str;
    }
}
// return String.format("Hello, %s! Welcome to %s, %s!",String.join(" ", name),city,state);