/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.iti.jets.creationaldesignpattern.Singleton;

import java.util.Optional;

/**
 *
 * @author Ahmed Yassin
 */
public   class Singleton {

    //early instantion
    //private static Singleton instance = new Singleton();
    // lazy loaded
    private static Singleton instance = null;
   
    public int x;

    private Singleton() {

    }

    public static Singleton getInstance() {

        if (instance == null) {

            //synchronized to be thread safe
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }

            }

        }
        return instance;

    }

}
