


import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Timer;

public class Comparer extends Thread {
	public static String  str[]= {"moin de 10 ans","10 - 20 ans","plus de 20 ans"};
	public static JLabel Stage;
	public  static int j=0,s=0,taill;
	public int G=0,i=0;
	public static Timer temps;
    public static int seconde ;
	static String fichiers[]= {"niveau1","niveau2","niveau3"};
	int niveau=1;
    String majeur[]; String moyenne[]; String petite[];
    String filepetite="C:\\Users\\hamani asmae\\Desktop\\Asmae\\jeuxasmae\\src\\petite";
    String filemoyenne="C:\\Users\\hamani asmae\\Desktop\\Asmae\\jeuxasmae\\src\\moyenne";
    String fileMajeur="C:\\Users\\hamani asmae\\Desktop\\Asmae\\jeuxasmae\\src\\Majeur";
    public int[] stg= {33,66,132};
	 public Comparer(){
	   seconde=60;
	 }
	 Font policeB = new Font("Tahoma", Font.BOLD, 20);
	 Font comics30 = new Font("Comics Sans MS", Font.BOLD, 20);
	 synchronized public void run (){			
		 taill=stg[s];
	     petite=file.lirefile(filepetite);
	     moyenne=file.lirefile(filemoyenne);
	     majeur=file.lirefile(fileMajeur);
			for(i=0 ;i<14;i++)  
			{    try {
				    
			    	if(str[0]==Game.ageT) {
						Game.motg.setText(petite[i]);
			    	}
			    	if(str[1]==Game.ageT) { 
			    		Game.motg.setText(moyenne[j]);
				    }
			    	if(str[2]==Game.ageT) { 
			    		Game.motg.setText(majeur[j]);
				    }
			    	
			    	j++;
			    				    	
			    	Game.motg.setVisible(true);
					sleep(10000);		
					Game.motg.setVisible(false);					
					sleep(80000);	
					taill=stg[2];
					i=stg[2];	
					G=-1;
					s=stg.length-1;
					}
			catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			    
			}			
			s++;			
			Fenetre.p1.setVisible(false);
			Fenetre.scor.setVisible(true);
			if(s==stg.length) {
				j=0;
				if(G==0) {
				Fenetre.cn.add(Game.Icon);
				Game.Icon.setVisible(true);
				}
				else {
					Game.fin.setText("");
					Fenetre.cn.add(Game.Icon);
					Game.Icon.setVisible(true);
				}
			}else {			
			 Stage= new JLabel();
			 Stage.setBackground(Color.red);			 
			 Stage.setBounds(80,250,300,30); 
			 Stage.setText("Bien Jouer Stage  :  "+s); 
			 Stage.setForeground(Color.red);
			 Stage.setFont(comics30);
			Fenetre.scor=new Dialog1(null, "Inscrire sur Alphabet", true);
			Dialog3 zInfo = Fenetre.scor.showZDialog();


			}
					
	 }
	 
}
