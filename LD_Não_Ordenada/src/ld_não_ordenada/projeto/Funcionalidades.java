package ld_não_ordenada.projeto;

import java.util.Scanner;

public class Funcionalidades {
    private int Número;
    private static Scanner Input = new Scanner(System.in);
    private static Lista lista = new Lista();
    public static int Op;

    public static void Opçoes() throws InterruptedException {
        Op = Input.nextInt();
        if(Op > 7 || Op < 0) {
            System.out.println("Opção inválida.");
        } else if(Op == 1) {
            System.out.println("\nDigite o número a ser adicionado ao início da lista: ");
            int Número = Input.nextInt();
            lista.InserirInício(Número);
            System.out.println("\nNúmero adicionado ao início da lista.");
            Thread.sleep(2000);
        } else if(Op == 2) {
            System.out.println("\nDigite o número a ser adicionado ao fim da lista: ");
            int Número = Input.nextInt();
            lista.InserirFim(Número);
            System.out.println("\nNúmero adicionado ao fim da lista.");
            Thread.sleep(2000);
        } else if(Op == 3) {
            lista.InícioAoFim();
        } else if(Op == 4) {
            lista.FimAoInício();
        } else if(Op == 5) {
            System.out.println("\nDigite o número a ser removido da lista: ");
            int Número = Input.nextInt();
            boolean removido = lista.RemoverLista(Número);
            if(removido) {
                System.out.println("\nNúmero " + Número + " removido da lista.");
            } else {
                System.out.println("\nO número solicitado para remoção não existe na lista.");
            }
            Thread.sleep(2000);
        } else if(Op == 6) {
            lista.EsvaziarLista();
            System.out.println("\nLista esvaziada.");
            Thread.sleep(2000);
        }
    }
        public static void Menu() {
            System.out.println("\n+------------------------------------------+");
            System.out.println("|                 MENU                     |");
            System.out.println("+------------------------------------------+");
            System.out.println("| 1. Inserir no início da lista            |");
            System.out.println("| 2. Inserir no fim da lista               |");
            System.out.println("| 3. Consultar a lista do início ao fim    |");
            System.out.println("| 4. Consultar a lista do fim ao início    |");
            System.out.println("| 5. Remover da lista                      |");
            System.out.println("| 6. Esvaziar a lista                      |");
            System.out.println("| 7. Sair                                  |");
            System.out.println("+------------------------------------------+");
            System.out.println("\nDigite a opção desejada: ");
        }
}


