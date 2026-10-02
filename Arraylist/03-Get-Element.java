import java.util.ArrayList;

public class GetElement {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Element at index 2: " + list.get(2));
    }
}
