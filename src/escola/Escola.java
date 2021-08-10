/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;

import javax.swing.JOptionPane;

/**
 *
 * @author joao.costa3
 */
public class Escola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int qtdMedias = 0;

        int qtdAlunos = Integer.parseInt(JOptionPane.showInputDialog("quantos alunos gostaria de avaliar: "));

        for (int i = 0; i < qtdAlunos; i++) {

            String nome = JOptionPane.showInputDialog("informe o nome do aluno: ");
            int nota_1 = Integer.parseInt(JOptionPane.showInputDialog("informe a primera nota do " + nome + ":"));
            int nota_2 = Integer.parseInt(JOptionPane.showInputDialog("informe a segunda nota do " + nome + ":"));
            int media = (nota_1 + nota_2) / 2;
            System.out.println("A media do aluno " + nome + "foi de: " + media);
            if (media >= 7){
                System.out.println(nome + "esta APROVADO!!!");
            }
            else{
                System.out.println(nome + "esta REPROVADO!!!");
            }
            qtdMedias++;
        }
        System.out.println("Voce solicitou a media de " + qtdAlunos + " alunos e o sistema calculou " + qtdMedias + " medias");
    }
    
}
