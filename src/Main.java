import java.util.*;

class Main {

    // Comparator to sort 2D ArrayList lexicographically
    public static void sort2DArrayList(ArrayList<ArrayList<Integer>> list) {
        Collections.sort(list, new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> sublist1, ArrayList<Integer> sublist2) {
                int minLength = Math.min(sublist1.size(), sublist2.size());
                for (int i = 0; i < minLength; i++) {
                    int valueComparison = Integer.compare(sublist1.get(i), sublist2.get(i));
                    if (valueComparison != 0) {
                        return valueComparison;
                    }
                }
                return Integer.compare(sublist1.size(), sublist2.size());
            }
        });
    }

    // Recursive helper function to find subsets
    public static void findSubsets(int index, int[] arr, ArrayList<Integer> current, ArrayList<ArrayList<Integer>> result) {
        if (index == arr.length) {
            if (!current.isEmpty())  // skip empty subset
                result.add(new ArrayList<>(current));
            return;
        }

        // Include current element
        current.add(arr[index]);
        findSubsets(index + 1, arr, current, result);

        // Exclude current element
        current.remove(current.size() - 1);
        findSubsets(index + 1, arr, current, result);
    }

    // Function to return all subsets of the array
    public static ArrayList<ArrayList<Integer>> subsets(int[] arr, int n) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        findSubsets(0, arr, new ArrayList<>(), result);
        return result;
    }

    // Main method
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] A = new int[n];
            for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
            }

            Arrays.sort(A);
            ArrayList<ArrayList<Integer>> res = subsets(A, n);
            sort2DArrayList(res);

            for (ArrayList<Integer> subset : res) {
                for (int num : subset) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
    }
}
