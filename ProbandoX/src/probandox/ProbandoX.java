/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package probandox;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author fvg88
 */
public class ProbandoX extends JFrame implements KeyListener {
   static boolean Pausa=false;
   static int ne=2;
   static int nem=0;
   static int Ronda =1;
   static int n;
   static int POV=4;
   static boolean CronoVivo=true;
   static int min=0;
   static int seg=0;
   static int score=0;
   static int VM=5;
   static boolean Atacando=false;
   
    static Font Fonti = new Font("Times New Roman", Font.BOLD, 40);
   
   static ImageIcon Pause = new ImageIcon("Pause.png");
    static ImageIcon Reiniciar = new ImageIcon("Restart.png");
    static ImageIcon Play = new ImageIcon("Play.png");
    static ImageIcon C = new ImageIcon("C.png");
    static ImageIcon V = new ImageIcon("V.png");
      static ImageIcon Botitasmini = new ImageIcon("BootsI.png");
   static ImageIcon Botitas = new ImageIcon("Botitas.png");
    static ImageIcon Bombita = new ImageIcon("Bombita.png");
  static ImageIcon Fondo2 = new ImageIcon("Fondo2.jpg");
   static ImageIcon Espadazoder = new ImageIcon("Espadazoder.gif");
   static ImageIcon Espadazoizq = new ImageIcon("Espadazoizq.gif");
   static ImageIcon Espadazo = new ImageIcon("Espadazo.gif");
   static ImageIcon Espadazoarrib= new ImageIcon("Espadazoarrib.gif");
   static ImageIcon Ataque = new ImageIcon("Ataque.gif");
    static ImageIcon Corazon1= new ImageIcon("heart1.png");
    static ImageIcon Corazon2= new ImageIcon("heart2.png");
       static ImageIcon Corazon3= new ImageIcon("heart3.png");
     static ImageIcon Imagen = new ImageIcon("caballeroder.gif");
      static ImageIcon Imagen2 = new ImageIcon("caballeroizq.gif");
       static ImageIcon ImagenE = new ImageIcon("ghostder.gif");
      static ImageIcon ImagenE2 = new ImageIcon("ghostizq.gif");
      static ImageIcon ImagenS = new ImageIcon("Slimeder.gif");
      static ImageIcon ImagenS2 = new ImageIcon("Slimeizq.gif");
      static ImageIcon ImagenG = new ImageIcon("golemder.gif");
      static ImageIcon ImagenG2 = new ImageIcon("golemizq.gif");
       static ImageIcon FondoI = new ImageIcon("Fondo.png");
   static int x=220,y=120,x2=300,y2=300;
    static Thread hilo;
      static JLabel Efecto= new JLabel();
      static JButton PauPlay= new JButton();
       static JButton Restart= new JButton();
    static JLabel Espada = new JLabel();
     static JLabel Fondito = new JLabel();
       static JButton Buff = new JButton();
        static JButton Buff2 = new JButton();
         static JLabel C1 = new JLabel();
        static JLabel V1 = new JLabel();
    static JLabel Pepe = new JLabel();
     static JLabel Tiempo = new JLabel("Tiempo  0:0");
   static JLabel Puntuacion = new JLabel("Puntuacion : 0");
     static JLabel RondaM = new JLabel("Ronda : 0");
     static JLabel Fondo = new JLabel();
 static JLayeredPane pan = new JLayeredPane();
  public static ArrayList<Rectangle> Sprites = new ArrayList<Rectangle>();
    public static ArrayList<Rectangle> SpritesE = new ArrayList<Rectangle>();
     static   ArrayList<JLabel> Labels;
      static   ArrayList<JLabel> LabelsH;
        public static ArrayList<Enemigo> Enemigos = new ArrayList<Enemigo>();
         public static ArrayList<String> EnemigosVivos = new ArrayList<String>();
          public static ArrayList<hilo> Hilos = new ArrayList<hilo>();
          static int jeee=0;
public ProbandoX(){
     super("Papeleria");
     setFocusable(true);
requestFocusInWindow();
     addKeyListener(this);
      pan.setLayout(null);
      
       Tiempo.setForeground(Color.red);
      Tiempo.setSize(400,100);
      Tiempo.setFont(Fonti);
      Tiempo.setLocation(650,0);
      pan.add(Tiempo,JLayeredPane.PALETTE_LAYER);
      
      
      RondaM.setForeground(Color.red);
      RondaM.setSize(200,100);
      RondaM.setFont(Fonti);
      RondaM.setLocation(10,0);
      pan.add(RondaM,JLayeredPane.PALETTE_LAYER);
      
      Puntuacion.setForeground(Color.red);
      Puntuacion.setSize(400,100);
      Puntuacion.setFont(Fonti);
      Puntuacion.setLocation(300,0);
    
      pan.add(Puntuacion,JLayeredPane.PALETTE_LAYER);
      
      PauPlay.setIcon(Pause);
      PauPlay.setSize(100,100);
      PauPlay.setLocation(1100,0);
      PauPlay.setContentAreaFilled(false); 
      PauPlay.setBorderPainted(false);
      pan.add(PauPlay,JLayeredPane.PALETTE_LAYER);
      
      PauPlay.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent ey){
        
          if(Pausa==false){
              Pausa=true;
              PauPlay.setIcon(Play);
          }
          else{
              Pausa=false;
              PauPlay.setIcon(Pause);
          }
          
          
          
              requestFocusInWindow();
          }
             
             
         });
      
      Restart.setIcon(Reiniciar);
      Restart.setSize(100,100);
      Restart.setLocation(975,0);
      Restart.setContentAreaFilled(false); 
      Restart.setBorderPainted(false);
      pan.add(Restart,JLayeredPane.PALETTE_LAYER);
      
  Restart.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent ey){
         min=0;
              seg=0;
              Tiempo.setText("Tiempo  0:0");
             CronoVivo=false;
            for(int i=0;i<Enemigos.size();i++){
                if(Enemigos.get(i).getSalud()>=1){
                      LabelsH.get(i).setLocation(0,0);
              LabelsH.get(i).setSize(0,0);
               LabelsH.get(i).setIcon(null);
                Labels.get(i).setLocation(0,0);
              Labels.get(i).setSize(0,0);
               Labels.get(i).setIcon(null);
               
                SpritesE.get(i).setLocation(0,0);
                SpritesE.get(i).setSize(0,0);
                EnemigosVivos.set(i,"Muerto");
                }
            }   
            score=0;
            Puntuacion.setText("Puntuacion : 0");
            Ronda=1;
              NuevaRonda(Ronda); 
                requestFocusInWindow();
                CronoVivo=true;
    Crono HiloCrono = new Crono();
            HiloCrono.start();
          }   
         });
      
      
     Fondito.setIcon(Fondo2);
     Fondito.setSize(1200,800);
     Fondito.setLocation(0,0);
     
     Buff.setIcon(Botitas);
      Buff.setSize(200,250);
      Buff.setLocation(0,150);
       Buff.setContentAreaFilled(false); 
      Buff.setBorderPainted(false);
      pan.add(Buff,JLayeredPane.PALETTE_LAYER);
      
      
       
      Buff2.setIcon(Bombita);
      Buff2.setSize(200,250);
      Buff2.setLocation(0,450);
      Buff2.setContentAreaFilled(false); 
      Buff2.setBorderPainted(false);
      pan.add(Buff2,JLayeredPane.PALETTE_LAYER);
      
       C1.setIcon(C);
      C1.setSize(100,150);
      C1.setLocation(100,300);
      pan.add(C1,JLayeredPane.MODAL_LAYER);
      
      
      V1.setIcon(V);
      V1.setSize(100,150);
      V1.setLocation(100,600);
      pan.add(V1,JLayeredPane.MODAL_LAYER);
      
     
      
      
     
     
     Pepe.setIcon(Imagen);
   
     Fondo.setIcon(FondoI);
     setResizable(false);
    
    
 setSize(1200,800);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 //RECTANGLES
 //PERSONAJE POSICION 0
 Sprites.add(new Rectangle(x,y,60,60));
 //ESPADA POSICION 0
  Sprites.add(new Rectangle(0,0,50,100));
  Labels = new ArrayList<JLabel>();
    LabelsH = new ArrayList<JLabel>();
 
   
    Fondo.setLocation(200,100);
    Fondo.setSize(1000,700);
  
    Pepe.setLocation(x,y);
    Pepe.setSize(100,100);
    Espada.setSize(100,100);
    Espada.setLocation(0,0);
    Espada.setIcon(Espadazo);
    pan.add(Espada,JLayeredPane.POPUP_LAYER);
    Espada.setVisible(false);
   
    Efecto.setSize(75,50);
    Efecto.setLocation(0,0);
    Efecto.setIcon(Botitasmini);
    pan.add(Efecto,JLayeredPane.POPUP_LAYER);
    Efecto.setVisible(false);
    
    
    pan.add(Fondo, JLayeredPane.DEFAULT_LAYER);
    pan.add(Fondito, JLayeredPane.DEFAULT_LAYER);
    pan.add(Pepe, JLayeredPane.PALETTE_LAYER);
  
    
    
    
    setContentPane(pan);
    show();
   NuevaRonda(1);
    CronoVivo=true;
    Crono HiloCrono = new Crono();
            HiloCrono.start();
   
}
public static void CrearEnemigo(){
     int numero = (int)(Math.random()*3+1);
    Enemigos.add(new Enemigo(numero));
    Labels.add(new JLabel());
    LabelsH.add(new JLabel());
    Labels.get(n).setLocation(Enemigos.get(n).getX(),Enemigos.get(n).getY());
     Labels.get(n).setSize(100,100);
      if(Enemigos.get(n).getTipo()==3){
      Labels.get(n).setIcon(ImagenG);
      LabelsH.get(n).setIcon(Corazon3);
     }
     
     if(Enemigos.get(n).getTipo()==2){
      Labels.get(n).setIcon(ImagenE);
      LabelsH.get(n).setIcon(Corazon2);
     }
     if(Enemigos.get(n).getTipo()==1){
      Labels.get(n).setIcon(ImagenS);
      LabelsH.get(n).setIcon(Corazon1);
     }
       LabelsH.get(n).setLocation(Enemigos.get(n).getX()+20,Enemigos.get(n).getY()-50);
     LabelsH.get(n).setSize(75,50);
      
      
      
      SpritesE.add(new Rectangle(Enemigos.get(n).getX(),Enemigos.get(n).getY(),60,65));
      pan.add(Labels.get(n),JLayeredPane.MODAL_LAYER);
       pan.add(LabelsH.get(n),JLayeredPane.MODAL_LAYER);
      EnemigosVivos.add("Vivo");
     Hilos.add(new hilo(n));
            Hilos.get(n).start();
      n++;
}

public static void NuevaRonda(int ronda){
  
    
     nem=0;
     ne=2*ronda;
      x=220;
      y=120;
      Sprites.get(0).setLocation(x,y);
      Pepe.setLocation(x,y);
      Efecto.setLocation(x+10,y-50);
      
     for(int i=0;i<ne;i++){
         CrearEnemigo();
     }
      JOptionPane.showMessageDialog(null,"RONDA "+ronda);
    RondaM.setText("Ronda : "+Ronda);
    
    
    
}

public void keyPressed(KeyEvent e) {
  if(Pausa==true){
      
  }
  else{
 if (e.VK_W==e.getKeyCode())
         {
             if(y==85){
                 
             }else{
             y=y-VM;
     Pepe.setLocation(x,y);
      Efecto.setLocation(x+10,y-50);
     Sprites.get(0).setLocation(x,y);
     POV=1;
      
             }
     
  
  }
  if (e.VK_A==e.getKeyCode())
         {
             if(x==200){
             }
             else{
             x=x-VM;
     Pepe.setLocation(x,y);
      Efecto.setLocation(x+10,y-50);
     Pepe.setIcon(Imagen2);
       Sprites.get(0).setLocation(x,y);
             }
       
  POV=2;
  }
   if (e.VK_S==e.getKeyCode())
         {
             if(y==685){
                 
             }
             else{
             y=y+VM;
     Pepe.setLocation(x,y);
      Efecto.setLocation(x+10,y-50);
       Sprites.get(0).setLocation(x,y);
      
             }
              POV=3;
  
  }
    if (e.VK_D==e.getKeyCode())
         {
             if(x==1120){
                 
             }
             else{
             x=x+VM;
     Pepe.setLocation(x,y);
      Efecto.setLocation(x+10,y-50);
     Pepe.setIcon(Imagen);
       Sprites.get(0).setLocation(x,y);
             }
       POV=4;
  
  }
    if (e.VK_X==e.getKeyCode())
         {
             if(Atacando==true){
              HiloEspada HioEspada = new HiloEspada(POV);
            HioEspada.start();
             }

  }
     if (e.VK_V==e.getKeyCode())
         {
            /* if(Buff2.isEnabled()==false){
                 
             }
             else{
            for(int j=0;j<SpritesE.size();j++){
            if(Enemigos.get(j).getSalud()==3){
                 LabelsH.get(j).setIcon(Corazon2);
                Enemigos.get(j).setSalud(2);
            }
            else{
                
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
               ProbandoX.score=ProbandoX.score+100;
               ProbandoX.Puntuacion.setText("Puntuacion : "+ProbandoX.score);
                if(ProbandoX.ne==ProbandoX.nem){
                    ProbandoX.Ronda++;
                    ProbandoX.NuevaRonda(ProbandoX.Ronda);
                }
                }
                }
        }
    }   
             }
             
              CD HioBomba = new CD(2,40);
            HioBomba.start();
             
           */  
             
             
  }
      if (e.VK_X==e.getKeyCode())
         {
              HiloEspada HioEspada = new HiloEspada(POV);
            HioEspada.start();

  }
      if (e.VK_C==e.getKeyCode())
         {
              if(Buff.isEnabled()==false){
                  
              }else{
                  CD HioBomba = new CD(1,30);
            HioBomba.start();
              Velocidad Bot = new Velocidad();
            Bot.start();
            
              }

  }
    
    
    
    
    for(int j=0;j<SpritesE.size();j++){
        if(Sprites.get(0).intersects(SpritesE.get(j))){
            
            
            for(int h=0;h<SpritesE.size();h++){
                EnemigosVivos.set(h,"Muerto");
            }
               min=0;
              seg=0;
              Tiempo.setText("Tiempo  0:0");
             CronoVivo=false;
            JOptionPane.showMessageDialog(null,"DERROTA");
            
              for(int i=0;i<Enemigos.size();i++){
                if(Enemigos.get(i).getSalud()>=1){
                      LabelsH.get(i).setLocation(0,0);
              LabelsH.get(i).setSize(0,0);
               LabelsH.get(i).setIcon(null);
                Labels.get(i).setLocation(0,0);
              Labels.get(i).setSize(0,0);
               Labels.get(i).setIcon(null);
               
                SpritesE.get(i).setLocation(0,0);
                SpritesE.get(i).setSize(0,0);
                EnemigosVivos.set(i,"Muerto");
                }
            }   
            Ronda=1;
              NuevaRonda(Ronda); 
              score=0;
            Puntuacion.setText("Puntuacion : 0");
            CronoVivo=true;
    Crono HiloCrono = new Crono();
            HiloCrono.start();
                requestFocusInWindow();
            
            
            
            
            
        }
        
        
        
    }
  }
    
  
   
}
  
    public static void main(String[] args) {
           Progress.main(new String[0]);
            
            
           
           
             
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }


}
        

