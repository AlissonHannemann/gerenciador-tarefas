package view;

import javax.swing.*;
import java.awt.*;

public class CadastroUsuarioView extends JFrame {
    public CadastroUsuarioView() {
        setTitle("Cadastro de Usuário");
        setSize(300, 250);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(5, 2));
        JTextField nomeField = new JTextField();
        JTextField emailField = new JTextField();
        JPasswordField senhaField = new JPasswordField();
        JComboBox<String> tipoCombo = new JComboBox<>(new String[]{"Colaborador", "Gerente", "Líder"});
        JButton salvarButton = new JButton("Salvar");

        panel.add(new JLabel("Nome:"));
        panel.add(nomeField);
        panel.add(new JLabel("Email:"));
        panel.add(emailField);
        panel.add(new JLabel("Senha:"));
        panel.add(senhaField);
        panel.add(new JLabel("Tipo:"));
        panel.add(tipoCombo);
        panel.add(new JLabel(""));
        panel.add(salvarButton);

        add(panel);
        setVisible(true);
    }
}