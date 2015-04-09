import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;

import javax.swing.JFrame;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class ChoiceOfShape extends JFrame {
    private final static int BUT_W = 23;
    private final static int BUT_H = 150;
    private final static int BUT_MX = 45;
    private final static int BUT_MY = 11;
    private static int numOfShape = 0;
    
    public static void doChoice() {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    new ChoiceOfShape().setVisible(true);
		} catch (Exception e) {
		    e.printStackTrace();
		}
	    }
	});
    }
    
    public ChoiceOfShape() {
	setTitle("Choise of Shape");
	setBounds(100, 100, 250, 300);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLayout(null);
//============
//===========
	JButton readFromFile = new JButton(Choice.listOfShape[numOfShape++]);
	readFromFile.setBounds(BUT_MX, BUT_MY+25, BUT_H, BUT_W);
	readFromFile.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent arg0) {
		try {
		    Choice.choice(0);
		} catch (FileNotFoundException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}}});
	add(readFromFile);
//===========
	JButton circle = new JButton(Choice.listOfShape[numOfShape++]);
	circle.setBounds(BUT_MX, BUT_MY+2*25, BUT_H, BUT_W);
	circle.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent arg0) {
		try {
		    Choice.choice(1);
		} catch (FileNotFoundException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
	    }
	});
	add(circle);
//=========
	JButton equi = new JButton(Choice.listOfShape[numOfShape++]);
	equi.setBounds(BUT_MX, BUT_MY+3*25, BUT_H, BUT_W);
	equi.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent arg0) {
		try {
		    Choice.choice(2);
		} catch (FileNotFoundException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
	    }
	});
	add(equi);
//===========
	JButton poly = new JButton(Choice.listOfShape[numOfShape++]);
	poly.setBounds(BUT_MX, BUT_MY+4*25, BUT_H, BUT_W);
	poly.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent arg0) {
		try {
		    Choice.choice(3);
		} catch (FileNotFoundException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
	    }
	});
	add(poly);
//============
	JButton phomb = new JButton(Choice.listOfShape[numOfShape++]);
	phomb.setBounds(BUT_MX, BUT_MY+5*25, BUT_H, BUT_W);
	phomb.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent arg0) {
		try {
		    Choice.choice(4);
		} catch (FileNotFoundException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
	    }
	});
	add(phomb);
//============
    }
}
