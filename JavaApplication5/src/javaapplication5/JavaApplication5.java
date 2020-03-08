/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author Lenovo
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Main thread running... ");
 
        ThreaDemo T1 = new ThreaDemo("Thread-1-HR-Database");
        T1.start();
 
        ThreaDemo T2 = new ThreaDemo("Thread-2-Send-Email");
        T2.start();
 
        System.out.println("==> Main thread stopped!!! ");
    }
    
}

