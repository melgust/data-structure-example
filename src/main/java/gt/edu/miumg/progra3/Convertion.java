/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.miumg.progra3;

/**
 *
 * @author melgust
 */
public class Convertion {
    
    public static String reverse(String expression) {
        String result = "";
        for (int i = expression.length() - 1; i >= 0 ; i--) {
            result += expression.charAt(i);
        }
        return result;
    }
    
}
