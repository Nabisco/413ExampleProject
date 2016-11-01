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
public class Person {
    private String name;
    
    public Person(String personName) {
        this.name = personName;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;        
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

}
