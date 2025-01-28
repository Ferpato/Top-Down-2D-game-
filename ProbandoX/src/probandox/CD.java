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
public class CD extends Thread{
    int x = 0;
    int cd=0;
    public CD(int x1,int Cd){
        this.x=x1;
        this.cd=Cd;
    }
    public void run(){
         int i=0; 
        if(x==1){
            ProbandoX.Buff.setEnabled(false);
        }
        if(x==2){
            ProbandoX.Buff2.setEnabled(false);
           
        }
        
        
      
   do{
       
       
       if(ProbandoX.Pausa==true){
           try {
               Thread.sleep(200);
           } catch (InterruptedException ex) {
          
           }
       }
       else{
          i++;
          try{
          Thread.sleep(1000);
          }
          catch(Exception ex){
              
          }
       }
       
       
       
   } while(i<cd);
      
        if(x==1){
            ProbandoX.Buff.setEnabled(true);
        }
        if(x==2){
            ProbandoX.Buff2.setEnabled(true);
        }
    
    
    
    
    }
    
    
}
