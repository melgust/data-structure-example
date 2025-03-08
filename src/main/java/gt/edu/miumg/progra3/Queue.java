/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.miumg.progra3;

/**
 *
 * @author melgust
 */
public class Queue {
    
    Node first, last;
    
    public boolean isEmpty() {
        if (first == null) {
            return true;
        }
        return false;
    }
    
    public void push(int data) {
        Node node = new Node(data);
        System.err.println("Insertar: " + data);
        if (isEmpty()) {
            first = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }
    }
    
    public void pop() {
        if (isEmpty()) {
            System.out.println("La pila esta vacia");
        } else {
            System.out.println("Sacar: " + first.data);
            first = first.next;
        }
    }
    
    public void find(int data) {
        if (isEmpty())
            System.out.println("Lista vacia");
        else {
            Node aux = first;
            while (aux != null) {
                if (aux.data == data) {
                    System.out.println("Encontrado: " + aux.data);
                    return;
                }
                aux = aux.next;
            }
            System.out.println("No se encontro el dato " + data);
        }
    }
    
    public void clear() {
        first = null;
    }
    
    public void flush() {
        if (isEmpty()) {
            System.out.println("Pila vacia");
        } else { 
            Node aux = first;
            while (aux != null) {
                System.out.println("Dato: " + aux.data);                    
                aux = aux.next;
            }
            first = null;
        }
    }
    
    public void size() {
        int i = 0;
        if (isEmpty())
            System.out.println("Cola vacia");
        else {
            Node aux = first;
            while (aux != null) {
                i++;
                aux = aux.next;
            }
            System.out.println("Total: " + i);
        }        
    }
    
}
