import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ex6 {
    public static void main(String[] args) {
        List il = new IntList(new int[]{1, 2, 3});
        // Comprova que el mètode «size()» funciona
        System.out.println(il.size());
        // Comprova que es poden treure elements amb «get()»
        System.out.println(il.get(1));
        // Què passa si intento afegir elements (il.add(10))?
            //Si feim un "il.add(10);" ens torna un error de operació no suportada
        // Recórre la llista amb un Iterador
        Iterator it = il.iterator();
        while (it.hasNext()){
            int element = (Integer) it.next();
            System.out.println(element);
        }
        // Comprova si funciona el mètode «contains()»
        System.out.println(il.contains(5));
        // Comprova si funciona el mètode «sublist()»
        List sublist = il.subList(1,2);
        System.out.println(sublist);
        // Comprova si funciona el mètode «remove()»
        il.remove((Integer)1);
        System.out.println(il);
        // Converteix la llista a un Array d'Objects i imprimeix-la
        Object[] valors = il.toArray();
        System.out.println(Arrays.toString(valors));
    }


}

class IntList extends AbstractList {
    Integer[] data;

    IntList(int[] data) {
        this.data = new Integer[data.length];
        for (int i = 0; i < data.length; i++) {
            this.data[i] = data[i];
        }
    }

    @Override
    public Object get(int index) {
        return data[index];
    }

    @Override
    public int size() {
        return data.length;
    }

    @Override
    public boolean remove(Object o){
        Integer target = (Integer) o;
        Integer[] data2 = new Integer[data.length-1];
        int ind2 = 0;
        boolean removed = false;
        for (int i = 0; i < data.length; i++) {
            if (removed || data[i] != target) {
                data2[ind2] = data[i];
                ind2++;
            } else {
                removed = true;
            }
        }
        this.data = data2;
        return removed;
    }
}