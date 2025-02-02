import javax.swing.*;
import java.awt.*;

public class MeuJogo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Janela janela = new Janela();
            janela.setVisible(true);
        });
    }
}

class Janela extends JFrame {
    public Janela() {
        setTitle("Meu Jogo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600); // Define o tamanho da janela (Largura, altura)
        setLocationRelativeTo(null); // Centraliza a janela na tela
        setResizable(false); // Impede que a janela seja redimensionada

        // Cria um painel para conter o personagem



        // Cria um painel para conter a imagem de fundo
        JPanel painelFundo = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Carrega a imagem de fundo
                ImageIcon imagemFundo = new ImageIcon("C:/Users/Raphael/Desktop/Meu jogo em Java/imagen do jogo/tela01.png");
                // Desenha a imagem esticada para preencher a tela
                g.drawImage(imagemFundo.getImage(), 0, 0, getWidth(), getHeight(), null);
            }
        };

        // Define o layout do painel de fundo como BorderLayout para preencher a tela inteira
        painelFundo.setLayout(new BorderLayout());
        add(painelFundo); // Adiciona o painel de fundo à janela
    }
}

class Jogo {
    public static void main(String[] args) {
        System.out.println("Este é o seu novo jogo");
    }
}
