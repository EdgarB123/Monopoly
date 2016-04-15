/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.awt.Color;
import static java.awt.Color.red;
import java.util.ArrayList;

/**
 * Classe Player que representa un jugador
 * @author jenifer
 */
public class Player {
    private String name;
    private int money;
    private int box;
    private boolean isThrow;
    private String color;
    private ArrayList<String> properties;
    
    /**
     * Constructor per defecte
     */
    public Player() {
        box = 0;
    }
    
    /**
     * Constructor amb 3 paràmetres
     * @param name, representa el nom del jugador
     * @param color, representa el color del jugador
     * @param money , repressenta els diners del jugador
     */
    public Player(String name, String color, int money) {
        this.name = name;
        this.color = color;
        this.money = money;
        box = 0;
        
    }
    
    /**
     * Mètode accesor que retorna el nom del jugador
     * @return name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Mètode accesor
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Mètode accesor que retorna els diners del jugador
     * @return money
     */
    public int getMoney() {
        return money;
    }
    
    /**
     * Mètode accesor
     * @param money 
     */
    public void setMoney(int money) {
        this.money = money;
    }
    
    /**
     * Mètode accesor que retorna el color del jugador
     * @return color
     */
    public String getColor() {
        return color;
    }
    
    /**
     * Mètode accesor
     * @param color 
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    /**
     * Mètode accesor que retorna la casella
     * @return box
     */
    public int getBox() {
        return box;
    }
    
    /**
     * Mètode accesor que mou les fitxes, si la casella es 10 que es la casella d'anar a la presó t'envia a la casella de presó 30
     * @param box, representa una casella
     */
    public void setBox(int box) {
        this.box = (this.box + box) % 39;
        
        if(this.box == 10){
        this.box = 30;      
        }
        
    }
    
   /*
    public ArrayList<String> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<String> properties) {
        this.properties = properties;
    }

    */
    
    
    /**
     * Booleà que ens diu si es pot tirar
     * @return 
     */
    public boolean isIsThrow() {
        return isThrow;
    }
    
    /**
     * Mètode accesor
     * @param isThrow 
     */
    public void setIsThrow(boolean isThrow) {
        this.isThrow = isThrow;
    }
    
    /**
     * Mètode que genera un número random i tira el dau
     * @return String
     */
     public String throwDice(){
        int number = (int) Math.floor(Math.random() * 7);
        box += number;
        
         return name +" ha tret un "+ number +".";
    }
     
    
    /**
     * Mètode toString
     * @return String
     */
    @Override
    public String toString() {
        return "Jugador : "+name+" Color : "+color;
    }
    
    
    
    
    
    
}
