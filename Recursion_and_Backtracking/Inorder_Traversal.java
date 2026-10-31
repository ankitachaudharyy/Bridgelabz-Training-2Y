import java.util.ArrayDeque;
import java.util.Deque;

public class Inorder_Traversal {
    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    static void rec(Node n) {
        if (n == null)
            return;
        rec(n.left);
        System.out.print(n.val + " ");
        rec(n.right);
    }

    static void iter(Node root) {
        Deque<Node> st = new ArrayDeque<>();
        Node cur = root;
        while (cur != null || !st.isEmpty()) {
            while (cur != null) {
                st.push(cur);
                cur = cur.left;
            }
            cur = st.pop();
            System.out.print(cur.val + " ");
            cur = cur.right;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.print("Recursive: ");
        rec(root);
        System.out.print("\nIterative: ");
        iter(root);
    }
}
