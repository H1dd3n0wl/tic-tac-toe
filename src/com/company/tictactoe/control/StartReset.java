package tictactoe.control;

import tictactoe.field.Board;
import tictactoe.field.Cell;
import tictactoe.status.GameState;
import tictactoe.status.StatusBar;

import javax.swing.*;

public class StartReset extends JButton {

    private boolean start = true;

    private final Timer game = new Timer(1000, event -> {
        if (Cell.isXTurn) {
            UpperPanel.XPlayer.getPlayer().play();
        } else {
            UpperPanel.OPlayer.getPlayer().play();
        }
    });

    public StartReset() {
        setFocusPainted(false);
        setName("ButtonStartReset");
        setText("Start");

        addActionListener(e -> {
            if (start) {
                StatusBar.changeState(GameState.GAME_IN_PROGRESS);
                start = false;
                setText("Reset");
                Board.unlockBoard();
                UpperPanel.lockPlayers();
                game.start();
            } else {
                start = true;
                setText("Start");
                Board.clearBoard();
                Board.lockBoard();
                UpperPanel.unlockPlayers();
                game.stop();
            }
        });
    }
}
