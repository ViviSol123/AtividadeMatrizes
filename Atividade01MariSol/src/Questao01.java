
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author vitor
 */
public class Questao01 {

    public static void main(String[] args) {
        // O USUARIO VAI INFORMAR O TAMANHO DA MATRIZ
        int tamM = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos nomes serão cadastrados"));
        String[] matriz = new String[tamM];
        
        // LOOP PARA CADASTRAR OS NOMES 
        for (int i = 0; i < tamM; i++) {
            matriz[i] = JOptionPane.showInputDialog("Digite o " + (1 + i) + "° nome ");
            if(matriz[i]== null){
                break;
            }
        }
        
        // LOOP PARA ENCONTRAR O NOME CADASTRADO
        int num;
        for(;;) {
            String entrada = JOptionPane.showInputDialog("Digite número da  posição a ser procurada:");
            // SE O USUÁRIO NÃO DIGITAR NADA O PROGRAMA ENCERRA
            if(entrada == null){
                break;
            }else{
               num = Integer.parseInt(entrada);
            }
             if (num > 0 && num <= tamM) {
                    JOptionPane.showMessageDialog(null, "O nome encontrado na posição " + num + " foi: " + matriz[num - 1]);
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Valor inválido!!!");
                }
        }
    }

}
