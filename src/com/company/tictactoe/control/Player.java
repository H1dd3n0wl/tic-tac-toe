package tictactoe.control;

import tictactoe.field.Board;

import javax.swing.*;

public enum Player {
    ROBOT,
    HUMAN;

    public String getName() {
        return switch (this) {
            case HUMAN -> "Human";
            case ROBOT -> "Robot";
        };
    }

    public void play() {
        switch (this) {
            case ROBOT -> Board.allCells.stream().filter(e -> !e.forbiddenToClick)
                    .findAny().ifPresent(AbstractButton::doClick);
            case HUMAN -> {
            }
        }
    }
}
