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
//============
	JButton test = new JButton("Test");
	test.setBounds(BUT_MX, BUT_MY, BUT_H, BUT_W);
	test.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent arg0) {
		new Test();}});
	add(test);
//===========
	JButton readFromFile = new JButton("Read from File");
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
	JButton circle = new JButton("Circle");
	circle.setBounds(BUT_MX, BUT_MY+2*25, BUT_H, BUT_W);
	circle.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent arg0) {
		new Circle();
	    }
	});
	add(circle);
//=========
	JButton equi = new JButton("Equilateral polygon");
	equi.setBounds(BUT_MX, BUT_MY+3*25, BUT_H, BUT_W);
	equi.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent arg0) {
		new Equi();
	    }
	});
	add(equi);
//===========
	JButton poly = new JButton("PolyLine");
	poly.setBounds(BUT_MX, BUT_MY+4*25, BUT_H, BUT_W);
	poly.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent arg0) {
		new Poly();
	    }
	});
	add(poly);
//============
	JButton phomb = new JButton("Rhomb");
	phomb.setBounds(BUT_MX, BUT_MY+5*25, BUT_H, BUT_W);
	phomb.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent arg0) {
		new Rhomb();
	    }
	});
	add(phomb);
//============
    }
}
