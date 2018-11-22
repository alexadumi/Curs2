import java.util.Scanner;

public class Swich {
    public static void main(String[] args) {
        int state = 0;
        if( state == 0) {
        System.out.println("descarcat");
    }else if(state ==1) {
        System.out.println("incarcat partial");
    } else if(state==2) {
            System.out.println("incarcata complet");
    } else  {
        System.out.println("eroare");

    }
        switch(state) {
        case 0:
        System.out.println("descarcata");
        break;
        case 1:
        System.out.println("incarcare completa");
        break;
        case 2 :
        default:
        System.out.println("eroare");
    }
        int ora;
        System.out.println("Introdu ora:");
        Scanner reader = new Scanner(System.in);
        ora = reader.nextInt();
        String mesaj;
        if(ora<12) {
            mesaj = "Neata";
        } else {
            mesaj = "Salut";
                    mesaj = (ora <12) ? "Neata!" : "Salut!";
            System.out.println(mesaj);
        }
        }

}


