import javax.swing.*;
import java.awt.*;

public class TelaInicial extends JFrame {

    public TelaInicial() {

        ImageIcon fundoIcon = new ImageIcon(getClass().getResource("/tela_fundo.png"));

        setTitle("MathQuest");
        setSize(fundoIcon.getIconWidth(), fundoIcon.getIconHeight());
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel fundo = new JLabel(fundoIcon);
        fundo.setLayout(null);
        add(fundo);

        ImageIcon logoIcon = new ImageIcon(getClass().getResource("/logo_tela_.png"));

        JLabel logo = new JLabel(logoIcon);
        int logoX = (fundoIcon.getIconWidth() - logoIcon.getIconWidth()) / 2; // Centraliza o logo
        logo.setBounds(logoX, 50, logoIcon.getIconWidth(), logoIcon.getIconHeight());
        fundo.add(logo);

        JButton botaoIniciar = new JButton("Iniciar Jogo");

        botaoIniciar.setBackground(new Color(30, 100, 200)); // Azul mais claro
        botaoIniciar.setForeground(new Color(255, 215, 0)); // Dourado
        botaoIniciar.setFont(new Font("Arial", Font.BOLD, 20));
        botaoIniciar.setBorder(BorderFactory.createLineBorder(new Color(255, 215, 0), 3)); // Borda dourada
        botaoIniciar.setFocusPainted(false);

        int botaoX = (fundoIcon.getIconWidth() - 200) / 2;
        botaoIniciar.setBounds(botaoX, 400, 200, 50);

        botaoIniciar.addActionListener(e -> {
            dispose();
            new TelaJogo();
        });

        fundo.add(botaoIniciar);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TelaInicial().setVisible(true);
        });
    }
}