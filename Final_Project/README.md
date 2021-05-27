# Binary Search Tree

A binary Search Tree is a method of organizing, storing, and searching for data.
Program created by Alex Hanys

## Creating Elements
Here is how you initialize the tree and fill it with values.

### **Create a BST**

```java
tree tree_name = new tree();
```
Replace `tree_name` with the name of your tree.
### **Inserting Elements**

```java
tree_name.insert(value);
```
Replace `value` with the `integer` value of the data. This will generate the tree in the order you insert the data.
## Searching the Tree
For finding information about your created tree.

### **Finding Elements**
```java
tree_name.search(value);
```
Replace `value` with the `integer` of the data you are looking for. This will print out one of 2 options depending on if the value being searched for is present in the tree.
```
Your item 18 is in this tree.
Your item 420 is not in this tree.
```
### **Finding the Height of the Tree**
```java
tree_name.height();
```
Prints out the height of the tree.
```
The height is: 3
```
### **Finding the Smallest and Largest Elements**
The commands `getSmallest()` and `getLargest()` are used to find the smallest and largest values in the tree.
```java
tree_name.getSmallest();
tree_name.getLargest();
```
These will print out either the smallest value or the largest value.
```
The smallest value in the tree is: 18
The largest value in the tree is: 80
``` 
### **Nth Largest element**
This function finds the `n`th largest element, where `n` is the number from the largest.
```java
tree_name.getNthLargest(value);
```
Replace `value` with the distance from the largest you are looking for.

This prints out the requested value.
```
the 2nd largest value in the tree is: 69
```
## Manipulating the Tree
For making changes to the tree after creation.
### **Deleting Elements**
This is used to remove elements from your tree.
```java
tree_name.remove(value);
```
replace `value` with the integer value of the node you want to remove.
### **Tree Reorganization**
This will re-order the tree so that everything is in one line without any branching paths.
```java
tree_name = tree_name.reorganize();
```
If you would like to make a copy of the tree that is reorganized replace the first `tree_name` with a different tree.
## Tree Traversals and Depth First Searches
These are used to print out the tree in a specific order (`in-order`, `pre-order`, `post-order`)
### **Listing Elements**
The Functions to list the elements are `inOrder_Traverse()`, `preOrder_Traverse()`, and `postOrder_Traverse()`. 
```java
tree_name.inOrder_Traverse();
tree_name.preOrder_Traverse();
tree_name.postOrder_Traverse();
```
They will print out the elements of the tree in their respective orders.
```
In Order:
18 25 45 50 69 80 
Pre Order:        
50 25 18 45 80 69 
Post Order:
18 45 25 69 80 50
```
**Note: They will only print out the values, no words.
## Other Searches
Here is another searching method.
### **Breadth First Search**
This is used to list out the tree's values using a breadth first search method.
```java
tree_name.breadthSearch();
```
this will print out the tree in it's order.
```
50 25 80 18 45 69
```