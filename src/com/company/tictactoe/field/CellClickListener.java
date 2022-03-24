package tictactoe.field;

import tictactoe.status.GameState;
import tictactoe.status.StatusBar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CellClickListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        Cell curCell = (Cell) e.getSource();
        if (curCell.forbiddenToClick) {
            return;
        }
        if (Cell.isXTurn) {
            curCell.setText("X");
            Cell.changeTurn();
        } else {
            curCell.setText("O");
            Cell.changeTurn();
        }
        curCell.forbiddenToClick = true;
        GameState newState = Board.checkBoard();
        StatusBar.changeState(newState);
        if (newState == GameState.X_WINS || newState == GameState.O_WINS) {
            Board.lockBoard();
        }
    }
}
