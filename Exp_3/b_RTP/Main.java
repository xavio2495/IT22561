class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}


class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog: Woof! Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat: Meow! Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        System.out.print("Generic Animal: ");
        genericAnimal.makeSound();

        Dog myDog = new Dog();
        System.out.print("My Dog: ");
        myDog.makeSound();

        Cat myCat = new Cat();
        System.out.print("My Cat: ");
        myCat.makeSound();

        
        System.out.println("\n--- Demonstrating Polymorphism ---");

        Animal polymorphicDog = new Dog();
        System.out.print("Polymorphic Dog: ");
        polymorphicDog.makeSound();

        Animal polymorphicCat = new Cat();
        System.out.print("Polymorphic Cat: ");
        polymorphicCat.makeSound();
        }
    }
