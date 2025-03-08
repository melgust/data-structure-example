/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.miumg.progra3;

/**
 *
 * @author melgust
 */
public class NodeTree {
    
    private NodeTree left;
    private int data;
    private NodeTree right;
    
    public NodeTree(int data) {
        this.left = null;
        this.data = data;
        this.right = null;
    }

    public NodeTree getLeft() {
        return left;
    }

    public int getData() {
        return data;
    }

    public NodeTree getRight() {
        return right;
    }

    public void setLeft(NodeTree left) {
        this.left = left;
    }

    public void setRight(NodeTree right) {
        this.right = right;
    }

    
    
}
