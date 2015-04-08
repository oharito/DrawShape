// This class has generated from Window Builder

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;


public class ChoiceOfShapeTest extends JFrame {

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    ChoiceOfShapeTest frame = new ChoiceOfShapeTest();
		    frame.setVisible(true);
		} catch (Exception e) {
		    e.printStackTrace();
		}
	    }
	});
    }

    /**
     * Create the frame.
     */
    public ChoiceOfShapeTest() {
    	setTitle("Choise of Shape Test");
	setBounds(100, 100, 250, 300);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	getContentPane().setLayout(null);
	
	JButton btnNewButton = new JButton("Test");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		    new Test();
		}
	});
	btnNewButton.setBounds(45, 11, 150, 23);
	getContentPane().add(btnNewButton);
	
	JButton btnNewButton_1 = new JButton("Read from File");
	btnNewButton_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		    try {
			Choice.choice(0);
		    } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		    }
		}
	});
	btnNewButton_1.setBounds(45, 36, 150, 23);
	getContentPane().add(btnNewButton_1);
	
	JButton btnNewButton_2 = new JButton("Circle");
	btnNewButton_2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		    new Circle();
		}
	});
	btnNewButton_2.setBounds(45, 61, 150, 23);
	getContentPane().add(btnNewButton_2);
	
	JButton btnNewButton_3 = new JButton("Equilateral polygon");
	btnNewButton_3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		    new Equi();
		}
	});
	btnNewButton_3.setBounds(45, 86, 150, 23);
	getContentPane().add(btnNewButton_3);
	
	JButton btnNewButton_4 = new JButton("PolyLine");
	btnNewButton_4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		    new Poly();
		}
	});
	btnNewButton_4.setBounds(45, 111, 150, 23);
	getContentPane().add(btnNewButton_4);
	
	JButton btnNewButton_5 = new JButton("Rhomb");
	btnNewButton_5.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		    new Rhomb();
		}
	});
	btnNewButton_5.setBounds(45, 136, 150, 23);
	getContentPane().add(btnNewButton_5);

    }
}
