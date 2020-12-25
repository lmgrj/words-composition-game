

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Fenetre extends JFrame  {
	static public Game p1;
	static public Dialog2 p_insc;	
	static public Dialog1 scor ;
	static Container cn;
    private JLabel con,L,l;
    private JPanel content = new JPanel();
  
  
  public Fenetre(int n){}
  public Fenetre()  {
    super("jeux de mots : Asmae hamani");
    this.setSize(1062, 694);
    this.setResizable(false);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);      
   
        cn = this.getContentPane();
		cn.setLayout(null);
		p1 = new Game();
				
		scor = new Dialog1();
		
		 this.p1.setVisible(true);
		 this.cn.add(Fenetre.p1 );
		 this.p1.jouer();
		 
       this.setVisible(true);  
       
  }
   
  public static void main(String[] main){
    Fenetre fen = new Fenetre();
  }   
}

