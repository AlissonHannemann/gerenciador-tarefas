package gerenciadortarefas;

import javax.swing.*;

public class PainelCadastroUsuario extends JPanel {
    public PainelCadastroUsuario() {
        setLayout(null);

        JLabel nomeLabel = new JLabel("Nome:");
        nomeLabel.setBounds(20, 20, 100, 25);
        add(nomeLabel);

        JTextField nomeField = new JTextField();
        nomeField.setBounds(120, 20, 200, 25);
        add(nomeField);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(20, 60, 100, 25);
        add(emailLabel);

        JTextField emailField = new JTextField();
        emailField.setBounds(120, 60, 200, 25);
        add(emailField);

        JLabel senhaLabel = new JLabel("Senha:");
        senhaLabel.setBounds(20, 100, 100, 25);
        add(senhaLabel);

        JPasswordField senhaField = new JPasswordField();
        senhaField.setBounds(120, 100, 200, 25);
        add(senhaField);

        JLabel tipoLabel = new JLabel("Tipo de Usuário:");
        tipoLabel.setBounds(20, 140, 100, 25);
        add(tipoLabel);

        String[] tipos = {"Colaborador", "Líder", "Gerente"};
        JComboBox<String> tipoCombo = new JComboBox<>(tipos);
        tipoCombo.setBounds(120, 140, 200, 25);
        add(tipoCombo);

        JButton cadastrarButton = new JButton("Cadastrar");
        cadastrarButton.setBounds(120, 180, 200, 30);
        add(cadastrarButton);
        
        cadastrarButton.addActionListener(e -> {
            String nome = nomeField.getText();
            String email = emailField.getText();
            String senha = new String(senhaField.getPassword());
            String tipo = (String) tipoCombo.getSelectedItem();

            if (nome.isEmpty() || email.isEmpty() || senha.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            boolean sucesso = UsuarioDAO.cadastrarUsuario(nome, email, senha, tipo);

            if (sucesso) {
                JOptionPane.showMessageDialog(this, "Usuário cadastrado com sucesso!");
                nomeField.setText("");
                emailField.setText("");
                senhaField.setText("");
                tipoCombo.setSelectedIndex(0);
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao cadastrar usuário.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });

    }
}
