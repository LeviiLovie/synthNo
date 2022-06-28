import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class index {
    public static void main(String[] args) {
		JFrame frame = new JFrame(/* название нашей игры */);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setUndecorated(true);
		frame.setVisible(true);
	}
}