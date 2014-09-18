// tic tac toe using graphical interface
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
// say is a j frame 
public class TicTacToe extends JFrame implements ActionListener{
		public enum GameResult { TIE, X_WINS, O_WINS, CONTINUE};
		private JButton[][] grid;
		private boolean xTurn;
		
		
		private GameResult isGameOver() {
			if(grid[0][0].getText() == grid[0][1].getText() &&
			   grid[0][1].getText() == grid[0][2].getText() &&
			   grid[0][0].getText() != " ") {
				if(grid[0][0].getText() == "x") return GameResult.X_WINS;
				else return GameResult.O_WINS;
			}
			else return GameResult.CONTINUE;
		}
		
		public TicTacToe() {
			xTurn = true;
			setLayout(new GridLayout(3, 3));
			grid = new JButton[3][3];
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					grid[i][j] = new JButton(" ");
					grid[i][j].addActionListener(this);
					add(grid[i][j]);
					
				}
			}
		}
		
		public void actionPerformed(ActionEvent event) {
			JButton b = (JButton)event.getSource();
			if(xTurn) b.setText("x");
			else b.setText("o");
			b.setEnabled(false);
			xTurn = !xTurn;
			GameResult result = isGameOver();
			if(isGameOver() != GameResult.CONTINUE) {
				String winner = "No one";
				if(result == GameResult.X_WINS) winner = "X";
				else if(result == GameResult.O_WINS) winner = "O";
				System.out.println("Game is over!");
				System.exit(0);
			}
					
		}
		
		public static void main(String[] args) {
			TicTacToe window = new TicTacToe();
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.pack();
			window.setVisible(true);
		}
}
