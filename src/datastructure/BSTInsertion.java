/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

/**
 *
 * @author Dinesh kumar jain
 */
public class BSTInsertion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        static Node Insert(Node root,int value) {
Node newNode = new Node();
    newNode.data = value;

    if (root == null) {       
        return newNode;
    }

    Node iterator = root;
    while (iterator != null) {
        if (value < iterator.data) {
            if (iterator.left == null) {
                iterator.left = newNode;
                break;
            }
            iterator = iterator.left;
        } else {
            if (iterator.right == null) {
                iterator.right = newNode;
                break;
            }
            iterator = iterator.right;
        }
    }
    return root;
 
    }
    
}
