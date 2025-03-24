package br.com.bars_register.util;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTable;

/**
 *
 * @author limag
 */
public class View {

    public static void standardCornerRadius(JPanel panel) {
        panel.putClientProperty("FlatLaf.style",
                "arc: 15");
    }

    public static void standardCornerRadius(JButton panel) {
        panel.putClientProperty("FlatLaf.style",
                "arc: 15");
    }

    public static void standardCornerRadius(JTextField panel) {
        panel.putClientProperty("FlatLaf.style",
                "arc: 15");
    }

    public static void standardCornerRadius(JScrollPane panel) {
        panel.putClientProperty("FlatLaf.style",
                "arc: 15");
    }

    public static void standardCornerRadius(JFormattedTextField table) {
        table.putClientProperty("FlatLaf.style",
                "arc: 15");
    }

    public static void standardCornerRadius(JTable table) {
        table.putClientProperty("FlatLaf.style",
                "arc: 15");
    }
}
