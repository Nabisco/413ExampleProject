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
    private int age;
    private double cash;
    
    
    public Person(String personName) {
        this.name = personName;
    }
    
    public void addCashToWallet(double cashToAdd) {
        this.cash += cashToAdd;
    }
    
    public void spendCash(double ammountSpent) {
        if((this.cash -= ammountSpent) >= 0) {
            this.cash -= ammountSpent;
        }
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

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the cash
     */
    public double getCash() {
        return cash;
    }

    /**
     * @param cash the cash to set
     */
    public void setCash(double cash) {
        this.cash = cash;
    }

}
