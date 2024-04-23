package Exercises;

public class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    public void scratch() {
        System.out.println("The Cat is scratching");
    }
}
