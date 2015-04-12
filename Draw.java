import java.awt.Component;

import javax.swing.JFrame;


public class Draw<DrawPanel> {
    JFrame frameForDraw;
    
    Draw() {
	frameForDraw = new JFrame();
	frameForDraw.setBounds(50, 50, 1000, 700);
	frameForDraw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frameForDraw.setVisible(true);
    }
    
    public void addDrawPanel(Component panel) {
	frameForDraw.add(panel);
    }

}
