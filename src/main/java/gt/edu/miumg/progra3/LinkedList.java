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
        if (last == null) {
            return true;
        }
        return false;
    }
    
    public void insert(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            first = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }
    }
    
    public void printAll() {
        if (isEmpty())
            System.out.println("Lista vacia");
        else {
            Node aux = first;
            System.out.println(aux.data);
            while (aux.next != null) {
                aux = aux.next;
                System.out.println(aux.data);
            }
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
    
    public void delete(int data) {
        if (isEmpty())
            System.out.println("Lista vacia");
        else {
            Node aux = first;
            Node before = null;
            while (aux != null) {
                if (aux.data == data) {
                    if (before == null) {
                        first = aux.next;
                    } else {
                        before.next = aux.next;
                    }
                    return;
                }
                before = aux;
                aux = aux.next;
            }
            System.out.println("No se encontro el dato " + data);
        }
    }
    
    public void clear() {
        first = null;
    }
    
}
