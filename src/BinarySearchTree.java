import java.util.*;

public class BinarySearchTree {
    public class Node{
        private int data;
        private Node left;
        private Node right;

        public Node(int data){
            this.data= data;
        }
    }
    private Node root;


    public boolean insert(int data) {
        root = insert(root, data);
        return true;
    }

    private Node insert(Node node, int data) {

        /**
         * If Node is null, either tree is empty or this is the
         * leaf node and we can create the node and return the new node.
         */
        if (node == null) {
            return new Node(data);
        }

        //if data is less than the current element,

        if (node.data > data) {
            node.left = insert(node.left, data);
        }

        //If data is greater than the current element,

        if (node.data < data) {
            node.right = insert(node.right, data);
        }

        else{
            return node;
        }
        return node;
    }
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(52);
        bst.insert(15);
        bst.insert(56);
        bst.insert(9);
        bst.insert(11);
        bst.insert(54);
        bst.insert(3);
        bst.insert(5);
        bst.insert(61);
    }

}
