import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] perguntas = {"Que ano o Alceu nasceu?", "Quantos anos ele tem agora?", "Quantos ele vai fazer? "};

        String[][] opcoes = {{"1. 2003", "2. 2002", "3. 2004"
        }, {"1. 22", "2. 24", "3. 25"},
                {"1. 23", "2. 24", "3. 25"}};


        String deseja;
        do {

            Scanner scanner = new Scanner(System.in);
            int pontuaacao = 0;
            int[] respostas = {1, 1, 1};

            System.out.println("Bem-Vindo ao Quiz do Alceu!");
            for (int i = 0; i < perguntas.length; i++) {
                System.out.println(perguntas[i]);
                for (String opcao : opcoes[i]) {
                    System.out.println(opcao);
                }
                System.out.println("Dê sua resposta: ");
                int guess = scanner.nextInt();

                if (guess == respostas[i]) {
                    System.out.println("Certa resposta!");
                    pontuaacao++;
                } else {
                    System.out.println("Errado! A resposta era: " + respostas[i]);
                }
                System.out.println("Fim do quiz! Sua pontuação foi de: " + pontuaacao);
                System.out.println("Deseja jogar novamente? (S/N");
                scanner.nextLine();

            }
            deseja = scanner.nextLine();

        } while (deseja.equalsIgnoreCase("S"));
        System.out.println("De boas, até  a próxima!");
    }}
