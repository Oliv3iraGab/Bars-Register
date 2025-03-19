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
        Scanner s = new Scanner(System.in);
        // Protótipo de um registro de produto
        try {
            int id = 0;
            do {
                System.out.println("----Registro de produto----");
                System.out.println("Digite o nome do produto: ");
                String nomeProduto = s.nextLine();

                System.out.println("Digite o preço do produto: ");
                Double precoProduto = s.nextDouble();

                System.out.println("Digite a quantidade em estoque do produto: ");
                int estoqueProduto = s.nextInt();

                s.nextLine();

                Produto produto = new Produto(id, nomeProduto, precoProduto, estoqueProduto);

                System.out.println("Produto registrado: " + produto.getNome());

                System.out.println("Deseja informar outro produto? (S/N)");
                String resposta = s.nextLine();

                if (resposta.equalsIgnoreCase("N")) {
                    break;
                }
            } while (true);
        } catch (Exception e) {
            System.out.println("Preencha os dados corretamente!");
        } finally {
            s.close();
        }
    }
}
