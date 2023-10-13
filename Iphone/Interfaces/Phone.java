package UML.Iphone.Interfaces;

import java.util.Scanner;

public interface Phone {

    default void telefone(){
        int numOpcao = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha uma opção");
        System.out.println("1 - Agenda, 2 - Ligar, 3 - Atender, 4 - iniciarCorrerioVoz, 5 - Sair");
        numOpcao = input.nextInt();
        switch(numOpcao){
            case 1:
                System.out.println("Acessando agenda...");
                agenda();
                break;
            case 2:
                System.out.println("Acessando discador...");
                ligar();
                break;
            case 3:
                atender();
                break;
            case 4:
                iniciarCorrerioVoz();
                break;
            case 5:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção invalida");
                System.out.println("Escolha uma opção valida");
                telefone();
        }

    }

    private void ligar(){
        int numero = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero de telefone...");
        numero = input.nextInt();
        System.out.println("Ligando....");
    }

    private void agenda(){
        int opcao = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ligar para: 1 - Maria, 2 - Jose, 3 - Alberto");
        opcao = input.nextInt();
        switch(opcao){
            case 1:
                System.out.println("Ligando para Maria...");
                break;
            case 2:
                System.out.println("Ligando para Jose...");
                break;
            case 3:
                System.out.println("Ligando para Alberto...");
                break;
            default:
                System.out.println("Opção invalida");
                agenda();
        }

    }

    private void atender(){
        System.out.println("Atendendo ligação...");
    }

    private void iniciarCorrerioVoz(){
        System.out.println("Você tem uma nova mensagem");
        System.out.println("Fulano, deixe a chave na mesa...");
    }

}
