package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Arne", "Bruce", "Chuck", "Slay"));
        for (String s : list) {
            if (s.equals("Chuck")) list.remove(s);
        }
        System.out.println(list);

        List<String> list1 = Arrays.asList("Arne", "Bruce", "Chuck", "Slay");
        System.out.println(list1.getClass());

        List<String> list2 = List.of("Arne", "Bruce", "Chuck", "Slay");
        System.out.println(list2.getClass());
    }
}
