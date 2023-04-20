import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ex4 {
    public static void main(String[] args) {
        List<Country> list = new ArrayList<>();
        list.add(new Country("USA"));
        list.add(new Country("SPAIN"));
        list.add(new Country("GERMANY"));
        Collections.shuffle(list);
        System.out.println(list);
    }
}

class Country {
    String name;
    int population;

    public Country(String name) {
        this.name = name;
    }

    /*public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }*/

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                '}';
    }
}