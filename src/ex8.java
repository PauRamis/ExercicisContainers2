import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ex8 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();
        fill(l1);
        List<Integer> l2 = new LinkedList<Integer>();
        fill(l2);
        test(l1);
        test(l2);
    }

    private static void test(List<Integer> list) {
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            list.get((int) (Math.random() * list.size()));
        }
        long time2 = System.currentTimeMillis();
        long elapsedMillis = time2 - time1;
        System.out.println("Test lasted: " + elapsedMillis + "ms");
    }

    private static void fill(List<Integer> list) {
        for (int i = 0; i < 5_000_000; i++) {
            list.add((int) (Math.random() * 10_000));
        }
    }

}
