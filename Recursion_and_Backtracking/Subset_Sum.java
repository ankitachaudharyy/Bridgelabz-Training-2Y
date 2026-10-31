import java.util.ArrayList;
import java.util.List;

public class Subset_Sum {
    static boolean find(int[] a, int i, int sum, int target, List<Integer> path) {
        if (sum == target) {
            System.out.println(path);
            return true;
        }
        if (i == a.length || sum > target)
            return false;

        path.add(a[i]);
        if (find(a, i + 1, sum + a[i], target, path))
            return true;
        path.remove(path.size() - 1);
        return find(a, i + 1, sum, target, path);
    }

    public static void main(String[] args) {
        int[] a = {3, 34, 4, 12, 5, 2};
        System.out.println("Found: " + find(a, 0, 0, 9, new ArrayList<>()));
    }
}
