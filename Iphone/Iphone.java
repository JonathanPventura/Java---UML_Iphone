package UML.Iphone;

import UML.Iphone.Interfaces.Ipod;
import UML.Iphone.Interfaces.Phone;
import UML.Iphone.Interfaces.WebBrowser;

import java.util.Scanner;

public class Iphone implements Ipod, Phone, WebBrowser {

    public void unLock(){
        int code = 0;
        int opcao = 0;
        Iphone iphone = new Iphone();
        Scanner input = new Scanner(System.in);
        System.out.println("Digite 1 para desbloquear: ");
        code = input.nextInt();

        if ( code == 1){
            System.out.println("Desbloqueado");
            System.out.println("Abrindo menu");
            System.out.println("1 - Ipod, 2 - Phone, 3 - Safari");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Acessando Ipod");
                    iphone.album();
                    unLock();
                    break;
                case 2:
                    System.out.println("Acessando Phone");
                    iphone.telefone();
                    unLock();
                    break;
                case 3:
                    System.out.println("Acessando Safari");
                    iphone.safari();
                    unLock();
                    break;
                default:
                    System.out.println("Opção invalida");
                    unLock();
            }

        }else{
            System.out.println("Senha errada");
        }

    }


    public static void main(String[] args) {

        Iphone iphone = new Iphone();
        System.out.println("Iniciando Iphone");
        iphone.unLock();

    }
}
