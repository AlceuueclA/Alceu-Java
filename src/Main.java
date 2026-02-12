import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] questoes = {
                "O que é uma cebola?",
                "O que é uma maçã?",
                "O que é um tomate?",
                "O que é o leite?",
                "O que é uma banana?"
        };

        String[][] opcoes = {
                {"1. Fruta", "2. Verdura", "3. Legume", "4. Vegetal"},
                {"1. Fruta", "2. Verdura", "3. Legume", "4. Vegetal"},
                {"1. Fruta", "2. Verdura", "3. Legume", "4. Vegetal"},
                {"1. Comida", "2. Bebida", "3. Ingrediente"},
                {"1. Fruta", "2. Verdura", "3. Legume", "4. Vegetal"}
        };
        int[] respostas = {4, 1, 1, 2, 1};
        int pontuacao = 0;
        int guess;
        Scanner scanner = new Scanner(System.in);
        System.out.println("*******************************");
        System.out.println("Bem-Vindo ao Quiz do Alceu");
        System.out.println("*******************************");


        for (int i = 0; i < questoes.length; i++) {
            System.out.println(questoes[i]);

            for (String opcao : opcoes[i]) {

                System.out.println(opcao);
            }

            System.out.print("Digite sua Resposta: ");
            guess = scanner.nextInt();


            if(guess == respostas[i]){
                System.out.println("**************");
                System.out.println("Resposta certa!");
                System.out.println("**************");
                pontuacao++;
            }
            else{
                System.out.println("Resposta incorreta :(");
            }

            System.out.println("Sua pontuação foi: " + pontuacao + "de " + questoes.length);
        }

        scanner.close();

    }
}