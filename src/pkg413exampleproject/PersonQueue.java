/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg413exampleproject;

import java.util.ArrayList;

/**
 *
 * @author gme50
 */
public class PersonQueue {
    private ArrayList<Person> theLine;
    private int lineCapacity;
    private String lineName;
    
    public PersonQueue(String attractionName, int attractionLineCapacity) {
        theLine = new ArrayList<>();
        lineName = attractionName;
        lineCapacity = attractionLineCapacity;           
    }
    
    public void addPersonToLine(Person p) {
        this.theLine.add(p);
    }

    /**
     * @return the theLine
     */
    public ArrayList<Person> getTheLine() {
        return theLine;
    }

    /**
     * @param theLine the theLine to set
     */
    public void setTheLine(ArrayList<Person> theLine) {
        this.theLine = theLine;
    }

    /**
     * @return the lineCapacity
     */
    public int getLineCapacity() {
        return lineCapacity;
    }

    /**
     * @param lineCapacity the lineCapacity to set
     */
    public void setLineCapacity(int lineCapacity) {
        this.lineCapacity = lineCapacity;
    }

    /**
     * @return the lineName
     */
    public String getLineName() {
        return lineName;
    }

    /**
     * @param lineName the lineName to set
     */
    public void setLineName(String lineName) {
        this.lineName = lineName;
    }
    
    
}
