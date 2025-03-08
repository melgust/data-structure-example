/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.miumg.progra3;

/**
 *
 * @author melgust
 */
public class Tree {
    
    NodeTree root;
    
    public boolean isEmpty() {
        return root == null;
    }
    
    public void add(int data) {
        NodeTree nodeTree = new NodeTree(data);
        if (root == null) {
            root = nodeTree;
        } else {
            addRecursive(nodeTree, root);
        }
    }
    
    public void addRecursive(NodeTree newNode, NodeTree node) {
        if (node.getData() > newNode.getData()) {
            if (node.getRight() == null) {
                node.setRight(newNode);
            } else {
                addRecursive(newNode, node.getRight());
            }
        } else {
            
        }
    }
    
}
