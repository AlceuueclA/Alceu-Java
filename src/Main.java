import java.util.Scanner;

public class Main{

    public  static void main (String[] args) {

        String[] questoesquiz = {"Quanto é 10 + 10?", "Quanto é 5x5?", "Quanto é 9x8?"};

        String[][] respostas = {{"1. 20", "2. 15", "3. 25"}, {"1. 15", "2. 25", "3. 45"},
                {"1. 72", "2. 81", "3. 64"}};

        Scanner scanner = new Scanner(System.in);
        String desejar;
        do {
            int pontuacao = 0;
            System.out.println("Sejam bem-Vindo ao quiz!");
            int respostascertas[] = {1, 2, 1};


            for (int i = 0; i < questoesquiz.length; i++) {
                System.out.println(questoesquiz[i]);

                for (String opcao : respostas[i]) {
                    System.out.println(opcao);

                }
                ;
                System.out.println("De sua resposta:");
                int responder = scanner.nextInt();
                if (responder == respostascertas[i]) {
                    System.out.println("Certa resposta!");
                    pontuacao++;

                } else {
                    System.out.println("Resposta errada!, a resposta era: " + respostascertas[i]);
                }



            }
            System.out.println("Quiz finalizado!, sua pontuação foi de: " + pontuacao + "," + "de: " + questoesquiz.length);
            scanner.nextLine();
            System.out.println("Deseja jogar novamente? S/N");
            desejar = scanner.nextLine();



        }while(desejar.equalsIgnoreCase("S"));
        System.out.println("Até a próxima!");


    }

}