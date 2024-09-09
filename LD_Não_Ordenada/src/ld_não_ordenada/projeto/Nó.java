package ld_não_ordenada.projeto;

public class Nó {
    int Dado;
    Nó Anterior;
    Nó Próximo;

    public Nó(int Dado) {
        this.Dado = Dado;
        this.Anterior = null;
        this.Próximo = null;
    }
}

