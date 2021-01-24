

import javax.swing.*;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dialog1 extends JDialog  {
	  private Dialog3 zInfo = new Dialog3();
	  private Game Info = new Game(2);
	  private boolean sendData;
	  public static JLabel icon;
      public static JPanel panPer,panScor,panIcon1;
      
     public Dialog1() {} 
	 public Dialog1(JFrame parent, String title, boolean modal){
		    super(parent, title, modal);
		    this.setSize(700,360);		    
		    this.setLocationRelativeTo(null);
		    this.setResizable(false);
		    this.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		    this.initComponent();
		  }
	 public Dialog3 showZDialog(){
		    this.sendData = false;
		    this.setVisible(true);      
		    return this.zInfo;      
		  }
	 private void initComponent() {
		 Font police = new Font(" Serif", Font.BOLD, 40);
		 Font policeB = new Font("Tahoma", Font.BOLD, 20);
		    icon = new JLabel(new ImageIcon("C:\\Users\\hamani asmae\\Desktop\\Asmae\\jeuxasmae\\src\\images\\img1.jpeg"));
		    JPanel panImg = new JPanel();
		    panImg.setBackground(Color.cyan);
		    panImg.setLayout(new BorderLayout());
		    panImg.add(icon);
		  panPer = new JPanel();
		    panScor = new JPanel();
		    panIcon1 = new JPanel();
		  panPer.setBackground(Color.blue);
		    panScor.setBackground(Color.blue);
		    panIcon1.setBackground(Color.blue);
		    
		    panScor.setLayout(null);
		    panIcon1.setLayout(null);
		   
		    panPer.setBounds(260,20,500,340);
		    panScor.setBounds(500,360,260,40);	    
		    panIcon1.setBounds(520,3,200,200);//340
		    
		    panIcon1.setBorder(BorderFactory.createTitledBorder("la page du joueur"));		 	   
		    panIcon1.add(Game.nomJ);panIcon1.add(Game.sexeJ);panIcon1.add(Game.ageJ);
		    panIcon1.add(Game.lscoreJ);panIcon1.add(Game.rscoreJ);  panIcon1.add(Comparer.Stage);
		   JPanel control = new JPanel();   
		    JButton okBouton = new JButton("Ressayer");
		    
		    okBouton.addActionListener(new ActionListener(){
		      public void actionPerformed(ActionEvent arg0) {        
		        setVisible(false);	
		        Fenetre.p1.setVisible(true);
		        Game.c = new Comparer();Game.c.start();		  
				init i = new init();i.start();
		      }
 
		    });
		    
		    JButton cancelBouton = new JButton("Fermer");
		    cancelBouton.addActionListener(new ActionListener(){
		      public void actionPerformed(ActionEvent arg0) {
		        System.exit(1);
		      }      
		    });
		    
		    control.add(okBouton);
		    control.add(cancelBouton);
			   
		    this.getContentPane().add(panImg, BorderLayout.WEST);
		    this.getContentPane().add(panIcon1, BorderLayout.CENTER);
		    this.getContentPane().add(control, BorderLayout.SOUTH);
		
	 }
	
	
}

