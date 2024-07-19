package generic.ex1;

public class RowTypeMain {
    public static void main(String[] args) {
        GenericBox genericBox = new GenericBox();
        genericBox.setValue(10);
        Integer result = (Integer) genericBox.getValue();
        System.out.println("result = " + result);
    }
}
