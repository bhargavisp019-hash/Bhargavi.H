import java.util.ArrayList;

public class TodoList {
    public static void main(String[] args) {

        // Create an ArrayList of tasks
        ArrayList<String> tasks = new ArrayList<>();

        // Adding tasks
        tasks.add("Complete Java assignment");
        tasks.add("Study for exam");
        tasks.add("Go for a walk");
        tasks.add("Read a book");

        System.out.println("To-Do List:");
        for (String task : tasks) {
            System.out.println(task);
        }

        // Removing a task
        tasks.remove("Go for a walk");

        System.out.println("\nAfter removing a task:");

        // Iterating again
        for (String task : tasks) {
            System.out.println(task);
        }
    }
}
