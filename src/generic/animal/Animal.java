package generic.animal;

public class Animal {
    private String name;
    private int size;

    public Animal(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Aniaml{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    public void Sound(){
        System.out.println("동물 울음 소리");
    }
}
