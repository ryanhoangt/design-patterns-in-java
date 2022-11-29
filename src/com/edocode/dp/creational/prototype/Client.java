package com.edocode.dp.creational.prototype;

import javafx.geometry.Point3D;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
        Swordsman sw1 = new Swordsman();
        sw1.move(new Point3D(-10, 0, 0), 20);
        sw1.attack();
        
        System.out.println(sw1);
        
        Swordsman sw2 = (Swordsman) sw1.clone();
        System.out.println("Cloned sw: " + sw2);
	}

}
