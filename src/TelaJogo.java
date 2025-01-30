import javax.swing.*;
import java.awt.*;

public class TelaJogo extends JFrame {

    public TelaJogo() {
        ImageIcon fundoIcon = new ImageIcon(getClass().getResource("/tela_fundo.png"));

        setTitle("MathQuest - Jogo");
        setSize(fundoIcon.getIconWidth(), fundoIcon.getIconHeight());
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel fundo = new JLabel(fundoIcon);
        fundo.setLayout(null);
        add(fundo);

        setVisible(true);
    }
}
