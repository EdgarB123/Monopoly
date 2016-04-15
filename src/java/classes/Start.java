
package classes;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
@WebServlet(name = "Start", urlPatterns = {"/Start"})
public class Start extends HttpServlet {
    
    boolean canThrow = true;

    /**
     * Mètode que agafa les peticions Post
     * @param request, representa la petició
     * @param response, representa la resposta
     * @throws ServletException
     * @throws IOException 
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request,response);
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
        //Inicialitzem la sessió
        HttpSession session = request.getSession(false);
        
        //Si la sessió és nula i el dau esta activat, la sessió és invalida
        if(canThrow && session != null){
            session.invalidate();
            canThrow = false;
            session = request.getSession(true);
        }
        //Agafem el numero de jugador que jugaran, els seus noms i colors i els col.loquem en una arraylist
        String num_players = request.getParameter("num_players");
        String play = request.getParameter("play");
        if(play != null && "Play".equals(play)){
            int gamePlayers = Integer.parseInt(session.getAttribute("num_players").toString());
            ArrayList<Player> players = new ArrayList<>();
            
            for(int i = 0; i<gamePlayers; i++){
                String playerName = request.getParameter("nom"+i);
                String playerColor = request.getParameter("color"+i);
                Player p = new Player(playerName,playerColor,300000);
                players.add(p);
            }
            
            //Afegim com atribut si comença una partida i els jugadors que hi juguen
            session.setAttribute("startGame", true);
            session.setAttribute("playersInGame", players);
            System.out.println(players.toString());
            
            //Redirecciona al index.jsp que és on tenim el taulell, 
             RequestDispatcher rd = request.getRequestDispatcher("index.jsp"); 
             rd.forward(request, response);
             
        }else{
            //Mentres no polsem el botó de jugar guardarem el atribut de jugadors i redireccionarem de nou a la pagina
            session.setAttribute("num_players",num_players);
            System.out.println(num_players);
            RequestDispatcher rd=request.getRequestDispatcher("introduirNom.jsp");
            rd.forward(request, response);
        }
        
      
    }

   
    
}
