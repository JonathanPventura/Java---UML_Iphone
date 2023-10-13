package UML.Iphone.Interfaces;

import java.util.Scanner;

public interface WebBrowser {

    default void safari(){
        int opcao = 0;
        String url = " ";
        Scanner input = new Scanner(System.in);
        System.out.println("Iniciando navegador...");
        System.out.println("Escolha uma opção");
        System.out.println("1 - Digitar endereço, 2 - Favoritos, 3 - Adicionar nova aba, 4 - Atualizar Pagina , 5 - Sair");
        opcao = input.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Digitar endereço");
                url = input.next();
                System.out.println("Acessando " + url);
                break;
            case 2:
                System.out.println("Acessando favoritos");
                favoritos();
                break;
            case 3:
                adicionarNovaAba();
                break;
            case 4:
                atualizarPagina();
                break;
            case 5:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção invalida");
                safari();
        }
    }

    private void atualizarPagina(){
        System.out.println("Adicionando aba");
    }

    private void adicionarNovaAba(){
        System.out.println("Pagina atualizada");
    }

    private void favoritos(){
        int opcao = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha uma opção");
        System.out.println("1 - Youtube, 2 - Facebook, 3 - Twitter, 4 - Google, 5 - Instagram");
        opcao = input.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Acessando Youtube");
                break;
            case 2:
                System.out.println("Acessando Facebook");
                break;
            case 3:
                System.out.println("Acessando Twitter");
                break;
            case 4:
                System.out.println("Acessando Google");
                break;
            case 5:
                System.out.println("Acessando Instagram");
                break;
            default:
                System.out.println("Opção invalida");
                favoritos();
        }
    }
}
