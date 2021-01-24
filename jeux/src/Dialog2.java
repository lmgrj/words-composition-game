

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;


public class Dialog2 extends JDialog {
  private Dialog3 zInfo = new Dialog3();
  private boolean sendData;
  private JLabel nomLabel, sexeLabel, cheveuxLabel, ageLabel, tailleLabel,taille2Label, icon;
  private JRadioButton tranche0,tranche1, tranche2,  tranche4;
  private JComboBox sexe, cheveux;
  private static JTextField nom;
  private JTextField taille;

  public Dialog2() {}
  public Dialog2(JFrame parent, String title, boolean modal){
    super(parent, title, modal);
    this.setSize(760,340);
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

  private void initComponent(){
    icon = new JLabel(new ImageIcon("C:\\Users\\hamani asmae\\Desktop\\Asmae\\jeuxasmae\\src\\images\\img2.jpg"));
    JPanel panIcon = new JPanel();
    panIcon.setBackground(Color.white);
    panIcon.setLayout(new BorderLayout());
    panIcon.add(icon);
    JPanel panNom = new JPanel();
    panNom.setBackground(Color.white);
    panNom.setPreferredSize(new Dimension(249, 90));
    nom = new JTextField();
    nom.setPreferredSize(new Dimension(100, 25));
    panNom.setBorder(BorderFactory.createTitledBorder("Nom du joueur"));
    nomLabel = new JLabel("entrer votre nom :");
    panNom.add(nomLabel);
    panNom.add(nom);

    JPanel panAge = new JPanel();
    panAge.setBackground(Color.white);
    panAge.setBorder(BorderFactory.createTitledBorder("Entrer votre age"));
    panAge.setPreferredSize(new Dimension(500, 90));
    
    
    tranche0 = new JRadioButton("Moin de 10 ans");
    tranche0.setSelected(true);
    tranche1 = new JRadioButton("10 - 20 ans");
    tranche2 = new JRadioButton("Plus de 20 ans");
 ButtonGroup bg = new ButtonGroup();
    bg.add(tranche0);
    bg.add(tranche1);
    bg.add(tranche2);
    panAge.add(tranche0);
    panAge.add(tranche1);
    panAge.add(tranche2);
   JPanel content = new JPanel();
    content.setBackground(Color.white);
    content.add(panNom);
    content.add(panAge);
    JPanel control = new JPanel();   
    JButton okBouton = new JButton("Jouer");
     okBouton.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent arg0) {        
        zInfo = new Dialog3(nom.getText(), getAge()); 
        setVisible(false);

      }

      public String getAge(){
        return (tranche0.isSelected()) ? tranche0.getText() : 
        	   (tranche1.isSelected()) ? tranche1.getText() : 
               (tranche2.isSelected()) ? tranche2.getText() :  
                tranche0.getText();  
      }

     
    });

    JButton cancelBouton = new JButton("Annuler");
    cancelBouton.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent arg0) {
        System.exit(1);
      }      
    });

    control.add(okBouton);
    control.add(cancelBouton);

    this.getContentPane().add(panIcon, BorderLayout.WEST);
    this.getContentPane().add(content);
    this.getContentPane().add(control, BorderLayout.SOUTH);
  }  
 
}


