import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");

        System.out.println("Original List: " + list);

        // Accessing elements
        System.out.println("First element: " + list.getFirst());
        System.out.println("Element at index 2: " + list.get(2));

        // Removing elements
        list.remove("Banana");
        System.out.println("After removing Banana: " + list);

        list.removeFirst();
        System.out.println("After removing first element: " + list);

        list.removeLast();
        System.out.println("After removing last element: " + list);
    }
}
