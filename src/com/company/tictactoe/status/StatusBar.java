package tictactoe.status;

import javax.swing.*;
import java.awt.*;

public class StatusBar extends JPanel {

    private static final StatusLabel state = new StatusLabel();

    public StatusBar() {
        setLayout(new BorderLayout());
        add(state, BorderLayout.WEST);
        setVisible(true);
    }

    public static void changeState(GameState newState) {
        state.setState(newState);
    }
}
