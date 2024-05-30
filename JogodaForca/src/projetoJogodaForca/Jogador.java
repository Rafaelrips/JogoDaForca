package projetoJogodaForca;


import java.util.HashSet;
import java.util.Set;

public class Jogador {
    private int tentativasRestantes;
    private boolean venceu;
    private Set<Character> letrasAdivinhadas;

    public Jogador() {
        this.tentativasRestantes = 10; // Number of attempts can be adjusted.
        this.venceu = false;
        this.letrasAdivinhadas = new HashSet<>();
    }

    public void perderTentativa() {
        tentativasRestantes--;
    }

    public void adivinharLetra(char letra) {
        letrasAdivinhadas.add(letra);
    }

    public boolean venceu() {
        return venceu;
    }

    public void ganhar() {
        venceu = true;
    }

    public int getTentativasRestantes() {
        return tentativasRestantes;
    }

    public Set<Character> getLetrasAdivinhadas() {
        return letrasAdivinhadas;
    }
}
