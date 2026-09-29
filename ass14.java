class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

class Rabbit extends Animal {

    void jump() {
        System.out.println("Rabbit is jumping");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Rabbit rabbit = new Rabbit();

        System.out.println("Dog:");
        dog.eat();
        dog.sleep();
        dog.bark();

        System.out.println("\nRabbit:");
        rabbit.eat();
        rabbit.sleep();
        rabbit.jump();
    }
}
