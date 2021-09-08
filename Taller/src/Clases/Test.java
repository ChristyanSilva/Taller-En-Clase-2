/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author CRISTIAN
 */
public class Test {
    public static void main(String[] args) {
        Ameba a1 = new Ameba() ;
        Ameba a2 = new Ameba() ;
        a1.come(a2);
        a2.come(5);
        System.out.println(a1);       
        System.out.println(a2);
    }
    
}
