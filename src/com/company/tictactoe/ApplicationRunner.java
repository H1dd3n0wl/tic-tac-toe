package com.company.tictactoe;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;

public class ApplicationRunner {
    public static void main(String[] args) {
        try {
            SwingUtilities.invokeAndWait(TicTacToe::new);
        } catch (InterruptedException | InvocationTargetException e) {
            System.out.println("Something went wrong!");
        }
    }
}
