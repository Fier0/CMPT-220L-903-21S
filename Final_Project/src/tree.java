import java.util.*;
// Class for the tree's code
public class tree {

    // defineing Node
    class Node {
        int key;
        Node left;
        Node right;

        public Node(int data){
            key = data;
            left = null;
            right = null;
        }
    }
    // initialize root Node
    Node root;

    // constructor for tree class
    tree(){
        root = null;
    }
    // The above creates both the tree and the first Node in the tree.

    //inserting elements
    void insert(int key){
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key){
        //if tree is empty
        if (root == null){
            root = new Node(key);
            return root;
        }
        
        // if tree is not empty
        if (key < root.key){
            root.left = insertRec(root.left, key);
        }
        else if (key > root.key){
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    // Traversals
    // These are also the Depth First Searches

    // In Order (Left -> Root -> Right)
    void inOrder(Node node){
        //Check if tree is null
        if (node == null){
            return;
        }

        inOrder(node.left);
        System.out.print(node.key + " ");
        inOrder(node.right);
    }
    void inOrder_Traverse(){
        inOrder(root);
    }

    // Pre Order (Root -> Left -> Right)
    void preOrder(Node node){
        if (node == null){
            return;
        }
        System.out.print(node.key + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
    void preOrder_Traverse(){
        preOrder(root);
    }

    // Post Order (Left -> Right -> Root)
    void postOrder(Node node){
        if (node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.key + " ");
    }
    void postOrder_Traverse(){
        postOrder(root);
    }

    //Deleting Nodes

    void delete(int key){
        root = deleteRec(root, key);
    }

    Node deleteRec(Node root, int key){
        if (root == null){// empty tree
            return root;
        }
        //finding node to delete
        if (key < root.key){
            root.left = deleteRec(root.left, key);
        }
        else if (key > root.key){
            root.right = deleteRec(root.right, key);
        }
        else{
            //if node has 1 child
            if (root.left == null){
                return root.right;
            }
            else if (root.right == null){
                return root.left;
            }
            //if node has 2 child
            root.key = minVal(root.right);
            root.right = deleteRec(root.right, root.key);
        }
        return root;
    }
    int minVal(Node root){
        int min = root.key;
        while (root.left != null){
            min = root.left.key;
            root = root.left;
        }
        return min;
    }

    // Breadth First Search
    void bfs(Node root){
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node temp = queue.poll();
            System.out.print(temp.key + " ");
            if (temp.left != null){
                queue.add(temp.left);
            }
            if (temp.right != null){
                queue.add(temp.right);
            }
        }
    }
    void breadthSearch(){
        bfs(root);
    }

    // Searching for Element
    void search(int key){
        root = searchRec(root,key);
    }
    Node searchRec(Node root, int key){
        if (root == null){// if empty or item is not there
            System.out.println("Your item "+ key + " is not in this tree.");
            return root;
        }
        //finding node to delete
        if (key < root.key){
            root.left = searchRec(root.left, key);
        }
        else if (key > root.key){
            root.right = searchRec(root.right, key);
        }
        else if (key == root.key){
            System.out.println("Your item "+ key + " is in this tree.");
        }
        return root;
    }

    // finding the smallest element
    void getSmallest(){
        smallest(root);
    }

    void smallest(Node node){
        if (node == null){
            return;
        }
        if (node.left != null){
            smallest(node.left);
        }
        else{
            System.out.println("The smallest value in the tree is: " + node.key);
        }
    }

    // finding the largest element
    void getLargest(){
        largest(root);
    }

    void largest(Node node){
        if (node == null){
            return;
        }
        if (node.right != null){
            largest(node.right);
        }
        else{
            System.out.println("The largest value in the tree is: " + node.key);
        }
    }

    // nth largest in tree
    ArrayList<Integer> nth = new ArrayList<Integer>();

    void getNthLargest(int n){
        nth.clear();
        nthLargest(root);
        int val = nth.get(nth.size()-n);
        if (n == 1){
            System.out.println("the "+n+"st largest value in the tree is: " + val);
        }
        else if (n == 2){
            System.out.println("the "+n+"nd largest value in the tree is: " + val);
        }
        else if (n == 3){
            System.out.println("the "+n+"rd largest value in the tree is: " + val);
        }
        else{
            System.out.println("the "+n+"th largest value in the tree is: " + val);
        }
    }

    void nthLargest (Node node){
        if (node == null){
            return;
        }

        nthLargest(node.left);
        nth.add(node.key);
        nthLargest(node.right);
    }

    // Finding the height of the tree
    int getHeight(Node node){
        if (node == null){
            return 0;
        }
        int lh = getHeight(node.left);
        int rh = getHeight(node.right);
        if (lh > rh){
            return lh+1;
        }
        else{
            return rh+1;
        }
    }
    void height(){
        System.out.println("The height is: "+ getHeight(root));
    }

    // Tree Reorganization
    ArrayList<Integer> list = new ArrayList<Integer>();
    tree reorganize(){
        list.clear();
        reorganRec(root);
        tree temp = new tree();
        for (int i : list){
            temp.insert(i);
        }
        return temp;
        
    }
    void reorganRec(Node node){
        if (node == null){
            return;
        }

        reorganRec(node.left);
        list.add(node.key);
        reorganRec(node.right);
    }
}
