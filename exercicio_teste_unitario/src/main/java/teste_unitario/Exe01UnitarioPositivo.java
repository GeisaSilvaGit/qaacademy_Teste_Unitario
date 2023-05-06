package teste_unitario;
//Criar teste unitario positivo p validar que um metodo que receba uma frase do usuario é a esperada.

import javax.swing.JOptionPane;

public class Exe01UnitarioPositivo {
    
    public static String inserirPalavra(){
        String palavra = JOptionPane.showInputDialog("Nada facil");
        return palavra;
}
}
