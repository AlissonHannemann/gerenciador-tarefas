package gerenciadortarefas;

import javax.swing.*;

public class PainelCadastroTarefa extends JPanel {
    public PainelCadastroTarefa() {
        setLayout(null);

        JLabel tituloLabel = new JLabel("Título:");
        tituloLabel.setBounds(20, 20, 100, 25);
        add(tituloLabel);

        JTextField tituloField = new JTextField();
        tituloField.setBounds(120, 20, 200, 25);
        add(tituloField);

        JLabel descricaoLabel = new JLabel("Descrição:");
        descricaoLabel.setBounds(20, 60, 100, 25);
        add(descricaoLabel);

        JTextArea descricaoArea = new JTextArea();
        JScrollPane scroll = new JScrollPane(descricaoArea);
        scroll.setBounds(120, 60, 200, 80);
        add(scroll);

        JLabel prazoLabel = new JLabel("Prazo:");
        prazoLabel.setBounds(20, 150, 100, 25);
        add(prazoLabel);

        JTextField prazoField = new JTextField();
        prazoField.setBounds(120, 150, 200, 25);
        add(prazoField);

        JLabel responsavelLabel = new JLabel("Responsável:");
        responsavelLabel.setBounds(20, 190, 100, 25);
        add(responsavelLabel);

        JTextField responsavelField = new JTextField();
        responsavelField.setBounds(120, 190, 200, 25);
        add(responsavelField);

        JButton cadastrarButton = new JButton("Cadastrar");
        cadastrarButton.setBounds(120, 230, 200, 30);
        add(cadastrarButton);
        
        cadastrarButton.addActionListener(e -> {
            String titulo = tituloField.getText();
            String descricao = descricaoArea.getText();
            String prazo = prazoField.getText(); // exemplo: "2025-04-07"
            String responsavel = responsavelField.getText();

            if (titulo.isEmpty() || descricao.isEmpty() || prazo.isEmpty() || responsavel.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            boolean sucesso = TarefaDAO.cadastrarTarefa(titulo, descricao, prazo, responsavel);

            if (sucesso) {
                JOptionPane.showMessageDialog(this, "Tarefa cadastrada com sucesso!");
                tituloField.setText("");
                descricaoArea.setText("");
                prazoField.setText("");
                responsavelField.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao cadastrar tarefa.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });

    }
}
