/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java9.pkg18.pkg17;

/**
 *
 * @author agonzalez
 * @param <T>
 */
public class Cuboid <T extends Number>{
    
    private T lenght;
    private T width;
    private T height;
    private double volume;

    public T getLenght() {
        return lenght;
    }

    public T getWidth() {
        return width;
    }

    public T getHeight() {
        return height;
    }

    public void setLenght(T lenght) {
        this.lenght = lenght;
    }

    public void setWidth(T width) {
        this.width = width;
    }

    public void setHeight(T height) {
        this.height = height;
    }
    public double getVolume(){
        volume = lenght.doubleValue() * width.doubleValue() * height.doubleValue();
        return volume;
    }
    
    @Override
    public String toString(){
        return "Height is " + height + ". Width is " + width + ". Lenght is " + lenght;
    }
    
}
