/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package probandox;

/**
 *
 * @author fvg88
 */
public class Crono extends Thread{
    public void run(){
        
        do{
            if(ProbandoX.CronoVivo==true){
                try{
                if(ProbandoX.Pausa==true){
                    Thread.sleep(200);
                }else{
                  ProbandoX.seg=ProbandoX.seg+1;
                  if(ProbandoX.seg==60){
                      ProbandoX.min=ProbandoX.min+1;
                      ProbandoX.seg=0;
                      
                  }
                  ProbandoX.Tiempo.setText("Tiempo  "+ProbandoX.min+":"+ProbandoX.seg);
                  Thread.sleep(1000);
                }
                }
                catch(Exception ex){
                    
                }
            }
            
        }while(ProbandoX.CronoVivo==true);
    }
}
