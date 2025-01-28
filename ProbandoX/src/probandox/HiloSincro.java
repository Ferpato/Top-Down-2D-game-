/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package probandox;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author fvg88
 */
public class HiloSincro implements Runnable{
 static HilosSincro2 obj = new HilosSincro2();
 public Thread hilo;
String N_hilo;
   
HiloSincro(String nombrehilo){
    hilo = new Thread(this,nombrehilo);
    N_hilo = nombrehilo;
    hilo.start();
}
   
    
   
    public void run(){
       synchronized(obj){
           try{
             if(N_hilo=="Hilo4"){
                
                 for(int i =1;i<=5;i++){
                     Thread.sleep(200);
                 obj.Imprimir("Hilo4",i);
                 }
             }
             if(N_hilo=="Hilo3"){
              
                for(int i =1;i<=5;i++){
                    Thread.sleep(200);
                 obj.Imprimir("Hilo2",i);
                 }
             }
             if(N_hilo=="Hilo2"){
               
                for(int i =1;i<=5;i++){
                    Thread.sleep(200);
                 obj.Imprimir("Hilo3",i);
                 }
             }
             if(N_hilo=="Hilo1"){
                 
               for(int i =1;i<=5;i++){
                   Thread.sleep(200);
                 obj.Imprimir("Hilo1",i);
                 }
             }
           }
           catch(Exception ex){
               
           }
       }
    }
    
  
}
