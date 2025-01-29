
import javax.swing.*;
import java.awt.*;

public class TelaInicial extends JFrame {

    public TelaInicial() {
        // Configurações da janela
        setTitle("MathQuest");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Layout manual
        setLocationRelativeTo(null); // Centraliza a janela

        // Carrega as imagens
        ImageIcon fundoIcon = new ImageIcon(getClass().getResource("/tela_fundo.png"));
        ImageIcon logoIcon = new ImageIcon(getClass().getResource("/logo_tela_.png"));

        // Adiciona o fundo
        JLabel fundo = new JLabel(fundoIcon);
        fundo.setBounds(0, 0, 800, 600);
        add(fundo);

        // Adiciona o logo
        JLabel logo = new JLabel(logoIcon);
        logo.setBounds(200, 50, 400, 200); // Posiciona o logo
        fundo.add(logo); // Adiciona o logo sobre o fundo

        // Botão "Iniciar Jogo"
        JButton botaoIniciar = new JButton("Iniciar Jogo");
        botaoIniciar.setBounds(300, 400, 200, 50); // Posiciona o botão
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