package com.example.chrissebesta.customadaptertesting;

/**
 * Created by chrissebesta on 3/29/16.
 */
public class Geodata {
    public String description;
    public String coordinates;

    public Geodata(String description, String coordinates){
        this.description = description;
        this.coordinates = coordinates;
    }

    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
    }
    public void setCoordinates(String coordinates){
        this.coordinates = coordinates;
    }
    public String getCoordinates(){
        return coordinates;
    }
}
