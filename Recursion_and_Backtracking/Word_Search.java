import java.util.ArrayList;
import java.util.List;

public class Word_Search {
    static char[][] grid = {
        {'C', 'A', 'T', 'S'},
        {'O', 'R', 'E', 'A'},
        {'D', 'E', 'A', 'M'},
        {'E', 'L', 'L', 'S'}
    };
    static String word = "DREAM";
    static boolean[][] used = new boolean[grid.length][grid[0].length];
    static int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dc = {-1, 0, 1, -1, 1, -1, 0, 1};
    static List<String> path = new ArrayList<>();
    static int count;

    static void find(int r, int c, int i) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length)
            return;
        if (used[r][c] || grid[r][c] != word.charAt(i))
            return;

        used[r][c] = true;
        path.add("(" + r + "," + c + ")");
        if (i == word.length() - 1) {
            count++;
            System.out.println(path);
        } else {
            for (int d = 0; d < dr.length; d++)
                find(r + dr[d], c + dc[d], i + 1);
        }
        path.remove(path.size() - 1);
        used[r][c] = false;
    }

    public static void main(String[] args) {
        for (int r = 0; r < grid.length; r++)
            for (int c = 0; c < grid[0].length; c++)
                find(r, c, 0);
        System.out.println("Found: " + (count > 0));
        System.out.println("Paths: " + count);
    }
}
