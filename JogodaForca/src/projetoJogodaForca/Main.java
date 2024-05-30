package projetoJogodaForca;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Jogador jogador = new Jogador();
        Palavra palavra = new Palavra(); 
        
        while (!jogador.venceu() && jogador.getTentativasRestantes() > 0) {
            System.out.println("Palavra: " + palavra.getPalavraComMascara(jogador.getLetrasAdivinhadas()));
            System.out.println("Tentativas restantes: " + jogador.getTentativasRestantes());
            System.out.print("Digite uma letra: ");
            String input = scanner.nextLine();
            if (input.length() != 1) {
                System.out.println("Por favor, digite apenas uma letra.");
                continue;
            }
            char letra = input.charAt(0);
            if (!palavra.verificarLetra(letra)) {
                jogador.perderTentativa();
            }
            jogador.adivinharLetra(letra);
            if (palavra.foiAdivinhada(jogador.getLetrasAdivinhadas())) {
                jogador.ganhar();
            }
        }

        if (jogador.venceu()) {
            System.out.println("Parabéns, você ganhou! A palavra era: " + palavra.getPalavra());
        } else {
            System.out.println("Você perdeu! A palavra era: " + palavra.getPalavra());
        }

        scanner.close();
    }
}
