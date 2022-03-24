package tictactoe.status;

import tictactoe.control.Player;
import tictactoe.control.UpperPanel;
import tictactoe.field.Board;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class MenuEventsListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JMenuItem item = (JMenuItem) e.getSource();
        if (UpperPanel.startReset.getText().equals("Reset")) {
            UpperPanel.startReset.doClick();
        }
        String[] versus = item.getText().split("\\s+");
        Player x_player = Player.valueOf(versus[0].toUpperCase(Locale.ROOT));
        Player o_player = Player.valueOf(versus[2].toUpperCase(Locale.ROOT));
        if (UpperPanel.XPlayer.getPlayer() != x_player) {
            UpperPanel.XPlayer.doClick();
        }
        if (UpperPanel.OPlayer.getPlayer() != o_player) {
            UpperPanel.OPlayer.doClick();
        }
        Board.clearBoard();
        UpperPanel.startReset.doClick();
    }
}
