import java.time.*;
public class Pro15 {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time: " + currentTime);

        String str1 = "Welcome";
        for(int i = 1; i <= 100000; i++){
            str1 = str1 + " Welcome";
        }

        currentTime = LocalTime.now();
        System.out.println("Current time: " + currentTime);
    }
}
