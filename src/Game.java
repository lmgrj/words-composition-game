

import java.awt.*;

import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;


public class Game extends JPanel {
	
    static String fichiers[]= {"niveau1","niveau2","niveau3"};
  Comparer com =new Comparer();
    public static String lettre[]=new String[38];


  Color t[] = {Color.black,Color.red,Color.orange,Color.yellow,Color.green,Color.cyan,Color.darkGray,Color.gray };
  public static String ageT;
  JLabel l[] = new JLabel[38],lscore;
  static public JLabel rscore;
  static JPanel pl,pmg,pme,panIcon,panR,Icon;
  JButton breset,bspace;
  static Comparer c;
  public static JLabel fin;
  public JLabel nom,sexe,age,con;
  public static  JLabel nomJ, sexeJ, ageJ,lscoreJ,rscoreJ;
  static JLabel motg,cherM,mote,resulte,etmot,motg1;

    String fileName = "C:\\Users\\hamani asmae\\Desktop\\Asmae\\jeuxasmae\\src\\niveau1";
 int nbrphrase;
  public Game(int n){}   
  public Game(){
	  Font comics20 = new Font("Comics Sans MS", Font.BOLD, 20);
	  Font comics40 = new Font("Comics Sans MS", Font.BOLD, 30);
      Font resul =new Font("Arial Black",Font.HANGING_BASELINE,20);
	  panR = new JPanel();
	  pl = new JPanel();
	  pme = new JPanel();
	  pmg = new JPanel();
	  panIcon = new JPanel();
	  Icon= new JPanel();
	nbrphrase=file.nbrphraseFichier(fileName);
    lettre=file.lirefile(fileName);
	  for(int i = 0 ;i<38;i++)
	  {
		  l[i] = new JLabel(lettre[i]);
		  	  
	  }

	  
	  for(int i = 0 ;i<38;i++)
	  {
	  
	  l[i].setBounds((int)(Math.random()*(750-(20)+1)+(20)),-(int)(Math.random()*(300-(30)+1)+(20)),30,30);//1100
	  
	  l[i].setForeground(t[(int)(Math.random()*(8)+(0))]);
	  l[i].setFont(comics40);
	  l[i].addMouseListener(new copieListener());
	  
	  }
	  this.setLayout(null);	  
	  breset = new JButton("RESSAYER");
	  breset.setBounds(821,0, 230,50);
	  breset.addActionListener(new ecout());
	  breset.setFont(comics20);
	
	  breset.setBackground(Color.YELLOW);

      bspace = new JButton("ESPACE");
      bspace.setBounds(300,7,150,40);
      bspace.addActionListener( new space());
      bspace.setFont(comics20);
      bspace.setBackground(Color.YELLOW);

	  lscore = new JLabel("score :");lscore.setBounds(600,7,100,40);
      rscore = new JLabel("0");rscore.setBounds(650,7,100,40);
      
      lscoreJ=new JLabel("score  : ");lscoreJ.setBounds(10,200,200,20);
      lscoreJ.setForeground(Color.orange);
      lscoreJ.setFont(comics20);
      rscoreJ=new JLabel("0");rscoreJ.setBounds(100,200,50,20);	
      
      pme.add(lscore);
	  pme.add(rscore);
	  pme.add(bspace);
	  
	  panIcon.setBackground(Color.CYAN);
	  pl.setBackground(Color.white);
	  pme.setBackground(Color.CYAN);
	  pmg.setBackground(Color.CYAN);
	  panR.setBackground(Color.YELLOW);
	  
	  panIcon.setLayout(null);
	  pl.setLayout(null);
	  pme.setLayout(null);
	  pmg.setLayout(null);
	  Icon.setLayout(null);
	  
	  panIcon.setBounds(821,262,241,339);
	  panR.setBounds(821,201,241,60);
	  pl.setBounds(2,2,820,600);
	  pme.setBounds(2,600,1050,60);
	  pmg.setBounds(821,2,241,200);
	  Icon.setBounds(200,20,820,600);
	  con = new JLabel(new ImageIcon("C:\\Users\\hamani asmae\\Desktop\\Asmae\\jeuxasmae\\src\\images\\img1.jpeg"));
	  con.setBounds(60,60,610,580);
	  fin = new JLabel("you are goood ");
	  fin.setBounds(305,342,500,80);
	  fin.setForeground(Color.red);
	  fin.setFont(comics40);
	  
	  Dialog2 zd = new Dialog2(null, "Joueur", true);
      Dialog3 zInfo = zd.showZDialog(); 
      
      
      nomJ=new JLabel();
	  nomJ.setBounds(10,20,400,30);
     
	  nomJ.setText("Nom : "+zInfo.getName()+"");
	  nomJ.setFont(comics20);
	  nomJ.setForeground(Color.green);
	  
	  ageJ=new JLabel();
	  ageJ.setBounds(10,80,400,30);
	  ageJ.setText("Age : "+zInfo.getAge()+"");
	  ageJ.setFont(comics20);
	  ageJ.setForeground(Color.green);
	  ageT=zInfo.getAge();
	
	  
	  nom=new JLabel();
	  nom.setText("Nom : "+zInfo.getName()+"");	  
	  nom.setBounds(2,40,200,30);
	  nom.setFont(comics20);
	 
	  
	  age=new JLabel();
	  age.setText("Age : "+zInfo.getAge()+"");
	  age.setBounds(2,140,200,30);
	  age.setFont(comics20);

	  cherM = new JLabel(" Phrase a composer"); cherM.setBounds(6,2,200,50);
	  motg = new JLabel(""); motg.setBounds(6,60,200,50);
	  motg1 = new JLabel(""); motg1.setBounds(60,60,200,70);
	  
	  mote = new JLabel("");mote.setBounds(150,7,400,70);
	  resulte = new JLabel("");resulte.setBounds(60,70,200,20);
	  etmot = new JLabel("Le mot :");etmot.setBounds(7,4,200,50);
	  
	  cherM.setFont(comics20);
	  motg.setFont(comics20);
	  resulte.setFont(resul);
	  mote.setFont(comics20);
	  etmot.setFont(comics20);
	  for(int i = 0 ;i <38;i++)
	  {
		  pl.add(l[i]);
	  }
	 
	  Icon.add(con);Icon.add(fin);
	  panIcon.add(nom);panIcon.add(age);	 
	  pmg.add(motg);pmg.add(cherM);panR.add(resulte);
	  pme.add(mote);pme.add(breset);pme.add(etmot);	  
	  this.add(pl);this.add(pmg);this.add(panR);this.add(panIcon);this.add(pme); 
	  this.setBounds(1,1,1350,750); 
	  this.setVisible(false);	  	 	  
  }


  public void jouer() {
	  Deplacer d[] = new Deplacer[38];
	  if(this.isVisible() == true)
		{
		  for(int i = 0;i<38;i++)
		{
			d[i] = new Deplacer(l[i],(int)(Math.random()*(40-(20)+1))+(20));
			d[i].start();
			
		}
		  c = new Comparer();c.start();
		  init i = new init();i.start();
		  	  
	  }  
  }
  

  class copieListener extends  MouseAdapter{
  
		@Override
		public void mouseClicked(MouseEvent event){
					
				JLabel l = (JLabel)event.getSource();

			    l.setVisible(false);
			    mote.setText(mote.getText()+l.getText());

			    if(mote.getText().compareTo(motg.getText()) == 0){
				 resulte.setText("Good job");
				 mote.setText("");
			  c=new Comparer();c.start();
				  init i1 = new init();i1.start();
				  
				  motg.setVisible(true);
				  
				 rscore.setText((Integer.parseInt(rscore.getText())+10)+"");
				 rscoreJ.setText((Integer.parseInt(rscoreJ.getText())+10)+"");
				 rscoreJ.setForeground(Color.blue);
				 Font f=new Font("Tahoma", Font.BOLD, 20);
				 Font comics30 = new Font("Comics Sans MS", Font.BOLD, 20);
				 rscoreJ.setFont(comics30);
				 				 		
				}

			}
			}
    class ecout implements ActionListener{
        public void actionPerformed(ActionEvent e){

            mote.setText("");

        }

    }
    class space implements ActionListener{
        public void actionPerformed(ActionEvent e){

            mote.setText(mote.getText()+" ");

        }

    }


}