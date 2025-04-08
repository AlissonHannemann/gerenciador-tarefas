package gerenciadortarefas;

import javax.swing.*;
import java.awt.*;

public class TelaPrincipalFrame extends JFrame {
    public TelaPrincipalFrame() {
        setTitle("Tela Principal");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane tabbedPane = new JTabbedPane();

        // 👉 Aqui estão suas telas de cadastro:
        tabbedPane.add("Tarefas", new PainelCadastroTarefa());
        tabbedPane.add("Usuários", new PainelCadastroUsuario());


        add(tabbedPane);
        setVisible(true);
    }
}
