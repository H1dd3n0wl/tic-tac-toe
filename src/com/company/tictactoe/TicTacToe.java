package com.company.tictactoe;

import tictactoe.control.UpperPanel;
import tictactoe.field.Board;
import tictactoe.status.GameMenu;
import tictactoe.status.StatusBar;

import javax.swing.*;

public class TicTacToe extends JFrame {

    private static final Board board = new Board();

    private static final StatusBar bar = new StatusBar();

    private static final UpperPanel panel = new UpperPanel();

    private static final GameMenu menuBar = new GameMenu();

    public TicTacToe() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 730);
        setTitle("Tic Tac Toe");
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);

        setJMenuBar(menuBar);

        panel.setBounds(0, 0, 600, 40);
        add(panel);

        board.setBounds(0, 40, 600, 600);
        add(board);

        bar.setBounds(0, 640, 600, 40);
        add(bar);
        setVisible(true);
    }
}