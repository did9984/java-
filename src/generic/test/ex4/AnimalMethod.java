package generic.test.ex4;

import generic.animal.Animal;
import generic.animal.Dog;

public class AnimalMethod {

    public static<T extends Animal> void checkup(T t) {
        System.out.println("동물 이름: " +t.getName());
        System.out.println("동물 크기: " +t.getSize());
        t.Sound();
    }

    public static <T extends Animal> T bigger(T t1,T t2){
        return t1.getSize() > t2.getSize() ? t1 : t2;
    }

}
