import java.util.*;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Anonymous Class
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });

        // Using Lambda Expression
        // Collections.sort(names, (s1, s2) -> s1.compareTo(s2));

        System.out.println("Sorted Names: " + names);
    }
}
