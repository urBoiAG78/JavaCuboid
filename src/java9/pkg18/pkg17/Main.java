/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java9.pkg18.pkg17;

/*
 * STEP1:
 * Create a generic class called Cuboid that will store the three dimensions of a cuboid. 
 * Add methods to set and get the length, breadth and Height. 
 * Add a method public String toString() that will return all of the dimensions. 
 * The type of the dimensions will be decided at construction of the cuboid instance. 
 * Example:
 *      Cuboid<Double> c1 = new Cuboid<>();
 *      Cuboid<String> c1 = new Cuboid<>();
 *   
 * STEP 2:
 * Modify your generic class Cuboid so that it only accepts Numbers. Add a method with the following definition and complete its body. Hint: Look at the method doubleValue() in the Number class.
 *      public double getVolume(){ ...... }
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Add code here to fully test your Cuboid Class.
        //Be sure to test all constructors and methods.
        Cuboid<Double> c1 = new Cuboid<>();
        Cuboid<String> c2 = new Cuboid<>();
        c1.setWidth(10.0);
        c1.setLenght(10.0);
        c1.setHeight(10.0);
        System.out.println(c1.getHeight());
        System.out.println(c1.getLenght()); 
        System.out.println(c1.getWidth());
        System.out.println(c1.toString());
        c2.setHeight("10");
        c2.setLenght("10");
        c2.setWidth("10");
        System.out.println(c2.getHeight());
        System.out.println(c2.getLenght());
        System.out.println(c2.getWidth());
        System.out.println(c2.toString());
    }
    
}