/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olmo.Principal;

/**
 *
 * @author OLMO
 */
public class Menu {
    
    
    private String primero ;
    private String segundo;
    private String postre;

    
    public String[] toArrayString(){
         String[] values = new String[3];
         values[0]=primero;
         values[1]=segundo;
         values[2]=postre;
        
        return values;
    }
    public String getPrimero() {
        return primero;
    }

    public void setPrimero(String primero) {
        this.primero = primero;
    }

    public String getSegundo() {
        return segundo;
    }

    public void setSegundo(String segundo) {
        this.segundo = segundo;
    }

    public String getPostre() {
        return postre;
    }

    public void setPostre(String postre) {
        this.postre = postre;
    }

    public Menu(String primero, String segundo, String postre) {
        this.primero = primero;
        this.segundo = segundo;
        this.postre = postre;
    }
    
    
    
}
