/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aidan
 */

public class CD implements ToBeStored {
    //CD's parameter contains its artist (String), title (String), and 
    //publishing year (int). All CDs weigh 0.1 kg.
    private String artist;
    private String title;
    private double weight;
    private int year;

    public CD(String artist, String title, int year) {
        this.artist = artist;
        this.title = title;
        this.year = year;
        this.weight = 0.1;
    }
    
    @Override
    public double weight() {
        return this.weight;
    }    

    @Override
    public String toString() {
        // Pink Floyd: Dark Side of the Moon (1973)
        return this.artist + ": " + this.title + " (" + this.year + ")";
    }

       
}