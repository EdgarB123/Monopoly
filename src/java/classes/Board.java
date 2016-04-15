/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author jenifer
 */
public class Board {
    private ArrayList <Box> box;

    public Board() {
        box = new ArrayList<Box>();
        
        Box casella0 = new Box(0,"Sortida",0);
        box.add(casella0);
        Box casella1 = new Box(1,"Carrer d'Avinyo",6000);
        box.add(casella1);
        Box casella2 = new Box(2,"Caixa de la Comunitat",0);
        box.add(casella2);
        Box casella3 = new Box(3,"Carrer Roselló",6000);
        box.add(casella3);
        Box casella4 = new Box(4,"Impost sobre integraments",20000);
        box.add(casella4);
        Box casella5 = new Box(5,"Estació dels ferrocarrils catalans",20000);
        box.add(casella5);
        Box casella6 = new Box(6,"Carrer Girona",10000);
        box.add(casella6);
        Box casella7 = new Box(7,"Sort",0);
        box.add(casella7);
        Box casella8 = new Box(8,"Carrer Urgell",10100);
        box.add(casella8);
        Box casella9 = new Box(9,"Consell de Cent",11000);
        box.add(casella9);
        Box casella10 = new Box(10,"Preso",0);
        box.add(casella10);
        Box casella11 = new Box(11,"Carrer Muntaner",12000);
        box.add(casella11);
        Box casella12 = new Box(12,"Distribució Electrica",20000);
        box.add(casella12);
        Box casella13 = new Box(13,"Carrer Aribau",12500);
        box.add(casella13);
        Box casella14 = new Box(14,"Av. Infanta Carlota",12750);
        box.add(casella14);
        Box casella15 = new Box(15,"Estació de França",20000);
        box.add(casella15);
        Box casella16 = new Box(16,"Paseig de Sant Joan",13000);
        box.add(casella16);
        Box casella17 = new Box(17,"Impost",20000);
        box.add(casella17);
        Box casella18 = new Box(18,"Carrer diputació",13500);
        box.add(casella18);
        Box casella19 = new Box(19,"Carrer Aragó",13700);
        box.add(casella19);
        Box casella20 = new Box(20,"Parking",0);
        box.add(casella20);
        Box casella21 = new Box(21,"Pl. Urquinaona",14000);
        box.add(casella21);
        Box casella22 = new Box(22,"Sort",0);
        box.add(casella22);
        Box casella23 = new Box(23,"Carrer Fontanella",14500);
        box.add(casella23);
        Box casella24 = new Box(24,"Ronda Sant Pere",14750);
        box.add(casella24);
        Box casella25 = new Box(25,"Estació de metro",20000);
        box.add(casella25);
        Box casella26 = new Box(26,"Rambles",15000);
        box.add(casella26);
        Box casella27 = new Box(27,"Via Laietana",15550);
        box.add(casella27);
        Box casella28 = new Box(28,"Aigues de Barcelona",20000);
        box.add(casella28);
        Box casella29 = new Box(29,"Pl. Catalunya",16000);
        box.add(casella29);
        Box casella30 = new Box(30,"Preso",0);
        box.add(casella30);
         Box casella31 = new Box(31,"Portal del Angel",16500);
        box.add(casella31);
         Box casella32 = new Box(32,"Carrer Pelayo",16700);
        box.add(casella32);
         Box casella33 = new Box(33,"Caixa de a comunitat",0);
        box.add(casella33);
         Box casella34 = new Box(34,"Via Augusta",17000);
        box.add(casella34);
        Box casella35 = new Box(35,"Estació del nort",20000);
        box.add(casella35);
         Box casella36 = new Box(36,"Sort",0);
        box.add(casella36);
         Box casella37 = new Box(37,"Carrer Balmes",17500);
        box.add(casella37);
         Box casella38 = new Box(38,"Tasa de luxe",20000);
        box.add(casella38);
         Box casella39 = new Box(39,"Paseig de gracia",21000);
        box.add(casella39);
    }

    public ArrayList<Box> getBox() {
        return box;
    }

    public void setBox(ArrayList<Box> box) {
        this.box = box;
    }
    
    
    
}
