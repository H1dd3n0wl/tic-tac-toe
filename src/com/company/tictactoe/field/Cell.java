package tictactoe.field;

import javax.swing.*;
import java.awt.*;

public class Cell extends JButton {

    public static boolean isXTurn = true;

    public boolean forbiddenToClick = false;

    public Cell(String coordinate) {
        setName("Button" + coordinate);
        Font font = new Font("Times new roman", Font.BOLD, 70);
        setFont(font);
        setText(" ");
        setFocusPainted(false);

        addActionListener(new CellClickListener());
    }

    public static void changeTurn() {
        isXTurn = !isXTurn;
    }

    public void clear() {
        setText(" ");
        forbiddenToClick = false;
        isXTurn = true;
    }
}
