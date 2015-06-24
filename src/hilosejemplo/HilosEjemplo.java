/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hilosejemplo;

/**
 *
 * @author usr027077
 */
public class HilosEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        RequestSender instancia1 = new RequestSender("Server1");
        RequestSender instancia2 = new RequestSender("Server2");
        RequestSender instancia3 = new RequestSender("Server3");
        
        System.out.println("Inicio del proceso: " +System.currentTimeMillis() + "/n" );
        
        instancia1.start();
        instancia2.start();
        instancia3.start();
               
        
        
    }
    
}
