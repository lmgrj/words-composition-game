

import java.awt.Container;
import java.awt.*;
import javax.swing.*;

public class Deplacer extends Thread {

	JLabel l;
	int pd, decx, decy;


	public Deplacer(JLabel l, int pd) {

		this.l = l;
		this.pd = pd;

	}

	public void run() {
		Color t[] = {Color.black, Color.red, Color.orange, Color.yellow, Color.green, Color.cyan, Color.darkGray, Color.gray};

		while (true) {

			try {
							   
				 int  i = (int)(Math.random()*(13)+0);
				System.out.println("*****************"+i);

			     l.setBounds(l.getX()+(int)(Math.random()*(3))+(-1),l.getY()+1,300,50);
			      if(Game.pl.getHeight() == l.getY()  || (l.isVisible() == false) )
			      {
					  l.setBounds((int)(Math.random()*(751)+(0)),-(int)(Math.random()*(181)+(20)),200,30);
					  l.setVisible(true);
			    	  l.setForeground(t[(int)(Math.random()*(9))]);
			    	  l.setText(Game.lettre[i]);
			      }
			      if( l.getX() <= 0)
			      {
			    	  l.setBounds(l.getX()+10,l.getY()+decx,300,50);
			      }
			      if(l.getX() >= Game.pl.getWidth() )
			      {
			    	  l.setBounds(l.getX()-20,l.getY()+decx,300,50);
			      }
			      Thread.sleep(pd+(int)(Math.random()*(3))+(-1));
			      
			    } catch (InterruptedException e) {
			      e.printStackTrace();
			    }
			}
		}
	}

