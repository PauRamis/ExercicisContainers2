import java.util.ArrayList;
import java.util.List;

public class ex7 {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Dog());
        animals.add(new Dog());
        animals.add(new Cat());

        for (Animal animal : animals){
            animal.sound();
        }
    }
}

abstract class Animal{
    public abstract void sound();
}

class Cat extends Animal{
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}

class Dog extends Animal{
    @Override
    public void sound() {
        System.out.println("Woof");
    }
}
