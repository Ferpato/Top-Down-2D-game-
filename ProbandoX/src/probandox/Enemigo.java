/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package probandox;

import java.awt.Rectangle;
import javax.swing.Icon;
import javax.swing.JLabel;

/**
 *
 * @author fvg88
 */
public class Enemigo {
    int x,y,salud;
    int tipo;

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
   
    boolean vivo;

    public boolean getVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

 

   
    public Enemigo(int viva){
        int x1 = (int)(Math.random()*800+300);
         int y1 = (int)(Math.random()*500+250);
         this.x=x1;
         this.y=y1;
      
         salud=viva;
         tipo=viva;
       
         vivo=true;
         
         
    }
     public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
      
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
     
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

  
    
}
