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
public class RequestSender extends Thread{
    String nombreServer;
    //Crear un objeto tipo MakeRequest e intanciarlo
    //MakeRequest Peticiones = new Peticiones(NumPeticiones,url)
    
    public RequestSender(String Server)
    {
    nombreServer = Server;
    }
    
     @Override
     public void run(){
    
            try {
                //ejecutar el envio de peticiones para este hilo
                //Peticiones.Send();
                //Simula tiempo de espera
                Thread.sleep(5000);// 5 segundos
                System.out.printf(nombreServer + " envio todas las peticiones. hora: " +System.currentTimeMillis() + "\n");
             
         } catch (InterruptedException e) {
             Thread.currentThread().interrupt();
         }
 
                
         
     }// fin public void run(){
}
