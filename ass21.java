import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int complement = target - arr[i];

            if (map.containsKey(complement)) {

                int index1 = map.get(complement);
                int index2 = i;

                // Print indices in ascending order
                System.out.println("[" + index1 + ", " + index2 + "]");
                return;
            }

            map.put(arr[i], i);
        }

        // No pair found
        System.out.println("[-1, -1]");
    }
}
