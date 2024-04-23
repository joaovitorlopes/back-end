package Exercises;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    public void wagTail() {
        System.out.println("The dog is wagging its tail");
    }
}
