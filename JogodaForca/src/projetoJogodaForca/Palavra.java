package projetoJogodaForca;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Palavra {
    private String palavra;
    private static final List<String> PALAVRAS = Arrays.asList(
        "exemplo", "java", "programação", "desenvolvedor", "computador", "software"
    );

    public Palavra() {
        Random random = new Random();
        this.palavra = PALAVRAS.get(random.nextInt(PALAVRAS.size()));
    }

    public boolean verificarLetra(char letra) {
        return palavra.indexOf(letra) != -1;
    }

    public boolean foiAdivinhada(Set<Character> letrasAdivinhadas) {
        for (char letra : palavra.toCharArray()) {
            if (!letrasAdivinhadas.contains(letra)) {
                return false;
            }
        }
        return true;
    }

    public String getPalavra() {
        return palavra;
    }

    public String getPalavraComMascara(Set<Character> letrasAdivinhadas) {
        StringBuilder palavraComMascara = new StringBuilder();
        for (char letra : palavra.toCharArray()) {
            if (letrasAdivinhadas.contains(letra)) {
                palavraComMascara.append(letra);
            } else {
                palavraComMascara.append('_');
            }
        }
        return palavraComMascara.toString();
    }
}
