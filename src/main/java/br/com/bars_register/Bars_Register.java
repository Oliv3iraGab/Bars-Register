package br.com.bars_register;

import br.com.bars_register.persistence.Produto;
import br.com.bars_register.view.Login;
import com.formdev.flatlaf.FlatIntelliJLaf;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author limag
 */
public class Bars_Register {

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
            new Login().setVisible(true);
        } catch (UnsupportedLookAndFeelException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Failed to initialize LaF " + e.getMessage(),
                    "ERRO",
                    JOptionPane.WARNING_MESSAGE);
        }
    }
}
