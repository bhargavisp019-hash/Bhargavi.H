class Animal {

    @Override
    public String toString() {
        return "This is an Animal";
    }
}

class Dog extends Animal {

    @Override
    public String toString() {
        return "This is a Dog";
    }
}

class Rabbit extends Animal {

    @Override
    public String toString() {
        return "This is a Rabbit";
    }
}

public class Main {
    public static void main(String[] args) {

        Animal a = new Animal();
        Dog d = new Dog();
        Rabbit r = new Rabbit();

        System.out.println(a);
        System.out.println(d);
        System.out.println(r);
    }
}
