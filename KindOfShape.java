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
    public static void go() {
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
	
	JButton btnNewButton = new JButton("Read from File");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		    try {
			Choice.choice(0);
		    } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		    }
		}
	});
	btnNewButton.setBounds(10, 11, 126, 23);
	getContentPane().add(btnNewButton);
	
	JButton btnNewButton_1 = new JButton("Circle");
	btnNewButton_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		    try {
			Choice.choice(1);
		    } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		    }
		}
	});
	btnNewButton_1.setBounds(10, 36, 126, 23);
	getContentPane().add(btnNewButton_1);

    }
}
