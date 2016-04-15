/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import classes.Game;
import classes.Player;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Classe que representa un Servlet
 * @author jenifer
 */
@WebServlet(name = "Servlet", urlPatterns = { "/Servlet" })
public class Servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
        Game game = new Game();
        int i=0;
        int maxPlayer=0;
        
        //ArrayList<String> properties;
        
    /**
     * Mètode que agafa les peticions Get
     * @param request, representa la petició
     * @param response, representa la resposta
     * @throws ServletException
     * @throws IOException 
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
	response.getWriter().append("Served at:").append(request.getContextPath());
        
        maxPlayer=Integer.parseInt(session.getAttribute("num_players").toString());
        String action = "";
        String route = "index.jsp";
         

        /*if(request.getRequestURL().equals("M07UF2_Monopoly/Start")){
            i = 0;
                ArrayList<Player> p = (ArrayList) session .getAttribute("playersInGame");
                game.setPlayers(p);
                System.out.println(game.getPlayers());
                System.out.println(p.toString());
                session.setAttribute("startGame", false);
                session.setAttribute("actualGame", game);
                session.setAttribute("actualPlayer", game.getPlayers().get(i).getName());
                session.setAttribute("canThrow", true);
        }*/
       
      //Si rep com a petició un d'aquests parametres cambia la String action i entra al switch
      if (request.getParameter("start") != null) {
			action = "start";
        }else if (request.getParameter("tirar") != null) {
			action = "tirar";
        }else if (request.getParameter("jugar") != null) {
			action = "jugar";
        }else if (request.getParameter("passar") != null) {
			action = "passar";
        }else if (request.getParameter("comprar") != null) {
			action = "comprar";
	}
        
        switch (action) {
            // Inicialitza la partida, amb l'array de jugadors, el jugador actual i els diners i si el dau a true
            case "start":
                i = 0;
                ArrayList<Player> p = (ArrayList) session.getAttribute("playersInGame");
                game.setPlayers(p);
                System.out.println(game.getPlayers());
                System.out.println(p.toString());
                session.setAttribute("startGame", false);
                session.setAttribute("actualGame", game);
                session.setAttribute("actualPlayer", game.getPlayers().get(i).getName());
                //session.setAttribute("actualPlayerColor", game.getPlayers().get(i).getColor());
                session.setAttribute("actualMoney", game.getPlayers().get(i).getMoney());
                session.setAttribute("canThrow", true);
                session.setAttribute("boxes",game.getBoard().getBox());
                break;
            //Posa el dau en fals perque no es pugui tornar a tirar, obté la casella actual, tira el dau i comprova
            //a quin tipus de casella ha caigut
            case "tirar":
                
                session.setAttribute("canThrow", false);
                int box = game.getPlayers().get(i).getBox();
                System.out.println("CASELLES : "+game.getBoard().getBox());
                throwDice(session,box);
                checkBox(session);
 
		break;
            //Tornem a guardar la sessió per guardar el canvis que s'han fet, el jugador actual i tornem a activar el dau.
            //Si els diners del jugador són 0 l'elimina de la partida. Passem de torn a l'altre jugador
            case "passar":
                i=(i+1)%maxPlayer;
                System.out.println("Jugador Actual " + game.getPlayers().get(i).getName());
                session.setAttribute("actualGame", game);
                session.setAttribute("actualPlayer", game.getPlayers().get(i).getName());
                session.setAttribute("actualMoney", game.getPlayers().get(i).getMoney());
                session.setAttribute("canThrow", true);
                int dinersJugador=game.getPlayers().get(i).getMoney();
                    if(dinersJugador<=0){
                    game.getPlayers().remove(i);
                    }
                session.setAttribute("actualMoney", game.getPlayers().get(i).getMoney());
                break;
            //Comprem la casella    
            case "comprar":
                buyBox(session);
		break;

              default:
                break;
                  
	}

		RequestDispatcher rd = request.getRequestDispatcher(route);
		rd.forward(request, response);
        
        
    }
    
    
     /**
      * Mètode que tira el dau i mou el jugador a la casella que correspon
      * @param session, representa la sessió del joc
      * @param box , representa la casella actual
      */
     private void throwDice(HttpSession session,int box){
            System.out.println("ENTRAA");
            System.out.println("CASELLA ACTUAL : "+ game.getPlayers().get(i).getBox());
            System.out.println("DINERS ACTUAL : "+ game.getPlayers().get(i).getMoney());
            Random r = new Random();
            int result = r.nextInt(6-1)+1;
            System.out.println(result);
            session.setAttribute("resultDice",result);
            game.getPlayers().get(i).setBox(result);
            System.out.println( game.getPlayers().get(i).getBox());
            System.out.println("CASELLA ACTUAL : "+ game.getPlayers().get(i).getBox());
            System.out.println("DINERS ACTUAL : "+ game.getPlayers().get(i).getMoney());
            session.setAttribute("actualBox",game.getPlayers().get(i).getBox());
            
            if(game.getPlayers().get(i).getBox()< box){
                game.getPlayers().get(i).setMoney(game.getPlayers().get(i).getMoney()+20000);
            }
        }
     
      /**
       * Mètode que comprova la casella i suma o resta diners depèn de quina sigui
       * @param session , representa la sessió del joc
       */
      private void checkBox(HttpSession session){
          int money;
          List<Box> box = (List) session.getAttribute("boxes");
          System.out.println(game.getBoard().getBox().get((int) session.getAttribute("actualBox")).getOwner());//extreu informacio de la casella actual
          session.setAttribute("actualOwner",game.getBoard().getBox().get((int) session.getAttribute("actualBox")).getOwner());
          int numCase=(int)session.getAttribute("actualBox");
          
          //Casella Impost
          if(session.getAttribute("actualOwner")== null && (numCase==2 || numCase==4 || numCase==17 || numCase==38 || numCase==33)){             
               System.out.println("ENTRAAAA");
               
               switch(numCase){
                    case 2:
                        money = game.getPlayers().get(i).getMoney()-300;
                        game.getPlayers().get(i).setMoney(money);
                        game.setTax(300);

                    break;
                        
                    case 4:
                        money = game.getPlayers().get(i).getMoney()-400;
                        game.getPlayers().get(i).setMoney(money);
                        game.setTax(400);

                    break;
                        
                    case 12: //llum
                        money = game.getPlayers().get(i).getMoney()-600;
                        game.getPlayers().get(i).setMoney(money);
                        game.setTax(600);

                    break;
                        
                        case 17:
                        money = game.getPlayers().get(i).getMoney()-600;
                        game.getPlayers().get(i).setMoney(money);
                        game.setTax(600);

                    break;
                            
                    case 28:
                        money = game.getPlayers().get(i).getMoney()-600;
                        game.getPlayers().get(i).setMoney(money);
                        game.setTax(600);

                    break;
                        
                    case 38:
                        money = game.getPlayers().get(i).getMoney()-700;
                        game.getPlayers().get(i).setMoney(money);
                        game.setTax(700);

                    break;
                    case 33:
                        money = game.getPlayers().get(i).getMoney()-800;
                        game.getPlayers().get(i).setMoney(money);
                        game.setTax(800);
                    break;
               }
            }
          
          
           if(session.getAttribute("actualOwner")==null && (numCase==7 || numCase==22 || numCase==36)){             
               System.out.println("ENTRAAA22");
               switch(numCase){
                    case 2:
                        money = game.getPlayers().get(i).getMoney()-300;
                        game.getPlayers().get(i).setMoney(money);
                        game.setTax(300);

                    break;
                    case 4:
                        money = game.getPlayers().get(i).getMoney()-400;
                        game.getPlayers().get(i).setMoney(money);
                        game.setTax(400);

                    break;
                        
                    case 12: 
                        money = game.getPlayers().get(i).getMoney()-600;
                        game.getPlayers().get(i).setMoney(money);
                        game.setTax(600);

                    break;
                    case 17:
                        money = game.getPlayers().get(i).getMoney()-600;
                        game.getPlayers().get(i).setMoney(money);
                        game.setTax(600);

                    break;
                        
                    case 28:
                        money = game.getPlayers().get(i).getMoney()-600;
                        game.getPlayers().get(i).setMoney(money);
                        game.setTax(600);

                    break;
                    case 38:
                        money = game.getPlayers().get(i).getMoney()-800;
                        game.getPlayers().get(i).setMoney(money);
                        game.setTax(700);

                    break;
                        
                    case 33:
                        money = game.getPlayers().get(i).getMoney()-700;
                        game.getPlayers().get(i).setMoney(money);
                        game.setTax(800);
                    break;
               }
               
         }
           
           //Casella Sort
            if(session.getAttribute("actualOwner")==null && (numCase==7 || numCase==22 || numCase==36)){             
               System.out.println("ENTRAAA3333!");
                switch(numCase){
                    case 7:
                        money = game.getPlayers().get(i).getMoney()+300;
                        game.getPlayers().get(i).setMoney(money);    

                    break;
                    case 22:
                        money = game.getPlayers().get(i).getMoney()+400;
                        game.getPlayers().get(i).setMoney(money);   

                    break;
                    case 36:
                        money = game.getPlayers().get(i).getMoney()+600;
                        game.getPlayers().get(i).setMoney(money);   

                    break;
                }    
            }
            
            
            
            //Casella Parking
            if(session.getAttribute("actualOwner")!=null && (numCase==20)){
                money = game.getPlayers().get(i).getMoney()+game.getTax();
                game.getPlayers().get(i).setMoney(money);
                
            }
            
            //Propietat d'un altre jugador
            if(session.getAttribute("actualOwner")!=null && !(session.getAttribute("actualOwnwer").equals(game.getPlayers().get(i).getName())) ){
            money = game.getPlayers().get(i).getMoney()-200;
             game.getPlayers().get(i).setMoney(money);
             for(int o=0;o < maxPlayer;o++){
                 if(session.getAttribute("propietariActual").equals(game.getPlayers().get(o).getName())){
                    money=game.getPlayers().get(i).getMoney()+200;
                    game.getPlayers().get(o).setMoney(money);
                 }
             
             }
                
            }
                
           
      }
      
      
      /**
       * Mètode que compra una casella
       * @param session , representa la sessió del joc
       */
      private void buyBox(HttpSession session){
            
            game.getBoard().getBox().get((int) session.getAttribute("actualBox")).setOwner(game.getPlayers().get(i).getName());
            
            System.out.println("HOOOOOOOOOOOLAAAAAAAAAA : "+game.getBoard().getBox().get((int) session.getAttribute("actualBox")).getOwner());
            System.out.println("OWNERS  "+game.getBoard().getBox().get((int) session.getAttribute("actualBox")).getOwner());
            session.setAttribute("actualOwner",game.getBoard().getBox().get((int) session.getAttribute("actualBox")).getOwner());
            session.setAttribute("owners",game.getBoard().getBox());
            
            
            int boxPrice=game.getBoard().getBox().get((int) session.getAttribute("actualBox")).getPrice();
            int playerMoney=game.getPlayers().get(i).getMoney();
            playerMoney -= boxPrice;
            game.getPlayers().get(i).setMoney(playerMoney);
            
             
            
            
            /*
            
             game.getBoard().getBox().get((int) session.getAttribute("actualBox")).setOwner(game.getPlayers().get(i).getName());
            game.getBoard().getBox().get(i).getName();
            session.setAttribute("actualOwner",game.getBoard().getBox().get((int) session.getAttribute("actualBox")).getOwner());
            session.setAttribute("owners",game.getBoard().getBox());
            properties.add(game.getBoard().getBox().get((int) session.getAttribute("actualBox")).getName());
            System.out.println("ARRAY PROPERTIES : "+ properties.toString());
            game.getPlayers().get(i).setProperties(properties);
            properties.remove(0);
            System.out.println("ARRAY PROPERTIES ELIMINADA : "+ properties.toString());
            System.out.println("PROPIETATS JUGADOR ACTUAL : "+ game.getPlayers().get(i).getProperties().toString());
            
            int boxPrice=game.getBoard().getBox().get((int) session.getAttribute("actualBox")).getPrice();
            int playerMoney=game.getPlayers().get(i).getMoney();
            playerMoney -= boxPrice;
            game.getPlayers().get(i).setMoney(playerMoney);
            
            
            
            */
            
            
       }
       
    

    /**
     * Mètode que agafa les peticions Post
     * @param request, representa la petició
     * @param response, representa la resposta
     * @throws ServletException
     * @throws IOException 
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
        
        
    
    
    
    
    

}
