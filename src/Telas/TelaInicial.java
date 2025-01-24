package Telas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaInicial extends JFrame {

    public TelaInicial() {
        // Configuração da janela
        setTitle("MATHQUEST");
        setSize(800, 600); // Tamanho da tela
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centralizar na tela
        setLayout(null); // Layout absoluto para posicionamento manual

        // Caminho das imagens
        String caminhoFundo = "C:\\Users\\zinho\\OneDrive\\Documentos\\portifolio_arte\\POO_ARTES\\tela_fundo.png";
        String caminhoLogo = "C:\\Users\\zinho\\OneDrive\\Documentos\\portifolio_arte\\POO_ARTES\\logo_tela.png";

        // Adicionar o fundo
        JLabel fundo = new JLabel(new ImageIcon(caminhoFundo));
        fundo.setBounds(0, 0, 800, 600); // Fundo cobre toda a tela
        add(fundo);

        // Adicionar o logo do jogo
        JLabel logo = new JLabel(new ImageIcon(caminhoLogo));
        logo.setBounds(200, 50, 400, 150); // Centralizado no topo
        fundo.add(logo);

        // Adicionar o botão Start
        JButton botaoStart = new JButton("Start");
        botaoStart.setBounds(300, 450, 200, 50); // Centralizado na parte inferior
        fundo.add(botaoStart);

        // Ação do botão
        botaoStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                trocarParaTelaDoJogo();
            }
        });

        setVisible(true);
    }

    // Método para trocar para a tela do jogo
    private void trocarParaTelaDoJogo() {
        getContentPane().removeAll(); // Remove tudo da tela
        repaint(); // Atualiza a tela

        // Caminho da imagem do fundo na tela do jogo
        String caminhoFundo = "C:\\Users\\zinho\\OneDrive\\Documentos\\portifolio_arte\\POO_ARTES\\tela_fundo.png";

        // Adiciona o novo fundo (sem logo e botão)
        JLabel novoFundo = new JLabel(new ImageIcon(caminhoFundo));
        novoFundo.setBounds(0, 0, 800, 600);
        add(novoFundo);

        revalidate(); // Atualiza a interface gráfica
    }

    public static void main(String[] args) {
        new TelaInicial();
    }
}
