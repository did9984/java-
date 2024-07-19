package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.setValue(10);

        Integer value = (Integer) integerBox.getValue(); //Object-> Integer 로 다운캐스팅

        System.out.println("value = " + value);

        ObjectBox stringBox = new ObjectBox();
        stringBox.setValue("hello");
        String str = (String) stringBox.getValue();  //Object-> String 로 다운캐스팅
        System.out.println("str = " + str);

        //잘못된 타입의 인수 전달
        integerBox.setValue("숫자100");
        Integer intValue = (Integer) integerBox.getValue(); //String -> Integer 로 캐스팅 예외
        System.out.println("intValue = " + intValue);
    }
}
