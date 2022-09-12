import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        List<Integer> list = new ArrayList<>(List.of(1, 3, 8, 5, 2, 4));
        Integer[] arr = new Integer[0];
        arr = list.toArray(arr);
        for (Integer x : arr) {
            System.out.print(x+" ");
        }
        System.out.println();

        List<Integer> list1 = list.subList(2, 4);
        list1.add(17);
        list1.remove(0);
        list.set(2, 55);
        System.out.println(list1);
        System.out.println(list);
    }
}
