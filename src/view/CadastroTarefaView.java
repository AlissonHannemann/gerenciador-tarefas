package view;

import javax.swing.*;
import java.awt.*;

public class CadastroTarefaView extends JFrame {
    public CadastroTarefaView() {
        setTitle("Cadastro de Tarefa");
        setSize(300, 200);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(4, 2));
        JTextField descricaoField = new JTextField();
        JTextField prazoField = new JTextField();
        JTextField usuarioField = new JTextField();
        JButton salvarButton = new JButton("Salvar");

        panel.add(new JLabel("Descrição:"));
        panel.add(descricaoField);
        panel.add(new JLabel("Prazo:"));
        panel.add(prazoField);
        panel.add(new JLabel("Usuário:"));
        panel.add(usuarioField);
        panel.add(new JLabel(""));
        panel.add(salvarButton);

        add(panel);
        setVisible(true);
    }
}