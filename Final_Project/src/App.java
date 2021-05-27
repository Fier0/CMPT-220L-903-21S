public class App {
    public static void main(String[] args) throws Exception {
        //create Binary Tree Object
        tree bst = new tree();

        /* Example Tree Diagram:
                   50 
                 /     \ 
                25      80 
               /  \    /   
              18   45  69   */

        // inserting the data values
        
        bst.insert(50);
        bst.insert(25);
        bst.insert(18);
        bst.insert(45);
        bst.insert(80);
        bst.insert(69);
        

        //printing tree & Depth First Searches
        System.out.println("In Order:");
        bst.inOrder_Traverse();
        System.out.println("");
        System.out.println("Pre Order:");
        bst.preOrder_Traverse();
        System.out.println("");
        System.out.println("Post Order:");
        bst.postOrder_Traverse();

        
        // Printing tree with Breadth First Search
        System.out.println("");
        System.out.println("Printing Tree with Breadth First Search:");
        bst.breadthSearch();

        // Finding Elements
        System.out.println("");
        bst.search(18);
        bst.search(420);

        //Finding smallest and largest in the tree
        bst.getSmallest();
        bst.getLargest();

        // Nth largest
        bst.getNthLargest(2);
        bst.getNthLargest(3);

        //Finding tree height
        bst.height();

        //Removing Nodes (Removing node 25)
        /*    New Tree:
                    50
                  /    \
                 18     80
                   \    /
                   45  69 */
        
        bst.delete(25);
        System.out.println("");
        System.out.println("New tree In Order:");
        bst.inOrder_Traverse();

        //Reorganizing the tree
        //This puts all values in the tree into a straight line
        bst = bst.reorganize();
        //Checking for the order
        //Since both are the same the order of the tree has been changed
        System.out.println("");
        System.out.println("Verifying reorganization");
        System.out.println("In Order:");
        bst.inOrder_Traverse();
        System.out.println("");
        System.out.println("Pre Order:");
        bst.preOrder_Traverse();

    }
}
