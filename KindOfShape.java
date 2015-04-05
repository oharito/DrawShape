import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.GridLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;


public class KindOfShape extends JFrame {

    /**
     * Launch the application.
     */
    public static void doFrame() {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    KindOfShape frame = new KindOfShape();
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
    public KindOfShape() {
	setBounds(100, 100, 450, 300);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	getContentPane().setLayout(null);
	
	JButton readFromFile = new JButton(Choice.listOfShape[0]);
	readFromFile.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		    try {
			Choice.choice(0);
		    } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		    }
		}
	});
	readFromFile.setBounds(10, 11, 126, 23);
	getContentPane().add(readFromFile);
	
	JButton circle = new JButton(Choice.listOfShape[1]);
	circle.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new Circle();}});
	circle.setBounds(10, 36, 126, 23);
	getContentPane().add(circle);

    }
}
