/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package gov.iti.jets.creationaldesignpattern.Singleton;

/**
 *
 * @author Ahmed Yassin
 */
public class Main {

    public static void main(String[] args) {

        Singleton obj1 = Singleton.getInstance();
        System.out.println(obj1);
        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj2);

    }
}
