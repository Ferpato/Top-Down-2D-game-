/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package probandox;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author fvg88
 */
public class HilosSincro2 {
    
  
   
    
    
    
      public synchronized void Imprimir(String nombrehilo, int jiji){
     if(nombrehilo=="Hilo1"){
         Listas.txt1.append("Hilo"+jiji+"\n");
         System.out.println("Pepe1");
     
     }
      if(nombrehilo=="Hilo2"){
         Listas.txt2.append("Hilo"+jiji+"\n");
          System.out.println("Pepe2");
     }
       if(nombrehilo=="Hilo3"){
           if(jiji==1){
             Listas.txt3.append("a \n");   
           }
           if(jiji==2){
             Listas.txt3.append("b \n");   
           }
           if(jiji==3){
            Listas.txt3.append("c \n");   
           }
           if(jiji==4){
             Listas.txt3.append("d \n"); 
           }
           if(jiji==5){
            Listas.txt3.append("e \n");   
           }
           System.out.println("Pepe3");
        
       
     }
        if(nombrehilo=="Hilo4"){
           if(jiji==1){
             Listas.txt4.append("a \n");   
           }
           if(jiji==2){
             Listas.txt4.append("b \n");   
           }
           if(jiji==3){
            Listas.txt4.append("c \n");   
           }
           if(jiji==4){
             Listas.txt4.append("d \n"); 
           }
           if(jiji==5){
            Listas.txt4.append("e \n");   
           }
            System.out.println("Pepe4");
     }
    } 
    
}
