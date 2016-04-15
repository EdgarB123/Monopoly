<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="style/style.css">
        <title>JSP Page</title>
    </head>
    <body>
        
          <c:choose>
            <c:when test="${startGame}">
                <form action="Servlet" method="get">
                    <input type="submit" name="start" value="Start">
                </form>
            </c:when>
            <c:otherwise>
        
        <table class="content table table-striped">
        <tr>
            <td>  
                <table  id='tauler' border='1' >
                    <tr>
                        <td  class="especial" bgcolor='white' colspan='2' rowspan="2"><c:forEach items="${playersInGame}" var="player">
					<c:if test="${player.box == 20}">
						<div class="posicion"  style="background-color:${player.color}; width:25px;  height:25px;  border-radius: 100%;">
							
						</div>
					</c:if>
				</c:forEach>
                          <img class="parking" src="images/parking.jpeg" alt="" >
                        </td><!--casella 20 --------------------------------------->
                         <td class="hornom"><c:forEach items="${playersInGame}" var="player">
					<c:if test="${player.box == 21}">
						<div class="posicion"  style="background-color:${player.color}; width:25px;  height:25px;  border-radius: 100%;">
							
						</div>
					</c:if>
				</c:forEach>
                            <small>14000 &#8364;</small>
                        </td> <!--casella 21 ---------------------------------->
                         <td class="hornom"><c:forEach items="${playersInGame}" var="player">
					<c:if test="${player.box == 22}">
						<div class="posicion"  style="background-color:${player.color}; width:25px;  height:25px;  border-radius: 100%;">
							
						</div>
					</c:if>
				</c:forEach><img src="images/suerte.png" alt="">
                        </td> <!--casella 22 ------------------------------------>
                        <td class="hornom"><c:forEach items="${playersInGame}" var="player">
					<c:if test="${player.box == 23}">
						<div class="posicion"  style="background-color:${player.color}; width:25px;  height:25px;  border-radius: 100%;">
							
						</div>
					</c:if>
				</c:forEach>
                                 <small>14500 &#8364;</small>
                        </td> <!--casella 23 ------------------------------------>
                        <td class="hornom"><c:forEach items="${playersInGame}" var="player">
					<c:if test="${player.box == 24}">
						<div class="posicion"  style="background-color:${player.color}; width:25px;  height:25px;  border-radius: 100%;">
							
						</div>
					</c:if>
				</c:forEach>
                                <small>14750 &#8364;</small>
                        </td> <!--casella 24 ------------------------------------>
                        <td class="hornom"><c:forEach items="${playersInGame}" var="player">
					<c:if test="${player.box == 25}">
						<div class="posicion"  style="background-color:${player.color}; width:25px;  height:25px;  border-radius: 100%;">
							
						</div>
					</c:if>
				</c:forEach>
                                <small>20000 &#8364;</small>
                        </td> <!--casella 25 ------------------------------------>
                        <td class="hornom"><c:forEach items="${playersInGame}" var="player">
					<c:if test="${player.box == 26}">
						<div class="posicion"  style="background-color:${player.color}; width:25px;  height:25px;  border-radius: 100%;">
							
						</div>
					</c:if>
				</c:forEach>
                                <small>15000 &#8364;</small>  
                        </td> <!--casella 26 ------------------------------------>
                        <td class="hornom"><c:forEach items="${playersInGame}" var="player">
					<c:if test="${player.box == 27}">
						<div class="posicion"  style="background-color:${player.color}; width:25px;  height:25px;  border-radius: 100%;">
							
						</div>
					</c:if>
				</c:forEach>
                                <small>15500 &#8364;</small>
                        </td> <!--casella 27 ------------------------------------>
                        <td class="hornom"><c:forEach items="${playersInGame}" var="player">
					<c:if test="${player.box == 28}">
						<div class="posicion"  style="background-color:${player.color}; width:25px;  height:25px;  border-radius: 100%;">
							
						</div>
					</c:if>
				</c:forEach>
                                <small>600 &#8364;</small>
                        </td> <!--casella 28 ------------------------------------>
                        <td class="hornom"><c:forEach items="${playersInGame}" var="player">
					<c:if test="${player.box == 29}">
						<div class="posicion"  style="background-color:${player.color}; width:25px;  height:25px;  border-radius: 100%;">
							
						</div>
					</c:if>
				</c:forEach>
                                <small>16000 &#8364;</small>
                        </td> <!--casella 29 ------------------------------------>
                        <td  class="especial"bgcolor='white' colspan='2' rowspan="2"><c:forEach items="${playersInGame}" var="player">
					<c:if test="${player.box == 30}">
						<div class="posicion"  style="background-color:${player.color}; width:25px;  height:25px;  border-radius: 100%;">
							
						</div>
					</c:if>
				</c:forEach>
                               <img class="preso" src="images/prision.jpg" alt="" >
                        </td> <!--casella 30 ------------------------------------>
                        </tr>
                    <tr>
                        <td bgcolor='red' class="horcolor">Pl. Urquinaona</td>
                        <td bgcolor='white' class="horcolor">Sort</td>
                        <td bgcolor='red' class="horcolor">Carrer Fontanella</td>
                        <td bgcolor='red' class="horcolor">Ronda Sant Pere</td>
                        <td bgcolor='white'class="horcolor">Estació de metro</td> 
                        <td bgcolor='yellow' class="horcolor">Rambles</td>
                        <td bgcolor='yellow' class="horcolor">Via Laietana</td>
                        <td bgcolor='white'class="horcolor">Aigues de Barcelona</td>
                        <td bgcolor='yellow' class="horcolor">Pl. Catalunya</td>
                    </tr>
                    
                    
                    <tr>
                        <td class="vernom"><c:forEach items="${playersInGame}" var="player">
					<c:if test="${player.box == 19}">
						<div class="posicion"  style="background-color:${player.color}; width:25px;  height:25px;  border-radius: 100%;">
							
						</div>
					</c:if>
				</c:forEach>
                            <small>13700 &#8364;</small>
                        </td><!--casella 19 ------------------------>
                        
                        <td bgcolor='orange' class="vercolor">Carrer Aragó</td>
                        <td class='center'></td> 
                        <td class='center'></td>
                        <td class='center'></td>  
                        <td class='center'></td> 
                        <td class='center'></td>  
                        <td class='center'></td> 
                        <td class='center'></td> 
                        <td class='center'></td> 
                        <td class='center'></td> 
                        <td bgcolor='green' class="vercolor">Portal del Angel</td>
                        
                        <td class="vernom"><c:forEach items="${playersInGame}" var="player">
					<c:if test="${player.box == 31}">
						<div class="posicion"  style="background-color:${player.color}; width:25px;  height:25px;  border-radius: 100%;">
							
						</div>
					</c:if>
				</c:forEach>
                            <small>20000 &#8364;</small>
                        </td><!--casella 31 ---------------------------> 
                         </tr>
                         
                         <td class='vernom'><c:forEach items="${playersInGame}" var="player">
					<c:if test="${player.box == 19}">
						<div class="posicion"  style="background-color:${player.color}; width:25px;  height:25px;  border-radius: 100%;">
							
						</div>
					</c:if>
				</c:forEach>
                            <small>20000 &#8364;</small>
                        </td><!--casella 18 ---------------------------> 
                        
                        <td bgcolor='orange'>Carrer diputació</td> 
                        <td class='center'></td> 
                        <td class='center'></td>
                        <td class='center'></td>  
                        <td class='center'></td> 
                        <td class='center'></td>  
                        <td class='center'></td> 
                        <td class='center'></td> 
                        <td class='center'></td> 
                        <td class='center'></td> 
                        <td bgcolor='green' class="vercolor">Carrer Pelayo</td>
                        <td class="vernom"><c:forEach items="${playersInGame}" var="player">
					<c:if test="${player.box == 32}">
						<div class="posicion"  style="background-color:${player.color}; width:25px;  height:25px;  border-radius: 100%;">
							
						</div>
					</c:if>
				</c:forEach>
                            <small>16700 &#8364;</small>
                        </td> <!--casella 32 ------------------------------------->
                    </tr>
                    
                     <tr>
                        <td class="vernom"><c:forEach items="${playersInGame}" var="player">
					<c:if test="${player.box == 17}">
						<div class="posicion"  style="background-color:${player.color}; width:25px;  height:25px;  border-radius: 100%;">
							
						</div>
					</c:if>
				</c:forEach> <img src="images/impost.png" alt="">
                        </td><!--casella 17 -->
                        <td bgcolor='white'class="vercolor">Impost</td> 
                        
                        <td class='center'></td> 
                        <td class='center'></td>
                        <td class='center'></td>  
                        <td class='center' colspan='3'>
                            <div class="strong">
                                Torn del jugador:
                                ${actualPlayer}
                            </div>
                            <div class="strong">
                                Diners:
                                ${actualMoney}
                            </div>
                            <div class="strong"> 
                                Propietats:
                                <c:forEach var='propietat' items='${owners}'>
                                    <c:if test="${propietat.owner == actualPlayer}">
                                        <div>${propietat.name}</div>
                                    </c:if>
                                </c:forEach>
                            </div>
                            
                            
                             <form action="Servlet" method="get">
                                <c:if test="${canThrow==true}">
                                    <input type="submit" value="Tirar" name="tirar">
                                </c:if>

                             
                                <c:if test="${canThrow==false}">
                                        <c:if test="${actualOwner==null && (actualBox != 0 && actualBox != 2 && actualBox != 4 && actualBox != 7 && actualBox != 10 && actualBox != 17 && actualBox != 20 && actualBox != 30 && actualBox != 33 && actualBox != 36 && actualBox != 38) }">
                                            <input type="submit" value="Comprar" name="comprar">
                                        </c:if>
                                            
                                        <input type="submit" value="Passar" name="passar">
                                </c:if>
                            </form>
                                        
                              
                            
   
      
                                        
                        </td> 
                        
                        
                        <td class='center'></td> 
                        <td class='center'></td> 
                        <td class='center'></td> 
                        <td bgcolor='white' class="vercolor">Impost</td>
                        <td class="vernom"><c:forEach items="${playersInGame}" var="player">
					<c:if test="${player.box == 33}">
						<div class="posicion"  style="background-color:${player.color}; width:25px;  height:25px;  border-radius: 100%;">
							
						</div>
					</c:if>
				</c:forEach> <img src="images/impost.png" alt="">
                        </td> <!--casella 33 --------------------------------------->
                    </tr>
                    
                    <tr>
                        <td class="vernom"><c:forEach items="${playersInGame}" var="player">
					<c:if test="${player.box == 16}">
						<div class="posicion"  style="background-color:${player.color}; width:25px;  height:25px;  border-radius: 100%;">
							
						</div>
					</c:if>
				</c:forEach>
                            <small>13000 &#8364;</small>
                        </td> <!--casella 16 ------------------------------------------->
                        <td bgcolor='orange' class="vercolor">Paseig de Sant Joan</td> 
                        <td class='center'></td> 
                        <td class='center'></td> 
                        <td class='center'></td>
                        <!--<td  bgcolor='#414141'colspan='3' rowspan="4"> -->
                        <!--<div id="contentDau">
                                <c:if test="${dau!=null}">
                                    <img src="images/d${dau}.png"/>
                                </c:if>
                                
                                <form action="MonopoliServlet" method="post">
                                    <c:if test="${canThrow==true}">
                                        <input type="submit" value="Tirar" name="tirar">
                                    </c:if>
                                    
                                    <c:if test="${bTirar==false}">
                                        <c:if test="${propietariActual==null && (casellaActual != 0 && casellaActual != 2 && casellaActual != 4 && casellaActual != 7 && casellaActual != 10 && casellaActual != 17 && casellaActual != 20 && casellaActual != 30 && casellaActual != 33 && casellaActual != 36 && casellaActual != 38) }">
                                            <input type="submit" value="Comprar" name="comprar">
                                        </c:if>
                                        <input type="submit" value="Passar" name="passar">
                                    </c:if>
                                </form>
                            </div> -->
                        
                        </td>  
                       <!-- <td class='center'>aqui</td> 
                        <td class='center'>aqui</td>  -->
                        <td class='center'></td> 
                        <td class='center'></td> 
                        <td class='center'></td>
                        <td class='center'></td>
                        <td class='center'></td>
                        <td class='center'></td>
                        <td bgcolor='green' class="vercolor">Via Augusta</td>
                        <td class="vernom"><c:forEach items="${playersInGame}" var="player">
					<c:if test="${player.box == 34}">
						<div class="posicion"  style="background-color:${player.color}; width:25px;   height:25px;  border-radius: 100%;">
							
						</div>
					</c:if>
				</c:forEach>
                            <small>17000 &#8364;</small>
                        </td>     <!--casella 34 -------->           
                    </tr>
                    
                    
                    <tr>
                        <td class="vernom"><c:forEach items="${playersInGame}" var="player">
					<c:if test="${player.box == 15}">
						<div class="posicion"  style="background-color:${player.color}; width:25px;   height:25px;  border-radius: 100%;">
							
						</div>
					</c:if>
				</c:forEach><!--<img src="images/tren.png" alt=""> -->
                                <small>20000 &#8364;</small>
                        </td> <!--casella 15 -------------------->
                        <td bgcolor='white' class="vercolor">Estació de França</td> 
                        <td class='center'></td> 
                        <td class='center'></td>
                        <td class='center'></td>  
                        <!-- <td class='center'>aqui</td> 
                        <td class='center'>aqui</td>  
                        <td class='center'>aqui</td>  -->
                        <td class='center'></td> 
                        <td class='center'></td> 
                        <td class='center'></td>
                        <td class='center'></td> 
                        <td class='center'></td> 
                        <td class='center'></td> 
                        <td bgcolor='white' class="vercolor">Estació del nort</td>
                        <td class="vernom"><c:forEach items="${playersInGame}" var="player">
					<c:if test="${player.box == 35}">
						<div class="posicion"  style="background-color:${player.color}; width:25px;  height:25px;  border-radius: 100%;">
							
						</div>
					</c:if>
				</c:forEach><!--<img  src="images/tren.png" alt=""  > -->
                        <small>20000 &#8364;</small></td>  <!--casella 35 --------------------------------->              
                    </tr>
                    
                    <tr>
                        <td class="vernom"><c:forEach items="${playersInGame}" var="player">
					<c:if test="${player.box == 14}">
						<div class="posicion"  style="background-color:${player.color}; width:25px;  height:25px;  border-radius: 100%;">
							
						</div>
					</c:if>
				</c:forEach>
                            <small>12750 &#8364;</small>
                        </td> <!--casella 14-->
                        <td bgcolor='#cc0066' class="vercolor">Av.Infanta Carlota</td> 
                        <td class='center'></td> 
                        <td class='center'></td>
                        <td class='center'></td>  
                        <!--<td class='center'>aqui</td> 
                        <td class='center'>aqui</td>  
                        <td class='center'>aqui</td> -->
                        <td class='center'></td> 
                        <td class='center'></td> 
                        <td class='center'></td> 
                        <td class='center'></td> 
                        <td class='center'></td> 
                        <td class='center'></td> 
                        <td bgcolor='white' class="vercolor">Sort</td>
                        <td class="vernom"><c:forEach items="${playersInGame}" var="player">
					<c:if test="${player.box == 36}">
						<div class="posicion"  style="background-color:${player.color}; width:25px;  height:25px;  border-radius: 100%;">
							
						</div>
					</c:if>
				</c:forEach><img src="images/suerte.png" alt=""> <!--casella 36 -->              
                    </tr>
                    
                    
                    <tr>
                        <td class="vernom"><c:forEach items="${playersInGame}" var="player">
					<c:if test="${player.box == 13}">
						<div class="posicion"  style="background-color:${player.color}; width:25px;  height:25px;  border-radius: 100%;">
							
						</div>
					</c:if>
				</c:forEach>
                            <small>12500 &#8364;</small>
                        </td> <!--casella 13-->
                        <td bgcolor='#cc0066' class="vercolor">Carrer Aribau</td> 
                        <td class='center'></td> 
                        <td class='center'></td>
                        <td class='center'></td>  
                        <td class='center'></td> 
                        <td class='center'></td> 
                        <td class='center'></td>  
                        <td class='center'></td> 
                        <td class='center'></td> 
                        <td class='center'></td> 
                        <td bgcolor='blue' class="vercolor">Carrer Balmes</td>
                        <td class="vernom"><c:forEach items="${playersInGame}" var="player">
					<c:if test="${player.box == 37}">
						<div class="posicion"  style="background-color:${player.color}; width:25px;  height:25px;  border-radius: 100%;">
							
						</div>
					</c:if>
				</c:forEach>
                            <small>17500 &#8364;</small>
                        </td>      <!--casella 37 -->           
                    </tr>
                    
                     <tr>
                        <td class="vernom"><c:forEach items="${playersInGame}" var="player">
					<c:if test="${player.box == 12}">
						<div class="posicion"  style="background-color:${player.color}; width:25px;  height:25px;  border-radius: 100%;">
							
						</div>
					</c:if>
				</c:forEach>
                            <!---<img src="images/bombeta.png" alt=""></br> --->
                            <small>600 &#8364;</small>
                        </td><!--casella 12----------------------->
                        <td bgcolor='white' class="vercolor">Llum</td> 
                        <td class='center'></td> 
                        <td class='center'></td>
                        <td class='center' colspan="5">
                            <!----------------------->
                        </td>  
                        
                         <td class='center'></td> 
                        <td class='center'></td> 
                        <td bgcolor='white' class="vercolor">Impost de Luxe</td>
                        <td class="vernom"><c:forEach items="${playersInGame}" var="player">
					<c:if test="${player.box == 38}">
						<div class="posicion"  style="background-color:${player.color}; width:25px;  height:25px;  border-radius: 100%;">
							
						</div>
					</c:if>
				</c:forEach><img src="images/impost_luxe.gif" alt=""  ></br>
                                <small>800 &#8364;</small>
                        </td>  <!--casella 38 ---------------->              
                    </tr>
                    
                    
                    
                    <tr>
                        <td class="vernom"><c:forEach items="${playersInGame}" var="player">
					<c:if test="${player.box == 11}">
						<div class="posicion"  style="background-color:${player.color}; width:25px;  height:25px;  border-radius: 100%;">
							
						</div>
					</c:if>
				</c:forEach>
                            <small>12000 &#8364;</small>
                        </td><!--casella 11-->
                        <td bgcolor='#cc0066' class="vercolor">Carrer Muntaner</td>
                        <td class='center'></td> 
                        <td class='center'></td>
                        <td class='center'></td>  
                        <td class='center'></td> 
                        <td class='center'></td>  
                        <td class='center'></td> 
                        <td class='center'></td> 
                        <td class='center'></td> 
                        <td class='center'></td>  
                        <td bgcolor='blue' class="vercolor">Paseig de gracia</td>
                        <td class="vernom"><c:forEach items="${playersInGame}" var="player">
					<c:if test="${player.box == 39}">
						<div class="posicion"  style="background-color:${player.color}; width:25px;  height:25px;  border-radius: 100%;">
							
						</div>
					</c:if>
				</c:forEach>
                            <small>21000 &#8364;</small>
                        </td>        <!--casella 39 -->        
                    </tr>
                    
                    
                    <tr>
                        <td class="especial" bgcolor='white' colspan='2' rowspan="2"> <c:forEach items="${playersInGame}" var="player">
					<c:if test="${player.box == 10}">
						<div class="posicion"  style="background-color:${player.color}; width:25px;  height:25px;  border-radius: 100%;">
							
						</div>
					</c:if>
				</c:forEach>
                            <img class="preso" src="images/preso.jpg" alt="" >
                            </td> <!--casella 10 -->  
                        <td bgcolor='#99ccff' class="horcolor">Consell de Cent</td>
                        <td bgcolor='#99ccff' class="horcolor">Carrer Urgell</td>
                        <td bgcolor='white' class="horcolor">Sort</td>
                        <td bgcolor='#99ccff' class="horcolor">Carrer Girona</td>
                        <td bgcolor='white' class="horcolor">Ferrocarrils catalans</td> 
                        <td bgcolor='white' class="horcolor">Imposts</td>
                        <td bgcolor='#660066' class="horcolor">Carrer Roselló</td>
                        <td bgcolor='white' class="horcolor">Comunitat</td>
                        <td bgcolor='#660066' class="horcolor">Carrer d'Avinyo</td>
                        <td class="especial" bgcolor='white' id="0" colspan='2' rowspan="2">
                            <c:forEach items="${playersInGame}" var="player">
					<c:if test="${player.box == 0}">
						<div class="posicion" id="pos0" style="background-color:${player.color}; width:25px;  height:25px;  border-radius: 100%;">
							
						</div>
					</c:if>
				</c:forEach>
                            
                            <img class="sortida" src="images/sortida.gif" alt="" ></td>
                    </tr>
                    
                    
                    <tr>
                        <td class="hornom"> <c:forEach items="${playersInGame}" var="player">
					<c:if test="${player.box == 9}">
						<div class="posicion"  style="background-color:${player.color}; width:25px;  height:25px;  border-radius: 100%;">
							
						</div>
					</c:if>
				</c:forEach>
                            <small>11000 &#8364;</small>
                        </td><!--casella 9 -->  
                        <td class="hornom"> <c:forEach items="${playersInGame}" var="player">
					<c:if test="${player.box == 8}">
						<div class="posicion"  style="background-color:${player.color}; width:25px;  height:25px;  border-radius: 100%;">
							
						</div>
					</c:if>
				</c:forEach>
                            <small>10100 &#8364;</small>
                        </td><!--casella 8 -->  
                        <td class="hornom"> <c:forEach items="${playersInGame}" var="player">
					<c:if test="${player.box == 7}">
						<div class="posicion"  style="background-color:${player.color}; width:25px;  height:25px;  border-radius: 100%;">
							
						</div>
					</c:if>
				</c:forEach>
                            <img src="images/suerte.png" alt="">
                        </td><!--casella 7 -->  
                        <td class="hornom"> <c:forEach items="${playersInGame}" var="player">
					<c:if test="${player.box == 6}">
						<div class="posicion"  style="background-color:${player.color}; width:25px;  height:25px;  border-radius: 100%;">
							
						</div>
					</c:if>
				</c:forEach>
                            <small>10000 &#8364;</small>
                        </td><!--casella 6 -->  
                        <td class="hornom"> <c:forEach items="${playersInGame}" var="player">
					<c:if test="${player.box == 5}">
						<div class="posicion"  style="background-color:${player.color}; width:25px;  height:25px;  border-radius: 100%;">
							
						</div>
					</c:if>
				</c:forEach>
                            <img class="Himg" src="images/tren.png" alt=""  >
                            <small>20000 &#8364;</small>
                        </td> <!--casella 5 -->  
                        <td class="hornom"> <c:forEach items="${playersInGame}" var="player">
					<c:if test="${player.box == 4}">
						<div class="posicion"  style="background-color:${player.color}; width:25px;  height:25px;  border-radius: 100%;">
							
						</div>
					</c:if>
				</c:forEach>
                            <img src="images/impost.png" alt=""  >
                        <small>400 &#8364;</small>
                        </td><!--casella 4 -->  
                        <td id="3" class="hornom"> <c:forEach items="${playersInGame}" var="player">
					<c:if test="${player.box == 3}">
						<div class="posicion"  style="background-color:${player.color}; width:25px;  height:25px;  border-radius: 100%;">
							
						</div>
					</c:if>
				</c:forEach>
                        <small>6000 &#8364;</small>
                        </td><!--casella 3-->  
                        <td class="hornom"><img src="images/comunitat.gif" alt=""  > 
                            <c:forEach items="${playersInGame}" var="player">
					<c:if test="${player.box == 2}">
						<div class="posicion"  style="background-color:${player.color}; width:25px;  height:25px;  border-radius: 100%;">
							
						</div>
					</c:if>
				</c:forEach>
                            <!--casella 2 -->  
                        </td>
                        <td class="hornom"> <c:forEach items="${playersInGame}" var="player">
					<c:if test="${player.box == 1}">
						<div class="posicion"  style="background-color:${player.color}; width:25px; height:25px;  border-radius: 100%;">
							
						</div>
					</c:if>
				</c:forEach>
                        <small>6000 &#8364;</small>
                        </td><!--casella 1 -->  
                    </tr>
                </table> 
            
            </td>
        
            <!-- <td class="laterals"> 
                
            </td>-->
        
        </tr> 
    </table>  

             </c:otherwise>
    </c:choose>             
        
        
    </body>
</html>
