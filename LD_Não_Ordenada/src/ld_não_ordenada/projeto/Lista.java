package ld_não_ordenada.projeto;

public class Lista {
    private Nó Início;
    private Nó Final;

    public Lista() {
        this.Início = null;
        this.Final = null;
    }

    public void InserirInício(int Dado) {
        Nó NovoNó = new Nó(Dado);
        if (Início == null) {
            Início = Final = NovoNó;
        } else {
            NovoNó.Próximo = Início;
            Início.Anterior = NovoNó;
            Início = NovoNó;
        }
    }

    public void InserirFim(int Dado) {
        Nó NovoNó = new Nó(Dado);
        if (Final == null) {
            Início = Final = NovoNó;
        } else {
            NovoNó.Anterior = Final;
            Final.Próximo = NovoNó;
            Final = NovoNó;
        }
    }

    public void InícioAoFim() throws InterruptedException {
        Nó Atual = Início;
        System.out.println("\n+------------------------------------------+");
        System.out.println("|                 LISTA                    |");
        System.out.println("+------------------------------------------+");
        while (Atual != null) {
            System.out.println(Atual.Dado);
            Atual = Atual.Próximo;
        }
        System.out.println("+------------------------------------------+\n");
        Thread.sleep(2000);
    }

    public void FimAoInício() throws InterruptedException {
        Nó Atual = Final;
        System.out.println("\n+--------------------------------------------+");
        System.out.println("|              LISTA INVERTIDA               |");
        System.out.println("+--------------------------------------------+");
        while (Atual != null) {
            System.out.println(Atual.Dado);
            Atual = Atual.Anterior;
        }
        System.out.println("+--------------------------------------------+\n");
        Thread.sleep(2000);
    }

    public boolean RemoverLista(int Dado) {
        Nó Atual = Início;
        while (Atual != null) {
            if (Atual.Dado == Dado) {
                if (Atual == Início) {
                    Início = Atual.Próximo;
                    if (Início != null) {
                        Início.Anterior = null;
                    }
                } else if (Atual == Final) {
                    Final = Atual.Anterior;
                    if (Final != null) {
                        Final.Próximo = null;
                    }
                } else {
                    Atual.Anterior.Próximo = Atual.Próximo;
                    Atual.Próximo.Anterior = Atual.Anterior;
                }
                return true;
            }
            Atual = Atual.Próximo;
        }
        return false;
    }

    public void EsvaziarLista() {
        Início = Final = null;
    }
}


