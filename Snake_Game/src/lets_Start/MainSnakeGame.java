package lets_Start;
import javax.swing.*;

public class MainSnakeGame {

	public static void main(String[] args) {
		int boardWidth=600;
		int boardHeight=boardWidth;
		
		JFrame frame = new JFrame("Snake");
		frame.setVisible(true);
		frame.setSize(boardWidth, boardHeight);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GamePanel panel = new GamePanel(boardWidth, boardHeight);
		frame.add(panel);
		frame.pack();
		panel.requestFocus();
	}
}
