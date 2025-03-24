package br.com.bars_register;

import br.com.bars_register.view.Login;
import com.formdev.flatlaf.FlatIntelliJLaf;
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
                    "Falha ao iniciar o FlatLaf " + e.getMessage(),
                    "ERRO",
                    JOptionPane.WARNING_MESSAGE);
        }
    }
}
