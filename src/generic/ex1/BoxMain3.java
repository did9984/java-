package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {

        GenericBox<Integer> integerBox = new GenericBox<Integer>(); // 생성 시점에서 타입매개변수 결정
        integerBox.setValue(100);
//        integerBox.setValue("문자100"); // Integer 타입만 허용
        Integer value = integerBox.getValue(); // Integer 타입 변환(캐스팅 X)
        System.out.println("value = " + value);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.setValue("hello");
        String str = stringBox.getValue();
        System.out.println("str = " + str);

        //원하는 타입 가능
        GenericBox<Double> doubleBox = new GenericBox<Double>();
        doubleBox.setValue(2.5);
        Double doubleValue = doubleBox.getValue();
        System.out.println("doubleValue = " + doubleValue);
    }
}
