package amintabite.entities;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Collezione {
    public static void main(String[] args) {

        Videogiochi vgame1 = new Videogiochi("Gears of War3", 2013, 45.90,
                Piattaforma.XBOX, 70, Genere.SHOOTER);
        Videogiochi vgame2 = new Videogiochi("TEKKEN8", 2024, 69.90,
                Piattaforma.PC, 10, Genere.PICCHIADURO);
        Videogiochi vgame3 = new Videogiochi("Demon soul", 2023, 65.90,
                Piattaforma.PS5, 100, Genere.ACTION);
        Videogiochi vgame4 = new Videogiochi("Doom Eternal", 2020, 40.90,
                Piattaforma.XBOX, 50, Genere.SHOOTER);
        Videogiochi vgame5 = new Videogiochi("Cyberpunk 2077", 2020, 60.90,
                Piattaforma.PC, 84, Genere.SHOOTER);

        Videogiochi vgame6 = new Videogiochi("Crysis 3", 2011, 10.90,
                Piattaforma.PC, 80, Genere.SHOOTER);

        GdaTavolo gdaTavolo1 = new GdaTavolo("giocodellOca",
                1990, 15, 9, 30);

        GdaTavolo gdaTavolo2 = new GdaTavolo("UNO",
                1995, 10, 10, 50);

        GdaTavolo gdaTavolo3 = new GdaTavolo("Forza 4",
                2000, 20, 2, 20);

        GdaTavolo gdaTavolo4 = new GdaTavolo("Indovina Chi",
                1999, 30, 5, 65);

        GdaTavolo gdaTavolo5 = new GdaTavolo("Cluedo",
                1997, 25, 7, 55);


        Set<Giochi> Catalogo = new HashSet<>();

        Catalogo.add(vgame1);
        Catalogo.add(vgame2);
        Catalogo.add(vgame3);
        Catalogo.add(vgame4);
        Catalogo.add(vgame5);
        Catalogo.add(vgame6);
        Catalogo.add(gdaTavolo1);
        Catalogo.add(gdaTavolo2);
        Catalogo.add(gdaTavolo3);
        Catalogo.add(gdaTavolo4);
        Catalogo.add(gdaTavolo5);


        Scanner scanner = new Scanner(System.in);


        System.out.println("inserisci l' operazione da svolgere sul catalogo 1-7 , 8 per uscire ");
        int scelta = scanner.nextInt();


        switch (scelta) {

            case 1 -> {


                break;
            }

            case 2 -> {


                break;
            }


            case 3 -> {


                break;
            }


            case 4 -> {


                break;
            }

            case 5 -> {


                break;
            }


            case 6 -> {


                break;
            }


            case 7 -> {


                break;
            }


            case 8 -> {

                return;

            }

        }


    }
}
