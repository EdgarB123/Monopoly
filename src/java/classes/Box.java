/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 * Classe que representa una casella
 * @author jenifer
 */
public class Box {
    private int id;
    private String name;
    private int price;
    private String owner;
    
    /**
     * Constructor per defecte
     */
    public Box() {
    }
    
    /**
     * Constructor amb 3 parametres
     * @param id, representa el id de la casella
     * @param name, representa el nom de la casella
     * @param price , representa el preu de la casella
     */
    public Box(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    /**
     * Mètode accessor
     * @return id, representa el id de la casella
     */
    public int getId() {
        return id;
    }
    
    /**
     * Mètode accessor
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * Mètode accessor
     * @return name, representa el nom de la casella 
     */
    public String getName() {
        return name;
    }
    
    /**
     * Mètode accessor
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Mètode accesor
     * @return price, representa el preu de la casella
     */
    public int getPrice() {
        return price;
    }
    
    /**
     * Mètode accessor
     * @param price 
     */
    public void setPrice(int price) {
        this.price = price;
    }
    
    /**
     * Mètode accesor
     * @return owner, representa el propietari de la casella 
     */
    public String getOwner() {
        return owner;
    }
    
    /**
     * Mètode accesor
     * @param owner 
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    /**
     * Mètode toString
     * @return  String
     */
    @Override
    public String toString() {
        return "Casella{" + "id=" + id + ", nom=" + name + ", preu=" + price + ", propietari=" + owner + '}';
    }
    
    
    
    
    
}
