package tictactoe.control;

import javax.swing.*;

public class PlayerControlButton extends JButton {

    private Player player = Player.HUMAN;

    public PlayerControlButton() {
        setFocusPainted(false);
        setText("Human");
        addActionListener(e -> {
            if (player == Player.HUMAN) {
                player = Player.ROBOT;
                setText("Robot");
            } else {
                player = Player.HUMAN;
                setText("Human");
            }
        });
    }

    public Player getPlayer() {
        return player;
    }
}
