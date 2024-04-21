import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A3 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("ASH");
        strings.add("YASH");
        strings.add("VARUN");
        strings.add("VABS");

        Collections.reverse(strings);

        System.out.println("Reversed List:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
