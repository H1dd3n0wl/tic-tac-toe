package tictactoe.status;

import tictactoe.control.Player;
import tictactoe.control.UpperPanel;
import tictactoe.field.Cell;

import javax.swing.*;
import java.text.MessageFormat;

public class StatusLabel extends JLabel {

    private GameState state;

    StatusLabel() {
        setName("LabelStatus");
        setState(GameState.GAME_IS_NOT_STARTED);
        setText(state.getState());
    }

    public void setState(GameState state) {
        this.state = state;
        if (state == GameState.GAME_IS_NOT_STARTED || state == GameState.DRAW) {
            setText(state.getState());
        } else if (state == GameState.GAME_IN_PROGRESS) {
            Player curTurn = Cell.isXTurn ? UpperPanel.XPlayer.getPlayer()
                    : UpperPanel.OPlayer.getPlayer();
            String curLabel = Cell.isXTurn ? "X" : "O";
            setText(MessageFormat.format("The turn of {0} Player ({1})",
                    curTurn.getName(), curLabel));
        } else {
            Player winner = state == GameState.X_WINS ? UpperPanel.XPlayer.getPlayer()
                    : UpperPanel.OPlayer.getPlayer();
            String winnerLabel = state == GameState.X_WINS ? "X" : "O";
            setText(MessageFormat.format("The {0} Player ({1}) wins",
                    winner.getName(), winnerLabel));
        }
    }
}
