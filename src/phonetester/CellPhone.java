/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phonetester;

/**
 *
 * @author MaLud0519
 */
public class CellPhone {
    private String carrier, model;
    private double speed, storage;
    private int numApps;
    
    public void setCarrier(String car) {   // encapsulates properties
        carrier = car;
    }
    public String getCarrier() {
        return carrier;     
    }
    
    public void setModel(String type) {
        model = type;
    }
    public String getModel() {
        return model;
    }
    
    public void setSpeed(double spd) {
        speed = spd;
    }
    public double getSpeed() {
        return speed;
    }
    
    public void setStorage(double stor) {
        storage = stor;
    }
    public double getStorage() {
        return storage;
    }
    
    public void setNumApps(int num) {
        numApps = num;
    }
    public int getNumApps() {
        return numApps;
    }
    // programs with overriding classes require a toString() method
 }

