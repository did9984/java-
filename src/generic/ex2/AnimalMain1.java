package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain1 {
    public static void main(String[] args) {
        Animal animal = new Animal("동물",0);
        Dog dog = new Dog("멍멍이", 150);
        Cat cat = new Cat("냐옹이",50);

        Box<Dog> dogBox = new Box<>();
        dogBox.setValue(dog);
        System.out.println("dogBox.getValue() = " + dogBox.getValue());

        Box<Cat> catBox = new Box<>();
        catBox.setValue(cat);
        System.out.println("catBox.getValue() = " + catBox.getValue());

        Box<Animal> animalBox = new Box<>();
        animalBox.setValue(animal);
        System.out.println("animalBox.getValue() = " + animalBox.getValue());


    }
}
