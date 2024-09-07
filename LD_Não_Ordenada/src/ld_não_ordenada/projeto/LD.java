package ld_não_ordenada.projeto;
import java.util.Scanner;

public class LD {
    public static int Op;
    private static String PuxarNúmeros = null;
    private static String Aux = null;
    private static Scanner Input = new Scanner(System.in);
    private static String Número;
   
    public static void Funcionalidades() throws InterruptedException{
        Op = Input.nextInt();
        Input.nextLine();
        if(Op>7 || Op<0){
            System.out.println("Opção inválida.");
        } else if(Op == 1){
            System.out.println("\nDigite o número a ser adicionado ao início da lista: ");
            Número = Input.nextLine();
            if(PuxarNúmeros == null){
            	PuxarNúmeros = Número;
            } else{
            	PuxarNúmeros = Número+"\n"+PuxarNúmeros;
        }   System.out.println("\nNúmero adicionado ao início da lista.");
            Thread.sleep(2000);
        } else if(Op == 3){
            ListaInício();
        } else if(Op == 2) {
        	System.out.println("\nDigite o número a ser adicionado ao fim da lista: ");
        	Número = Input.nextLine();
        	if(PuxarNúmeros == null) {
        		PuxarNúmeros = Número;
        	} else {
        		PuxarNúmeros = PuxarNúmeros+"\n"+Número; 
        	} System.out.println("\nNúmero adicionado ao fim da lista.");
              Thread.sleep(2000);
        } else if(Op == 4) {
        	ListaFim();
        } else if (Op == 5) {
        	System.out.println("\nDigite o número a ser removido da lista: ");
        	Aux = Input.nextLine();
        	String[] Split2 = PuxarNúmeros.split("\n");
        	StringBuilder NovaLista = new StringBuilder();
			boolean NúmeroRemovido = false;
        	for (String Ordem : Split2) {
        		if(!Ordem.equals(Aux)) {
        			NovaLista.append(Ordem).append("\n");
        		} else{
					NúmeroRemovido = true;
				}
        	}
        	PuxarNúmeros = NovaLista.length() >0 ? NovaLista.toString().trim() : null;
			if(NúmeroRemovido){
				System.out.println("\nNúmero "+Aux+" removido da lista.");
			} else{
				System.out.println("\nO número solicitado para remoção não existe na lista.");
			}
        	Thread.sleep(2000);
        } else if(Op == 6) {
        	PuxarNúmeros = null;
        	System.out.println("\nLista esvaziada.");
        	Thread.sleep(2000);
        }
    }
    
   public static void ListaInício()throws InterruptedException {
	   long start = System.currentTimeMillis();
	   if(PuxarNúmeros == null) {
		   System.out.println("\nA lista está vazia");
		   Thread.sleep(2000);
	   } else {
	       System.out.println("\n+------------------------------------------+");
	       System.out.println("|                 LISTA                    |");
	       System.out.println("+------------------------------------------+");
	       System.out.println(PuxarNúmeros);
	       System.out.println("+------------------------------------------+\n");
	       Thread.sleep(2000);
	   }   
   }
   
   public static void ListaFim()throws InterruptedException {
       long start = System.currentTimeMillis();
       if(PuxarNúmeros == null) {
		   System.out.println("\nA lista está vazia");
		   Thread.sleep(2000);
	   } else {
		   String[] Split = PuxarNúmeros.split("\n");
	       System.out.println("\n+--------------------------------------------+");
	       System.out.println("|              LISTA INVERTIDA               |");
	       System.out.println("+--------------------------------------------+");
	       for(int i = Split.length - 1; i >=0; i--) {
	    	   System.out.println(Split[i]);
	       }
	       System.out.println("+--------------------------------------------+\n");
	       Thread.sleep(2000);   
	   }
   }
    
    public static void Menu(){
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
