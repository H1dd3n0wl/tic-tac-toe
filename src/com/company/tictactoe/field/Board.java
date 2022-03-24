package tictactoe.field;

import tictactoe.status.GameState;
import tictactoe.status.StatusBar;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Objects;

public class Board extends JPanel {

    static Cell buttonA1 = new Cell("A1");
    static Cell buttonA2 = new Cell("A2");
    static Cell buttonA3 = new Cell("A3");
    static Cell buttonB1 = new Cell("B1");
    static Cell buttonB2 = new Cell("B2");
    static Cell buttonB3 = new Cell("B3");
    static Cell buttonC1 = new Cell("C1");
    static Cell buttonC2 = new Cell("C2");
    static Cell buttonC3 = new Cell("C3");

    public static final java.util.List<Cell> allCells = Arrays.asList(buttonA1, buttonA2, buttonA3,
            buttonB1, buttonB2, buttonB3, buttonC1, buttonC2, buttonC3);

    public Board() {
        setLayout(new GridLayout(3, 3));
        add(buttonA3);
        add(buttonB3);
        add(buttonC3);
        add(buttonA2);
        add(buttonB2);
        add(buttonC2);
        add(buttonA1);
        add(buttonB1);
        add(buttonC1);
        Board.lockBoard();
    }

    public static void clearBoard() {
        StatusBar.changeState(GameState.GAME_IS_NOT_STARTED);
        allCells.forEach(Cell::clear);
    }

    private static boolean winedPosition(Cell cell1, Cell cell2, Cell cell3) {
        return Objects.equals(cell1.getText(), cell2.getText()) &&
                Objects.equals(cell2.getText(), cell3.getText());
    }

    public static GameState checkBoard() {
        if ((winedPosition(buttonA3, buttonB2, buttonC1) ||
                winedPosition(buttonA1, buttonB2, buttonC3) ||
                winedPosition(buttonB1, buttonB2, buttonB3) ||
                winedPosition(buttonA2, buttonB2, buttonC2)) &&
                !" ".equals(buttonB2.getText())) {
            return GameState.valueOf(buttonB2.getText() + "_WINS");
        }
        if ((winedPosition(buttonA1, buttonA2, buttonA3) ||
                winedPosition(buttonA1, buttonB1, buttonC1)) &&
                !" ".equals(buttonA1.getText())) {
            return GameState.valueOf(buttonA1.getText() + "_WINS");
        }
        if ((winedPosition(buttonA3, buttonB3, buttonC3) ||
                winedPosition(buttonC1, buttonC2, buttonC3)) &&
                !" ".equals(buttonC3.getText())) {
            return GameState.valueOf(buttonC3.getText() + "_WINS");
        }
        if (allCells.stream().noneMatch(e -> " ".equals(e.getText()))) {
            return GameState.DRAW;
        }
        return GameState.GAME_IN_PROGRESS;
    }

    public static void lockBoard() {
        for (Cell i : allCells) {
            i.forbiddenToClick = true;
            i.setEnabled(false);
        }
    }

    public static void unlockBoard() {
        for (Cell i : allCells) {
            i.forbiddenToClick = false;
            i.setEnabled(true);
        }
    }
}
