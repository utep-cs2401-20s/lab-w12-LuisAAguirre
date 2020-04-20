import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class myBinarySearchTreeTester {

    @Test
    /*
    Case will test insert method. A binary search tree will be created manually to ensure values are placed in a specific order.
    A binary search tree will be created using by adding elements using the insert method. The tree created with the
    insert method will have to create a binary search tree that matches the tree created manually.
     */
    public void myBinarySearchTreeTest1() {
        myBinarySearchTreeNode expected = new myBinarySearchTreeNode(15);
        expected.left = new myBinarySearchTreeNode(10);
        expected.right = new myBinarySearchTreeNode(20);
        expected.left.left = new myBinarySearchTreeNode(8);
        expected.left.right = new myBinarySearchTreeNode(12);
        expected.right.left = new myBinarySearchTreeNode(16);
        expected.right.right = new myBinarySearchTreeNode(25);

        int[] A = {15, 10, 20, 8, 12, 16, 25};
        myBinarySearchTreeNode root = new myBinarySearchTreeNode(A[0]);
        for(int i = 1; i < A.length; i++){
            root.insert(A[i]);
        }

        assertEquals(expected.myValue, root.myValue);
        assertEquals(expected.left.myValue, root.left.myValue);
        assertEquals(expected.right.myValue, root.right.myValue);
        assertEquals(expected.left.left.myValue, root.left.left.myValue);
        assertEquals(expected.left.right.myValue, root.left.right.myValue);
        assertEquals(expected.right.left.myValue, root.right.left.myValue);
        assertEquals(expected.right.left.myValue, root.right.left.myValue);
    }

    @Test
    /*
    Case will test insert method and duplicate values. The insert method should ignore duplicate values and it should not
    add them to the binary search tree. A binary search tree will be created manually to ensure values are placed in a
    specific order. A binary search tree will be created from an array with duplicate elements in it. The tree created with the
    insert method will have to create a binary search tree that matches the tree created manually.
     */
    public void myBinarySearchTreeTest2() {
        myBinarySearchTreeNode expected = new myBinarySearchTreeNode(23);
        expected.left = new myBinarySearchTreeNode(11);
        expected.right = new myBinarySearchTreeNode(45);
        expected.left.left = new myBinarySearchTreeNode(6);
        expected.left.right = new myBinarySearchTreeNode(17);
        expected.right.left = new myBinarySearchTreeNode(32);
        expected.right.right = new myBinarySearchTreeNode(65);

        int[] A = {23, 45, 23, 11, 11, 6, 17, 45, 32, 23, 65};
        myBinarySearchTreeNode root = new myBinarySearchTreeNode(A[0]);
        for(int i = 1; i < A.length; i++){
            root.insert(A[i]);
        }

        assertEquals(expected.myValue, root.myValue);
        assertEquals(expected.left.myValue, root.left.myValue);
        assertEquals(expected.right.myValue, root.right.myValue);
        assertEquals(expected.left.left.myValue, root.left.left.myValue);
        assertEquals(expected.left.right.myValue, root.left.right.myValue);
        assertEquals(expected.right.left.myValue, root.right.left.myValue);
        assertEquals(expected.right.left.myValue, root.right.left.myValue);
    }

    @Test
    /*
    This case will test the height method. A binary search tree will be created from an array. The lowest point of the tree
    will have a height of 4. Height method should be able to find that the height of the tree is 4.
     */
    public void myBinarySearchTreeTest3() {
        int[] A = {20, 15, 33, 7, 18, 23, 18, 5, 10, 16, 19, 9, 12};
        myBinarySearchTreeNode root = new myBinarySearchTreeNode(A[0]);
        for(int i = 1; i < A.length; i++){
            root.insert(A[i]);
        }

        assertEquals(4, root.height());
    }

    @Test
    /*
    This case will test the depth method. A binary search tree will be created from an array with 15 elements, which means
    the binary search tree will be full. The test will consist for the depth method to find an element in the third level
    of the binary tree, which will have a depth of two.
     */
    public void myBinarySearchTreeTest4() {
        int[] A = {18, 27, 6, 23, 8, 31, 2, 25, 4, 14, 19, 29, -1, 34, 7};
        myBinarySearchTreeNode root = new myBinarySearchTreeNode(A[0]);
        for(int i = 1; i < A.length; i++){
            root.insert(A[i]);
        }

        assertEquals(2, root.depth(8));
    }

    @Test
    /*
    This case will test the size method. A tree will be created from an array of a particular size. The size method will need
    to be able to find the size of the binary search tree which will be equal to the length of the array.
     */
    public void myBinarySearchTreeTest5() {
        int[] A = {43, 23, 54, 87, 17, 53, 62, 27, 4, -3, 37};
        myBinarySearchTreeNode root = new myBinarySearchTreeNode(A[0]);
        for(int i = 1; i < A.length; i++){
            root.insert(A[i]);
        }

        assertEquals(A.length, root.size());
    }
}
