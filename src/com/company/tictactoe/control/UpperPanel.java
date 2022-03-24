package tictactoe.control;

import javax.swing.*;

public class UpperPanel extends JPanel {

    public static final PlayerControlButton XPlayer = new PlayerControlButton();

    public static final PlayerControlButton OPlayer = new PlayerControlButton();

    public static final StartReset startReset = new StartReset();

    public UpperPanel() {
        setLayout(null);

        XPlayer.setName("ButtonPlayer1");
        XPlayer.setBounds(0, 0, 200, 40);

        OPlayer.setName("ButtonPlayer2");
        OPlayer.setBounds(400, 0, 200, 40);

        startReset.setBounds(200, 0, 200, 40);

        add(XPlayer);
        add(startReset);
        add(OPlayer);
    }

    public static void lockPlayers() {
        XPlayer.setEnabled(false);
        OPlayer.setEnabled(false);
    }

    public static void unlockPlayers() {
        XPlayer.setEnabled(true);
        OPlayer.setEnabled(true);
    }
}
