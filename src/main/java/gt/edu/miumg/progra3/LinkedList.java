/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.miumg.progra3;

/**
 *
 * @author melgust
 */
public class LinkedList {
    
    Node first, last;
    
    public boolean isEmpty() {
        return last == null;
    }
    
    public void push(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            first = node;
            last = node;
        } else {
            last.setNext(node);
            last = node;
        }
    }
    
    public int pop() {
        int data = first.getData();
        first = first.getNext();
        return data;
    }
    
    public int size() {
        Node aux = first;
        int total = 0;
        while (aux != null) {            
            total++;
            aux = aux.getNext();
        }
        return total;
    }
    
    public int getTotal() {
        Node aux = first;
        int total = 0;
        while (aux != null) {            
            total += aux.getData();
            aux = aux.getNext();
        }
        return total;
    }
    
    public int getGreater() {
        Node aux = first;
        int greater = 0;
        if (aux != null) {
            greater = aux.getData();
        }
        while (aux != null) {            
            if (aux.getData() > greater) {
                greater = aux.getData();                
            }
            aux = aux.getNext();
        }
        return greater;
    }
    
    public void clear() {
        first = null;
    }
    
}
