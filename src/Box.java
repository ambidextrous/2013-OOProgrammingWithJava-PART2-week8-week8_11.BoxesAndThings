/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author aidan
 */

public class Box implements ToBeStored {
//public class Box {
    private ArrayList<ToBeStored> contents;
    private double maxWeight;
    
    public Box(double maxWeight) {
        this.contents = new ArrayList<ToBeStored>();
        this.maxWeight = maxWeight;
    }
    
    public void add(ToBeStored item) {
        if (this.weight() + item.weight() < this.maxWeight) {
            this.contents.add(item);
        }
    }

    public double weight() {
        double weight = 0;
        // it calculates the total weight of the things which had been stored
        for (ToBeStored item : this.contents ) {
            weight += item.weight();
        }
        return weight;
    }    
    
    @Override
    public String toString() {
        // Box: 6 things, total weight 4.0 kg
        return "Box: "+this.contents.size()+" things, total weight "+this.weight() +" kg";
    }
    
    
    
}
