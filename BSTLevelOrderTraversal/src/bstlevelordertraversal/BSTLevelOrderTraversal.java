/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bstlevelordertraversal;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Szilard
 */
/*
A level-order traversal, also known as a breadth-first search, 
visits each level of a tree's nodes from left to right, top to bottom. 
You are given a pointer, pointing to the root of a binary search tree. 
Complete the levelOrder function provided in your editor 
so that it prints the level-order traversal of the binary search tree.
*/
public class BSTLevelOrderTraversal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Node root = null;
        int[] items = {3, 5, 4, 7, 2, 1};
        for(int item : items){
            root = insert(root, item);
        }
        
        levelOrder(root);
    }
    
    public static Node insert (Node root, int data){
        if (root == null) {
            return new Node(data);
        }
        else {
            Node current;
            if (data <= root.data) {
                current = insert(root.left, data);
                root.left = current;
            }
            else {
                current = insert(root.right, data);
                root.right = current;
            }
            return root;
        }
    }
    
    static void levelOrder(Node root){
        Queue<Node> tree = new LinkedList<>();
        
        if (root != null) {
            tree.add(root);
        }
        
        while (!tree.isEmpty()){
            Node current = tree.remove();
            
            System.out.print(current.data + " ");
            
            if (current.left != null) {
                tree.add(current.left);
            }
            
            if (current.right != null) {
                tree.add(current.right);
            }
        }
    }    
}
