public class Pro10 {
    public static void main(String[] args) {
        String str1 = "Welcome";

        System.out.println(str1.equals("Welcome"));
        System.out.println(str1.equals("WELCOME"));
        System.out.println(str1.equalsIgnoreCase("WELCOME"));
        System.out.println(str1.compareTo("Welcome"));
        System.out.println(str1.compareTo("WElcome"));
        System.out.println(str1.compareTo("welcome"));
        System.out.println(str1.compareToIgnoreCase("welcome"));
        System.out.println(str1.compareTo("telcome"));
    }
}
