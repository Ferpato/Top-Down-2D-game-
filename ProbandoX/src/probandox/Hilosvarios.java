/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package probandox;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fvg88
 */
public class Hilosvarios extends Thread {
    public String nombre;
   
    public Hilosvarios(String name){
        this.nombre=name;
    }
    public void run(){
        if(nombre=="Hilo2"){
            for(int i=1;i<=5;i++){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hilosvarios.class.getName()).log(Level.SEVERE, null, ex);
                }
                Variado.txt2.append("\n vuelta "+i);
               
            }
        }
        if(nombre=="Hilo3"){
            for(int i=1;i<=5;i++){
                try {
                    Thread.sleep(500);
                    if(i==1){
                        Variado.txt4.append("a \n");
                    }
                    if(i==2){
                         Variado.txt4.append("b \n");
                    }
                    if(i==3){
                         Variado.txt4.append("c \n");
                    }
                    if(i==4){
                         Variado.txt4.append("d \n");
                    }
                    if(i==5){
                         Variado.txt4.append("e \n");
                    }    
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hilosvarios.class.getName()).log(Level.SEVERE, null, ex);
                }
                    
                
            }
        }
        if(nombre=="Hilo1"){
            try{
         Thread.sleep(1000);
            try{
              try{
          // FileWriter obj1 = new FileWriter("notas.TXT");
            // BufferedWriter obj2 = new BufferedWriter(obj1);
  FileReader obj3 = new FileReader("notas.TXT");
                BufferedReader obj4 = new BufferedReader(obj3);
         // obj2.write("Este archivo esta en un texto");
          //obj2.close();
          Object obj55 =obj4.readLine();
        Variado.concatenado = (String)obj55;
      }catch(Exception ex){
          
      }
            }
            catch(Exception e){
                System.out.println("Error "+e);
            }
        }
         catch(Exception e){
                System.out.println("Error "+e);
            }
            
        }
        if(nombre=="Hilo4"){
            try {
                Thread.sleep(2000);
                
                  Variado.txt3.append("(Hilo1 e Hilo 4 ) El archivo leido , contiene "+Variado.concatenado);
                
                
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilosvarios.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
}
