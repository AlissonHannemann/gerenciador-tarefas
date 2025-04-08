package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainView extends JFrame {
    public MainView() {
        setTitle("Tela Principal");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane tabs = new JTabbedPane();
        JPanel tarefasPanel = new JPanel(new BorderLayout());
        JPanel usuariosPanel = new JPanel(new BorderLayout());

        String[] columnNames = {"Descrição", "Prazo", "Status", "Usuário"};
        Object[][] data = {
            {"Descrição 1", "Em andamento", "Degno", ""},
            {"Tarefa", "Em adorde", "Torantitto", ""},
            {"Enrodando", "Concluída", "Fredo", ""},
            {"João Tast", "Pendente", "Carios", ""}
        };

        JTable table = new JTable(data, columnNames);
        tarefasPanel.add(new JScrollPane(table), BorderLayout.CENTER);
        JButton novaTarefaButton = new JButton("Nova Tarefa");
        tarefasPanel.add(novaTarefaButton, BorderLayout.NORTH);

        novaTarefaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new CadastroTarefaView();
            }
        });

        JButton novoUsuarioButton = new JButton("Novo Usuário");
        usuariosPanel.add(novoUsuarioButton, BorderLayout.NORTH);
        novoUsuarioButton.addActionListener(e -> new CadastroUsuarioView());

        tabs.add("Tarefas", tarefasPanel);
        tabs.add("Usuários", usuariosPanel);

        add(tabs);
        setVisible(true);
    }
}