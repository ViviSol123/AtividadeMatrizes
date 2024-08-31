
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author vitor
 */
public class Questao02 {

    public static void main(String[] args) {
        int quant = Integer.parseInt(JOptionPane.showInputDialog("informe a quantidade de pessoas a ser cadastrada: "));
        String[][] matriz = new String[quant][2];
        
        int j=0;
        for (int i = 0; i < quant; i++) {
            matriz[i][j] = JOptionPane.showInputDialog("Digite o " + (i + 1) + "º Nome: ");
            j++;
            matriz[i][j] = JOptionPane.showInputDialog("Digite o " + (i + 1) + "º tel: ");
            j = 0;
        }
        String nome = JOptionPane.showInputDialog("Informe um nome a ser consultado:");
        boolean achou = false;
        for (int i = 0; i< quant; i++) {
            if (matriz[i][0].equalsIgnoreCase(nome)) {
                JOptionPane.showMessageDialog(null, "Nome: " + matriz[i][0] + "\nTel: " + matriz[i][1]);
                achou = true;
                break;
            }
        }
        if (!achou) {
            JOptionPane.showMessageDialog(null, "O nome " + nome + " não foi encontrado!");
        }
    }

}
/* public static void main(String[] args){
        int quant = Integer.parseInt(JOptionPane.showInputDialog("informe a quantidade de pessoas a ser cadastrada: "));
        String[][] matriz = new String[quant][2];
        
        int j=0;
        for (int i = 0; i < quant; i++) {
            matriz[i][j] = JOptionPane.showInputDialog("Digite o " + (i + 1) + "º Nome: ");
            j++;
            matriz[i][j] = JOptionPane.showInputDialog("Digite o " + (i + 1) + "º tel: ");
            j = 0;
        }
        String nome = JOptionPane.showInputDialog("Informe um nome a ser consultado:");
        boolean achou = false;
        for (int i = 0; i< quant; i++) {
            if (matriz[i][0].equalsIgnoreCase(nome)) {
                JOptionPane.showMessageDialog(null, "Nome: " + matriz[i][0] + "\nTel: " + matriz[i][1]);
                achou = true;
                break;
            }
        }
        if (!achou) {
            JOptionPane.showMessageDialog(null, "O nome " + nome + " não foi encontrado!");
 */
