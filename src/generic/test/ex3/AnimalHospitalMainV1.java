package generic.test.ex3;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍이1",100);
        Cat cat = new Cat("냐옹이1",300);

        // 개 병원
        dogHospital.setAnimal(dog);
        dogHospital.checkUp();

        //고양이 병원
        catHospital.setAnimal(cat);
        catHospital.checkUp();

        // 개타입변환
        dogHospital.setAnimal(dog);

        Dog biggerDog = (Dog) dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
