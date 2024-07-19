package generic.test.ex3;


import generic.animal.Animal;

public class AnimalHospitalV3<T extends Animal> {

    private T animal;

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public void checkUp(){
        // T의 타입을 메서드를 정의하는 시점에는 알수없다. Object의 기능만 사용
        System.out.println("동물 이름: " +animal.getName());
        System.out.println("동물 크기: " +animal.getSize());
        animal.Sound();
    }

    public T bigger(T target){

        return animal.getSize() > target.getSize() ? animal : target;
    }
}
