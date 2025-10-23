package praktikum2;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("anjing");
        Duck duck = new Duck("bebek");

        dog.eat();
        dog.makeSound();
        dog.swim();

        duck.eat();
        duck.makeSound();
        duck.fly();
        duck.swim();
    }
}
