/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author hakan
 */
public class Flute implements IInstrument {
    private String sound;
    private String color;
    private int fluteVolume;
    
    public Flute (String sound, String color, int trumpetVolume){
        this.sound = sound;
        this.color = color;
        this.fluteVolume = trumpetVolume;
    } 
    public Flute (){
        this.sound = "buuup";
        this.color = "golden";
        this.fluteVolume = 8;
    } 

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public int getSoundVolume() {
        return this.fluteVolume;
    }

    @Override
    public String play() {
        return this.sound;
    }
}

