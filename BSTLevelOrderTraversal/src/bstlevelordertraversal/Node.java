/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bstlevelordertraversal;

/**
 * @author Szilard
 */
public class Node {
    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}
