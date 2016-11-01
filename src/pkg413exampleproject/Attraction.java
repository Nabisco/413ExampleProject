/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg413exampleproject;

/**
 *
 * @author gme50
 */
public class Attraction {
    private String attractionName;
    private PersonQueue attractionLine;
    private int maxWeightCapacity;
    
    public Attraction(String name, int lineCapacity) {
        attractionName = name;
        attractionLine = new PersonQueue(name, lineCapacity);
        
    }

    /**
     * @return the attractionName
     */
    public String getAttractionName() {
        return attractionName;
    }

    /**
     * @param attractionName the attractionName to set
     */
    public void setAttractionName(String attractionName) {
        this.attractionName = attractionName;
    }

    /**
     * @return the attractionLine
     */
    public PersonQueue getAttractionLine() {
        return attractionLine;
    }

    /**
     * @param attractionLine the attractionLine to set
     */
    public void setAttractionLine(PersonQueue attractionLine) {
        this.attractionLine = attractionLine;
    }

    /**
     * @return the maxWeightCapacity
     */
    public int getMaxWeightCapacity() {
        return maxWeightCapacity;
    }

    /**
     * @param maxWeightCapacity the maxWeightCapacity to set
     */
    public void setMaxWeightCapacity(int maxWeightCapacity) {
        this.maxWeightCapacity = maxWeightCapacity;
    }
}
