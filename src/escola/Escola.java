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
            float nota_1 = Float.parseFloat(JOptionPane.showInputDialog("informe a primeira nota do(a) " + nome + ":"));
            while (nota_1 < 0 || nota_1 > 10){
                nota_1 = Float.parseFloat(JOptionPane.showInputDialog("informe a primeira nota do(a) " + nome + ":"));
            }
            float nota_2 = Float.parseFloat(JOptionPane.showInputDialog("informe a segunda nota do(a) " + nome + ":"));
            while (nota_2 <0 || nota_2 > 10){
                nota_2 = Float.parseFloat(JOptionPane.showInputDialog("informe a segunda nota do(a) " + nome + ":"));
            }
            float media = (nota_1 + nota_2) / 2;
            System.out.println("A media do(a) aluno(a) " + nome + "foi de: " + media);
            if (media >= 7){
                System.out.println(nome + "esta APROVADO(a)!!!");
            }
            else{
                System.out.println(nome + "esta REPROVADO(a)!!!");
            }
            qtdMedias++;
        }
        System.out.println("Voce solicitou a media de " + qtdAlunos + " alunos e o sistema calculou " + qtdMedias + " medias");
    }
    
}
