/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java9.pkg18.pkg17;

/**
 *
 * @author agonzalez
 */
public class Cuboid <Numbers>{
    private Numbers lenght;
    private Numbers width;
    private Numbers height;
    private Numbers volume;

    public Numbers getLenght() {
        return lenght;
    }

    public Numbers getWidth() {
        return width;
    }

    public Numbers getHeight() {
        return height;
    }

    public void setLenght(Numbers lenght) {
        this.lenght = lenght;
    }

    public void setWidth(Numbers width) {
        this.width = width;
    }

    public void setHeight(Numbers height) {
        this.height = height;
    }
    public Numbers getVolume(){
         volume = lenght * width * height;
         return volume;
    }
    
    @Override
    public String toString(){
        return "Height is " + height + ". Width is " + width + ". Lenght is " + lenght;
    }
    
}
