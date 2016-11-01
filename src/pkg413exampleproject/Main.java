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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        initComp();
        
        
    }
    
    public static void initComp() {
        Attraction sidewinder = new Attraction("SideWinder", 15);
        
        for(int i = 0; i < 20; i++) {
            String personName = "Person " + i;
            Person person = new Person(personName);
            sidewinder.getAttractionLine().addPersonToLine(person);
        }
        
        System.out.println("The line for SideWinder is: ");
        
        for(int i = 0; i < sidewinder.getAttractionLine().getTheLine().size(); i++) {
            System.out.println("" + i + ": " + sidewinder.getAttractionLine().getTheLine().get(i).getName());
        }
            
    }
    
}
