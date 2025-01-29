import javax.swing.*;
import java.awt.*;

public class TelaInicial extends JFrame {

    public TelaInicial() {
        // Carrega a imagem de fundo
        ImageIcon fundoIcon = new ImageIcon(getClass().getResource("/tela_fundo.png"));

        // Configurações da janela
        setTitle("MathQuest");
        setSize(fundoIcon.getIconWidth(), fundoIcon.getIconHeight()); // Ajusta o tamanho da janela para o tamanho da imagem
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela

        // Adiciona o fundo
        JLabel fundo = new JLabel(fundoIcon);
        fundo.setLayout(null); // Layout manual para o fundo
        add(fundo);

        // Carrega o logo
        ImageIcon logoIcon = new ImageIcon(getClass().getResource("/logo_tela_.png"));

        // Centraliza o logo
        JLabel logo = new JLabel(logoIcon);
        int logoX = (fundoIcon.getIconWidth() - logoIcon.getIconWidth()) / 2; // Centraliza o logo
        logo.setBounds(logoX, 50, logoIcon.getIconWidth(), logoIcon.getIconHeight());
        fundo.add(logo);

        // Botão "Iniciar Jogo"
        JButton botaoIniciar = new JButton("Iniciar Jogo");
        int botaoX = (fundoIcon.getIconWidth() - 200) / 2; // Centraliza o botão
        botaoIniciar.setBounds(botaoX, 400, 200, 50);
        botaoIniciar.addActionListener(e -> {
            // Fecha a tela inicial e abre a tela do jogo (por enquanto, só fecha)
            dispose();
        });
        fundo.add(botaoIniciar); // Adiciona o botão sobre o fundo
    }

    public static void main(String[] args) {
        // Executa a tela inicial
        SwingUtilities.invokeLater(() -> {
            new TelaInicial().setVisible(true);
        });
    }
}
