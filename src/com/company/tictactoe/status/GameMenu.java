package tictactoe.status;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class GameMenu extends JMenuBar {

    public GameMenu() {
        JMenu gameMenu = new JMenu("Game");
        gameMenu.setName("MenuGame");
        gameMenu.setMnemonic(KeyEvent.VK_G);
        add(gameMenu);

        JMenuItem humanVsHuman = new JMenuItem("Human vs Human");
        humanVsHuman.setName("MenuHumanHuman");
        humanVsHuman.setMnemonic(KeyEvent.VK_H);
        humanVsHuman.addActionListener(new MenuEventsListener());
        gameMenu.add(humanVsHuman);

        JMenuItem humanVsRobot = new JMenuItem("Human vs Robot");
        humanVsRobot.setName("MenuHumanRobot");
        humanVsRobot.setMnemonic(KeyEvent.VK_R);
        humanVsRobot.addActionListener(new MenuEventsListener());
        gameMenu.add(humanVsRobot);

        JMenuItem robotVsHuman = new JMenuItem("Robot vs Human");
        robotVsHuman.setName("MenuRobotHuman");
        robotVsHuman.setMnemonic(KeyEvent.VK_U);
        robotVsHuman.addActionListener(new MenuEventsListener());
        gameMenu.add(robotVsHuman);

        JMenuItem robotVsRobot = new JMenuItem("Robot vs Robot");
        robotVsRobot.setName("MenuRobotRobot");
        robotVsRobot.setMnemonic(KeyEvent.VK_O);
        robotVsRobot.addActionListener(new MenuEventsListener());
        gameMenu.add(robotVsRobot);

        JMenuItem exit = new JMenuItem("Exit");
        exit.setName("MenuExit");
        exit.addActionListener(e -> System.exit(0));
        exit.setMnemonic(KeyEvent.VK_X);
        gameMenu.addSeparator();
        gameMenu.add(exit);
    }
}
