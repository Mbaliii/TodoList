import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public class ButtonPanel extends JPanel {
    private JButton addTask;
    private JButton clear;

    Border emptyBorder = BorderFactory.createEmptyBorder();

    // Constructor

    ButtonPanel() {
        this.setPreferredSize(new Dimension(200, 60));
        this.setBackground(Color.GRAY);

        addTask = new JButton("Add Task");
        addTask.setBorder(emptyBorder);
        addTask.setFont(new Font("Sans-serif", Font.PLAIN, 20));

        this.add(addTask);

        clear = new JButton("Clear Completed Tasks");
        clear.setBorder(emptyBorder);
        clear.setFont(new Font("Sans-serif", Font.PLAIN, 20));

        this.add(clear);

    }

    public JButton getAddTask() {

        return addTask;
    }

    public JButton getClear() {
        return clear;
    }

}
