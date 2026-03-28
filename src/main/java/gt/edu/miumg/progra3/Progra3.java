/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package gt.edu.miumg.progra3;

import java.util.Scanner;

/**
 *
 * @author melgust
 */
public class Progra3 {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.push(5);
        linkedList.push(10);
        linkedList.push(40);
        linkedList.push(75);
        linkedList.push(25);
        linkedList.push(28);
        linkedList.push(73);
        linkedList.push(43);
        linkedList.push(87);
        linkedList.push(39);
        linkedList.push(95);
        linkedList.push(13);
        linkedList.push(11);
        linkedList.push(1);
        System.out.println(linkedList.size());
        System.out.println(linkedList.getTotal());
        System.out.println(linkedList.getGreater());
    }
}
