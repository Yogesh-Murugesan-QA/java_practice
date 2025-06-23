import java.util.HashSet;


    public class MissingNumberSet {
        public static void main(String[] args) {
            int[] arr = {1, 4, 3, 5, 6}; // missing 2
            int n = arr.length + 1;

            HashSet<Integer> set = new HashSet<>();

            // Add array elements to HashSet using index-based loop
            for (int i = 0; i < arr.length; i++) {
                set.add(arr[i]);
            }

            // Check from 1 to n using standard for loop
            for (int i = 1; i <= n; i++) {
                if (!set.contains(i)) {
                    System.out.println("Missing number is: " + i);
                    break;
                }
            }
        }
    }


