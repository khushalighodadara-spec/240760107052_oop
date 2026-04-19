import java.util.*;
public class GenericSortDemo {
    public static <T extends Comparable<T>> void sortList(List<T> list) {
        Collections.sort(list);
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        ArrayList<String> names = new ArrayList<>();
        names.add("Riya");
        names.add("Amit");
        names.add("Kiran");
        System.out.println("Before Sorting:");
        System.out.println("Numbers: " + numbers);
        System.out.println("Names: " + names);
        sortList(numbers);
        sortList(names);
        System.out.println("\nAfter Sorting:");
        System.out.println("Numbers: " + numbers);
        System.out.println("Names: " + names);
    }
}
/*Before Sorting:
Numbers: [50, 10, 30]
Names: [Riya, Amit, Kiran]

After Sorting:
Numbers: [10, 30, 50]
Names: [Amit, Kiran, Riya]
  */
