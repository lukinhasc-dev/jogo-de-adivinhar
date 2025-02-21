import java.util.Scanner;
import java.util.Random;

public class JogoAD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean jogarNovamente = true;
        boolean iniciarJogo = true;

        System.out.println("Jogo da Adivinhação!");
        System.out.print("Insira seu nome: ");
        String nomeJogador = scanner.nextLine();
        System.out.println("Seja bem-vindo ao Jogo da Adivinhação, " + nomeJogador + "!");
        System.out.println("Escolha um número de 0 a 100!");
        System.out.println();

        while (jogarNovamente) {
            int numeroGerado = random.nextInt(100) + 1;
            int numeroTentativas = 0;

            while (iniciarJogo) {
                System.out.print("Digite seu Número: ");
                int numeroPalpite = scanner.nextInt();
                scanner.nextLine();
                numeroTentativas++;

                if (numeroPalpite == numeroGerado) {
                    System.out.println("Você acertou!");
                    System.out.println("Número de Tentativas: " + numeroTentativas);
                    System.out.print("Deseja continuar? (S/N): ");
                    String continuarJogo = scanner.next().trim();
                    iniciarJogo = false;

                    if (continuarJogo.equalsIgnoreCase("N")) {
                        System.out.println("Obrigado por jogar, " + nomeJogador);
                        jogarNovamente = false;
                        
                    } else if (continuarJogo.equalsIgnoreCase("S")) {
                        System.out.println("Iniciando nova rodada...");
                        iniciarJogo = true;
                        numeroGerado = random.nextInt(100) + 1;
                        numeroTentativas = 0;
                    } else {
                        System.out.println("Escolha uma opção válida!");
                    }

                } else if (numeroPalpite > 100 || numeroPalpite < 0) {
                    System.out.println("Escolha um número de 1 a 100!");

                } else if (numeroPalpite > numeroGerado) {
                    System.out.println("Número menor que " + numeroPalpite);

                } else if (numeroPalpite < numeroGerado) {
                    System.out.println("Número maior que " + numeroPalpite);
                }
            }
        }

    }
}
