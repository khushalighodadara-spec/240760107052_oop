import java.util.ArrayList;
class Box<T> {
    ArrayList<T> items = new ArrayList<>();
    void addItem(T item) {
        items.add(item);
    }
    void displayItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}
public class GenericDemo {
    public static void main(String[] args) {
        Box<String> nameBox = new Box<>();
        nameBox.addItem("Amit");
        nameBox.addItem("Riya");
        nameBox.addItem("Kiran");
        Box<Integer> rollBox = new Box<>();
        rollBox.addItem(101);
        rollBox.addItem(102);
        rollBox.addItem(103);
        System.out.println("Names:");
        nameBox.displayItems();

        System.out.println("\nRoll Numbers:");
        rollBox.displayItems();
    }
}
/* Names:
Amit
Riya
Kiran

Roll Numbers:
101
102
103
*/
