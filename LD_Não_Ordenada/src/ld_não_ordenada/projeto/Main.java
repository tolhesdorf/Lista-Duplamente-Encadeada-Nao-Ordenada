package ld_não_ordenada.projeto;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        while(true) {
            Funcionalidades.Menu();
            Funcionalidades.Opçoes();
            if (Funcionalidades.Op == 7) {
                System.out.println("\nEncerrando...");
                break;
            }
        }
    }
}