import java.util.*;

class Animals {
    void makeSound() {
        System.out.println("Nothing");
    }
}

class Dog extends Animals {
    void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animals {
    void makeSound() {
        System.out.println("Meow");
    }
}

public class Animal {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Animals[] myAnimal = new Animals[3];
        int count = 0;
        
        while (true) {
            System.out.println("Wanna add an animal?\n0. No\n1. Yes");
            int choice = scanner.nextInt();
            
            if (choice == 0) {
                break;
            } else if (choice == 1) {
                System.out.println("Which animal to add?\n0. Dog\n1. Cat");
                int animalChoice = scanner.nextInt();
                
                if (animalChoice == 0) {
                    if (count < myAnimal.length) {
                        myAnimal[count] = new Dog();
                        count++;
                    } else {
                        System.out.println("No more space for animals.");
                    }
                } else if (animalChoice == 1) {
                    if (count < myAnimal.length) {
                        myAnimal[count] = new Cat();
                        count++;
                    } else {
                        System.out.println("No more space for animals.");
                    }
                } else {
                    System.out.println("Invalid choice.");
                }
            } else {
                System.out.println("Invalid choice.");
            }
        }
        
        System.out.println("All animals in the list:");
        for (int i = 0; i < count; i++) {
            myAnimal[i].makeSound();
        }
    }
}
