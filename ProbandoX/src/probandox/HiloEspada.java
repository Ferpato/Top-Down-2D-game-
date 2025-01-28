/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package probandox;

import javax.swing.JOptionPane;
import static probandox.ProbandoX.Corazon1;
import static probandox.ProbandoX.Corazon2;
import static probandox.ProbandoX.Enemigos;
import static probandox.ProbandoX.EnemigosVivos;
import static probandox.ProbandoX.Espadazo;
import static probandox.ProbandoX.Espadazoizq;
import static probandox.ProbandoX.Espadazoder;
import static probandox.ProbandoX.Espadazoarrib;
import static probandox.ProbandoX.Labels;
import static probandox.ProbandoX.LabelsH;
import static probandox.ProbandoX.Sprites;
import static probandox.ProbandoX.SpritesE;

/**
 *
 * @author fvg88
 */
public class HiloEspada extends Thread{
    int pov;
    public HiloEspada(int pov){
        this.pov=pov;
    }
    
    
    
    
     public void run(){
         ProbandoX.Atacando=true;
         ProbandoX.Buff2.setEnabled(false);
         try{
             if(pov==1){
                  ProbandoX.Espada.setIcon(Espadazoarrib);
             ProbandoX.Espada.setLocation(ProbandoX.x,ProbandoX.y-70);
              ProbandoX.Sprites.get(1).setLocation(ProbandoX.x,ProbandoX.y-70);
               ProbandoX.Sprites.get(1).setSize(100,50);
             ProbandoX.Espada.setVisible(true);
            
             }
              if(pov==2){
                  ProbandoX.Espada.setIcon(Espadazoizq);
             ProbandoX.Espada.setLocation(ProbandoX.x-70,ProbandoX.y);
             ProbandoX.Sprites.get(1).setLocation(ProbandoX.x-70,ProbandoX.y);
             ProbandoX.Sprites.get(1).setSize(50,100);
             ProbandoX.Espada.setVisible(true);
             
             }
               if(pov==3){
                  ProbandoX.Espada.setIcon(Espadazo);
             ProbandoX.Espada.setLocation(ProbandoX.x,ProbandoX.y+70);
             ProbandoX.Sprites.get(1).setLocation(ProbandoX.x,ProbandoX.y+70);
             ProbandoX.Sprites.get(1).setSize(100,50);
             ProbandoX.Espada.setVisible(true);
           
      
             }
                 if(pov==4){
                  ProbandoX.Espada.setIcon(Espadazoder);
             ProbandoX.Espada.setLocation(ProbandoX.x+70,ProbandoX.y);
             ProbandoX.Sprites.get(1).setLocation(ProbandoX.x+70,ProbandoX.y);
            ProbandoX.Sprites.get(1).setSize(50,100);
             ProbandoX.Espada.setVisible(true);
            
             }
                         for(int j=0;j<SpritesE.size();j++){
        if(Sprites.get(1).intersects(SpritesE.get(j))){
            
          
                
                if(Enemigos.get(j).getSalud()==2){
                LabelsH.get(j).setIcon(Corazon1);
                Enemigos.get(j).setSalud(1);
                }
                else{
                 if(Enemigos.get(j).getSalud()==1){
              LabelsH.get(j).setLocation(0,0);
              LabelsH.get(j).setSize(0,0);
               LabelsH.get(j).setIcon(null);
                Labels.get(j).setLocation(0,0);
              Labels.get(j).setSize(0,0);
               Labels.get(j).setIcon(null);
               
                SpritesE.get(j).setLocation(0,0);
                SpritesE.get(j).setSize(0,0);
                EnemigosVivos.set(j,"Muerto");
                //pan.repaint();
               
                ProbandoX.nem++;
                
                if(Enemigos.get(j).getTipo()==1){
               ProbandoX.score=ProbandoX.score+50;
                }
                 if(Enemigos.get(j).getTipo()==2){
               ProbandoX.score=ProbandoX.score+100;
                }
                  if(Enemigos.get(j).getTipo()==3){
               ProbandoX.score=ProbandoX.score+200;
                }
               ProbandoX.Puntuacion.setText("Puntuacion : "+ProbandoX.score);
               System.out.println("Has matado "+ProbandoX.nem+"Quedan "+ProbandoX.ne);
                if(ProbandoX.ne==ProbandoX.nem){
                  
                     Thread.sleep(200);
                    ProbandoX.Ronda++;
                    ProbandoX.NuevaRonda(ProbandoX.Ronda);
                }
                
                
                
                }
                }
                if(Enemigos.get(j).getSalud()==3){
                    LabelsH.get(j).setIcon(Corazon2);
                Enemigos.get(j).setSalud(2);
                }
        
                
            
            
            
        }
        
        
        
    }
                 
                 
                 
                 
                 Thread.sleep(100);
             ProbandoX.Sprites.get(1).setLocation(0,0);
             ProbandoX.Espada.setVisible(false);
             ProbandoX.Atacando=false;
             ProbandoX.Buff2.setEnabled(true);
            
         }
         catch(Exception ex){
             
         }
     }
}
