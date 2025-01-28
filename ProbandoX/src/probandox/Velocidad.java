/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package probandox;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fvg88
 */
public class Velocidad extends Thread{
    public void run(){
        ProbandoX.VM=10;
        ProbandoX.Efecto.setVisible(true);
        int i=0;
    
            do{
            if(ProbandoX.Pausa==true){
                try {
                    Thread.sleep(200);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Velocidad.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
            try {
                Thread.sleep(1000);
                i++;
               
            } catch (InterruptedException ex) {
           
            }
            }
            
            }while(i<10);
            
            
        
        ProbandoX.VM=5;
        ProbandoX.Efecto.setVisible(false);
    }
    
    
    
}
