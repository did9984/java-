package generic.test.ex5;

import generic.animal.Animal;

public class WildcardEx {

    static <T> void printGenericV1(Box<T> box){
        System.out.println("T = " + box.getValue());
    }

    static void printWildcardV1(Box<?> box){
        System.out.println("? = " + box.getValue());
    }

    static <T extends Animal> void printGenericV2(Box<T> box){
        T t = box.getValue();
        System.out.println("t.getName() = " + t.getName());

    }
    static <T extends Animal>T printAndReturnGeneric(Box<T> box){
        T t = box.getValue();
        System.out.println("t.getName() = " + t.getName());
        return t;
    }

    static void printWildcardV2(Box<? extends Animal> box){
        Animal animal = box.getValue();
        System.out.println("t.getName() = " + animal.getName());
    }

    static Animal printAndReturnWildcard(Box<? extends Animal> box){
        Animal animal = box.getValue();
        System.out.println("t.getName() = " + animal.getName());
        return animal;
    }
}
