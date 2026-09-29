import java.util.HashSet;

public class DistinctAbsoluteValues {
    public static void main(String[] args) {

        int[] arr = {-5, 5, -2, 2, 3, -3, 3};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(Math.abs(num));
        }

        System.out.println("Number of distinct absolute values: " + set.size());
    }
}
