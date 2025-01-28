/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package probandox;

import static probandox.ProbandoX.ImagenE2;
import static probandox.ProbandoX.ImagenE;
import static probandox.ProbandoX.ImagenG;
import static probandox.ProbandoX.ImagenG2;
import static probandox.ProbandoX.ImagenS;
import static probandox.ProbandoX.ImagenS2;




/**
 *
 * @author fvg88
 */
public class hilo extends Thread{
    int num;
    public hilo(int num){
        this.num=num;
    }
    
    
    
    public void run(){
 
    do{
    try{
       if(ProbandoX.Pausa==true){
           Thread.sleep(200);
       }
       else{
         int numero = (int)(Math.random()*4+1);
               
                
                if(numero==1){
      
        Thread.sleep(100);
         if(ProbandoX.Enemigos.get(num).getY()<=80){
         }
         else{
         
                     ProbandoX.Enemigos.get(num).setY(ProbandoX.Enemigos.get(num).getY()-10);
                     ProbandoX.Labels.get(num).setLocation(ProbandoX.Enemigos.get(num).getX(),ProbandoX.Enemigos.get(num).getY());
                      ProbandoX.LabelsH.get(num).setLocation(ProbandoX.Enemigos.get(num).getX()+20,ProbandoX.Enemigos.get(num).getY()-50);
                      ProbandoX.SpritesE.get(num).setLocation(ProbandoX.Enemigos.get(num).getX(),ProbandoX.Enemigos.get(num).getY());
                   
        Thread.sleep(100);
         }
        
                
                }
                if(numero==2){
         
        Thread.sleep(100);
        if(ProbandoX.Enemigos.get(num).getX()<=200){
         }
         else{
                      ProbandoX.Enemigos.get(num).setX(ProbandoX.Enemigos.get(num).getX()-10);
                       ProbandoX.Labels.get(num).setLocation(ProbandoX.Enemigos.get(num).getX(),ProbandoX.Enemigos.get(num).getY());
                        ProbandoX.LabelsH.get(num).setLocation(ProbandoX.Enemigos.get(num).getX()+20,ProbandoX.Enemigos.get(num).getY()-50);
    
      ProbandoX.SpritesE.get(num).setLocation(ProbandoX.Enemigos.get(num).getX(),ProbandoX.Enemigos.get(num).getY());
        if(ProbandoX.Enemigos.get(num).getTipo()==1){
            ProbandoX.Labels.get(num).setIcon(ImagenS2);
      }
      if(ProbandoX.Enemigos.get(num).getTipo()==2){
            ProbandoX.Labels.get(num).setIcon(ImagenE2);
      }
      if(ProbandoX.Enemigos.get(num).getTipo()==3){
            ProbandoX.Labels.get(num).setIcon(ImagenG2);
      }
      
      Thread.sleep(100);
        }
        
                }
                if(numero==3){
        
        Thread.sleep(100);
         if(ProbandoX.Enemigos.get(num).getY()>=680){
         }
         else{
                      ProbandoX.Enemigos.get(num).setY(ProbandoX.Enemigos.get(num).getY()+10);
                       ProbandoX.Labels.get(num).setLocation(ProbandoX.Enemigos.get(num).getX(),ProbandoX.Enemigos.get(num).getY());
                        ProbandoX.LabelsH.get(num).setLocation(ProbandoX.Enemigos.get(num).getX()+20,ProbandoX.Enemigos.get(num).getY()-50);
                       ProbandoX.SpritesE.get(num).setLocation(ProbandoX.Enemigos.get(num).getX(),ProbandoX.Enemigos.get(num).getY());
        Thread.sleep(100);
         }
                }
                if(numero==4){
          if(ProbandoX.Enemigos.get(num).getX()>=1120){
         }
          else{
              Thread.sleep(100);
                       ProbandoX.Enemigos.get(num).setX(ProbandoX.Enemigos.get(num).getX()+10);
                        ProbandoX.Labels.get(num).setLocation(ProbandoX.Enemigos.get(num).getX(),ProbandoX.Enemigos.get(num).getY());
                            ProbandoX.LabelsH.get(num).setLocation(ProbandoX.Enemigos.get(num).getX()+20,ProbandoX.Enemigos.get(num).getY()-50);
                        ProbandoX.SpritesE.get(num).setLocation(ProbandoX.Enemigos.get(num).getX(),ProbandoX.Enemigos.get(num).getY());
  
      if(ProbandoX.Enemigos.get(num).getTipo()==1){
            ProbandoX.Labels.get(num).setIcon(ImagenS);
      }
      if(ProbandoX.Enemigos.get(num).getTipo()==2){
            ProbandoX.Labels.get(num).setIcon(ImagenE);
      }
      if(ProbandoX.Enemigos.get(num).getTipo()==3){
            ProbandoX.Labels.get(num).setIcon(ImagenG);
      }
    
    
    
    
     Thread.sleep(100);
          }
        
                }
                
     
        
        
        
        
       }
               }
               
       
    
    catch(Exception exc){
    }  
    }
    while(ProbandoX.EnemigosVivos.get(num).equals("Vivo"));
  
}
}
