import java.util.PriorityQueue;
import java.util.Queue;

public class ex2 {
    public static void main(String[] args) {
        Queue<Car> pq = new PriorityQueue<Car>();
        pq.offer(new Car("Renault", 15));
        pq.offer(new Car("Fiat", 5));
        pq.offer(new Car("Mercedes", 25));
        pq.offer(new Car("Volkswagen", 20));
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}

class Car implements Comparable<Car> {
    String name;
    int priority;

    public Car(String s, int p) {
        this.name = s;
        this.priority = p;
    }

   @Override
    public String toString() {
        return "Car{" +
                "name= '" + name + '\'' +
                ", pirority=" + priority +
                '}';
    }

    @Override
    public int compareTo(Car car) {
        if (this.priority < car.priority) return 1;
        if (this.priority == car.priority) return 0;
        return 1;
    }
}