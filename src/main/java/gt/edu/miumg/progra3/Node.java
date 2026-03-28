/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.miumg.progra3;

/**
 *
 * @author melgust
 */
public class Node {

    int data;
    Node next;

    public Node() {
    }
    
    /**
     * Este es un comentario en codigo fuente
     * @param data 
     */
    public Node(int data) {
        this.data = data;
    }

    /**
     * Para obtener datos del nodo
     * @return objeto persona
     */
    public int getData() {
        return data;
    }

    public void setData(char data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
