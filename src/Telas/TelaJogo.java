package Telas;

import javax.swing.*;

public class TelaJogo extends JFrame {

    public TelaJogo() {
        // Configuração da janela
        setTitle("Tela do Jogo");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        // Caminho da imagem do fundo
        String caminhoFundo = "C:\\Users\\zinho\\OneDrive\\Documentos\\portifolio_arte\\POO_ARTES\\tela_fundo.png";

        // Adicionar o fundo
        JLabel fundo = new JLabel(new ImageIcon(caminhoFundo));
        fundo.setBounds(0, 0, 800, 600); // Fundo cobre toda a tela
        add(fundo);

        setVisible(true);
    }
}
