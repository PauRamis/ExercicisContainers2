import java.util.Iterator;

import com.sun.tools.javac.Main;

import java.util.Iterator;

public class ex1 {
    public static void main(String[] args) {
        for (Integer i : new Sequence()) {
            System.out.println(i);
        }

        /*Sequence sequence = new Sequence();
        Iterator<Integer> it = sequence.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }*/
    }

    //1- Tenim una classe anomenada «Sequence»:
    static class Sequence implements Iterable<Integer> {
        private int[] data = {1, 5, 6, 7, -1, 2};

        @Override
        public Iterator<Integer> iterator() {
            return new Iterator<Integer>() {
                int pos = 0;

                @Override
                public boolean hasNext() {
                    return pos < data.length;
                }

                @Override
                public Integer next() {
                    return data[pos++];
                }
            };
        }
    }
}
