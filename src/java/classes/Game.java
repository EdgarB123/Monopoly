/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;
import java.util.List;



/**
 * Classe que representa una partida
 * @author jenifer
 */
public class Game {
    public Board board = new Board();
    public ArrayList<Player> players;
    private int dice;
    private int tax = 0;
    
    /**
     * Constructor per defecte
     */
    public Game() {
    }
    
    /**
     * Mètode accessor
     * @return board, retorna el taulell
     */
    public Board getBoard() {
        return board;
    }

    /**
     * Mètode accessor
     * @param board , taulell
     */
    public void setBoard(Board board) {
        this.board = board;
    }
    
    /**
     * Mètode accesor
     * @return players, array de jugadors
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }
    
    /**
     * Mètode accesor
     * @param players 
     */
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
    
    /**
     * Mètode accesor
     * @return dice, representa el dau
     */
    public int getDice() {
        return dice;
    }
    
    /**
     * Mètode accessor
     * @param dice 
     */
    public void setDice(int dice) {
        this.dice = dice;
    }
    
    /**
     * Mètode accesor
     * @return tax, representa el impost
     */
    public int getTax() {
        return tax;
    }
    
    /**
     * Mètode accesor 
     * @param tax , representa el impost
     */
    public void setTax(int tax) {
        this.tax = tax;
    }
    
    
    
    
    
}
