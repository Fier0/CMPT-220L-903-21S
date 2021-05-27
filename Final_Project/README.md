# Binary Search Tree

A binary Search Tree is a method of organizing, storing, and searching for data.
Program created by Alex Hanys

## Creating Elements
Here is how you initialize the tree and fill it with values.

### Create a BST

```java
tree tree_name = new tree();
```
Replace `tree_name` with the name of your tree.
### Inserting Elements

```java
tree_name.insert(value);
```
Replace `value` with the `integer` value of the data. This will generate the tree in the order you insert the data.
## Searching the Tree
For finding information about your created tree.

### Finding Elements
```java
tree_name.search(value);
```
Replace `value` with the `integer` of the data you are looking for. This will print out one of 2 options depending on if the value being searched for is present in the tree.
```
Your item 18 is in this tree.
Your item 420 is not in this tree.
```
### Finding the Height of the Tree
```java
tree_name.height();
```
Prints out the height of the tree.
```
The height is: 3
```
### Finding the Smallest and Largest Elements
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
### Nth Largest element 
This function finds the `n`th largest element, where `n` is the number from the largest.
```java
tree_name.getNthLargest(value);
```
Replace `value` with the distance from the largest you are looking for.

This prints out the requested value.
```

```