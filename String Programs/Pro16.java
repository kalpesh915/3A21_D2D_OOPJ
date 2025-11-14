import java.time.*;
public class Pro16 {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time: " + currentTime);

        StringBuffer str1 = new StringBuffer("Welcome");
        for(int i = 1; i <= 100000; i++){
            str1.append(" Welcome");
        }

        currentTime = LocalTime.now();
        System.out.println("Current time: " + currentTime);
    }
}
