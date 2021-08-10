/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;

import java.util.Scanner;

/**
 *
 * @author joao.costa3
 */
public class Escola2 {
    public static void main(String[] args) {
        
    
    int qtdMedias = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("informe a quantidade de alunos a ser avaliada: ");
        int turma = sc.nextInt();

        for (int i = 0; i < turma; i++) {
            System.out.println("informe o nome do aluno: ");
            String nome = sc.next();
            

            System.out.println("informe a primeira nota de maneira correta (de 0 a 10): ");
            double nota_1 = sc.nextDouble();
            

            System.out.println("informe a segunda nota: ");
            double nota_2 = sc.nextDouble();

            double media = (nota_1 + nota_2) / 2;
            System.out.println("A media do aluno " + nome + "foi de: " + media);

            if (media >= 7) {
                System.out.println(nome + " esta APROVADO!!!");
            } else {
                System.out.println(nome + " esta REPROVADO!!!");
            }

            System.out.println("");
            qtdMedias++;
        }
        System.out.println("Voce solicitou a media de " + turma + " alunos e o sistema calculou " + qtdMedias + " medias");
    }
}
