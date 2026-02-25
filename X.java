import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class X {
    public static void main(String [] args) {
        List<String> names = Arrays.asList("John", "Alice", "Aliz", "Bob", "Alice");
        Collections.sort(names);
        System.out.println(names);
    }
}
