package UML.Iphone.Interfaces;


import java.util.Scanner;

public interface Ipod {


    default void album(){
        int opcao = 0;
        System.out.println("Opeções: ");
        System.out.println("1 - Tocar musica recente");
        System.out.println("2 - Lista de musica ");
        System.out.println("3 - Sair ");
        Scanner input = new Scanner(System.in);
        opcao = input.nextInt();
        switch (opcao) {
            case 1:
                opcao = 0;
                tocar();
                break;
            case 2:
                opcao = 0;
                selecionarMusica();
                break;
            case 3:
                opcao = 0;
                System.out.println("Saindo....");
                break;
            default:
                System.out.println("Opcão errada");
                System.out.println("Escolha uma opção valida");
                album();
                break;
        }
    }

    private void tocar(){
        int code = 1;
        int opcao = 0;

        while (code != 0){
            code = 0;
            Scanner input = new Scanner(System.in);
            System.out.println("Tocando musica...");
            System.out.println("Continuar tocando musica ? 1 - Sim e 0 - Não");
            code = input.nextInt();

        }
        if (code == 0){
            Scanner input = new Scanner(System.in);
            System.out.println("0 = Parar musica e 2 - Mudar musica");
            opcao = input.nextInt();
            if ( opcao == 0){
                code = 1;
                pausar();

            }else{
                code = 1;
                selecionarMusica();
            }
        }
    }
    private void pausar(){
        int opcao = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Musica pausada");
        System.out.println("Deseja sair ? 0 - Sim e 2 - Não");
        opcao = input.nextInt();
        if ( opcao == 2){
            tocar();
        }else{
            System.out.println("Finalizado...");
        }

    }
    private void selecionarMusica(){
        int code = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha uma musica");
        System.out.println("1 - Musica 1");
        System.out.println("2 - Musica 2");
        System.out.println("3 - Musica 3");
        code = input.nextInt();
        switch (code) {
            case 1:
                System.out.println("Mudando para musica 1...");
                tocar();
                break;
            case 2:
                System.out.println("Mudando para musica 2...");
                tocar();
                break;
            case 3:
                System.out.println("Mudando para musica 3...");
                tocar();
                break;
            default:
                System.out.println("Opcão errada");
        }
    }

}
