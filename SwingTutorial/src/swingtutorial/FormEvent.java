/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingtutorial;

import java.util.EventObject;

/**
 *
 * @author kemery
 */
public class FormEvent extends EventObject {

    private String name;
    private String occupation;
    private int ageCategory;
    private String employmentStatus;
    
    public FormEvent(Object source) {
        super(source);     
        
    }
    
    public FormEvent(Object source, String name, String occupation, int ageCategory, String employmentStatus) {
        super(source);
        
        this.name = name;
        this.occupation = occupation;
        this.ageCategory = ageCategory;
        this.employmentStatus = employmentStatus;
    }
         
    
    public int getAgeCategory() {
        return ageCategory;
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
     * @return the occupation
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * @param occupation the occupation to set
     */
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    
    public String getEmploymentStatus() {
        
        return employmentStatus;        
    }
            
    
    
    
}
