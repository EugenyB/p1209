package sets;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Set<Integer> set = new HashSet<>();
        set.add(16);
        for (int i = 0; i < 10; i++) {
            set.add(i);
        }
        set.add(18);
//        set.add(20);

        System.out.println(set);
    }
}
