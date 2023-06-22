package Shopping;

import javax.swing.*;

public class CadastroLoja extends JFrame{
    private JPanel PainelPrincipal;

    public CadastroLoja (String titulo){
        super(titulo);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(PainelPrincipal);
        this.pack();
    }

    public static void main(String[] args){
        JFrame frame = new CadastroLoja("Tela de Cadastro");
        frame.setVisible(true);
    }


}
