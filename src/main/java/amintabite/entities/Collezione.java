package amintabite.entities;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;


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

        System.out.println("collaudo lista" + Catalogo.toString());

        System.out.println("inserisci l' operazione da svolgere sul catalogo 1-7 , 8 per uscire ");
        int scelta = scanner.nextInt();


        switch (scelta) {

            case 1 -> {
                System.out.println("inserire gioco 1= vgame 2 = gioco da tavolo");

                int inseriscigioco = scanner.nextInt();

                switch (inseriscigioco) {
                    case 1 -> {

                        System.out.println("inserisci titolo");
                        String titolo = scanner.nextLine();
                        scanner.nextLine();

                        System.out.println("anno pubblicazione");
                        int anno = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("inserisci prezzo");
                        double price = scanner.nextDouble();
                        scanner.nextLine();

                        System.out.println(" inserisci piattaforma 1 = PC 2= XBOX 3 = PS5");
                        int sceltaplant = scanner.nextInt();
                        scanner.nextLine();

                        Piattaforma piattaforma = Piattaforma.PC;
                        switch (sceltaplant) {
                            case 1 -> piattaforma = Piattaforma.PC;
                            case 2 -> piattaforma = Piattaforma.XBOX;
                            case 3 -> piattaforma = Piattaforma.PS5;
                            default -> {
                                System.out.println("Errore");
                                break;
                            }


                        }

                        System.out.println("inserisci ore");
                        int oresc = scanner.nextInt();

                        scanner.nextLine();

                        System.out.println("inserisci genere 1= action 2= horror 3= fantasy 4= picchiaduro 5 shooter ");
                        int sgenere = scanner.nextInt();

                        Genere genere = Genere.ACTION;

                        switch (sgenere) {

                            case 1 -> genere = Genere.ACTION;
                            case 2 -> genere = Genere.HORROR;
                            case 3 -> genere = Genere.FANTASY;
                            case 4 -> genere = Genere.PICCHIADURO;
                            case 5 -> genere = Genere.SHOOTER;
                            default -> {
                                System.out.println("Errore");
                                break;
                            }

                        }
                        System.out.println("aggiunta gioco...");
                        Videogiochi giocoaggiunto = new Videogiochi(titolo, anno, price, piattaforma, oresc, genere);

                        System.out.println("il gioco aggiunto e'" + giocoaggiunto.toString());

                        if (Catalogo.stream().anyMatch(Vg -> Vg.getIdGioco().equals(giocoaggiunto.getIdGioco()))) {
                            System.out.println("impossibile aggiungere gioco con stesso id");
                        } else {
                            System.out.println("gioco aggiunto!! :) ");
                            Catalogo.add(giocoaggiunto);
                        }
                    }

                    case 2 -> {


                        System.out.println("inserisci titolo");
                        String titolo = scanner.nextLine();
                        scanner.nextLine();

                        System.out.println("anno pubblicazione");
                        int anno = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("inserisci prezzo");
                        double price = scanner.nextDouble();
                        scanner.nextLine();


                        System.out.println("inserire numero giocatori min 2- max 10");
                        int sceltagiocatori = scanner.nextInt();

                        if (sceltagiocatori < 2 | sceltagiocatori > 10) {
                            System.out.println("Errore, impossibile giocare");
                        } else sceltagiocatori = scanner.nextInt();


                        System.out.println("inserire durata media in minuti");
                        int mediaminuti = scanner.nextInt();

                        if (mediaminuti < 5 | mediaminuti > 90) {
                            System.out.println("durata non disponibile");
                        } else mediaminuti = scanner.nextInt();

                        System.out.println("aggiunta gioco...");

                        GdaTavolo neogiocodatavolo = new GdaTavolo(titolo, anno, price, sceltagiocatori, mediaminuti);

                        System.out.println("il gioco aggiunto e'" + neogiocodatavolo.toString());

                        neogiocodatavolo.toString();

                        if (Catalogo.stream().anyMatch(gdt -> gdt.getIdGioco().equals(neogiocodatavolo.idGioco))) {
                            System.out.println("impossibile aggiungere, id uguale");
                        } else {
                            System.out.println("gioco aggiunto correttamente");

                            Catalogo.add(neogiocodatavolo);
                        }


                    }


                }


                break;
            }

            case 2 -> {

                System.out.println("Inserisci id del gioco che vuoi visualizzare");

                Long idsearch = scanner.nextLong();
                scanner.nextLine();

                Catalogo.stream()
                        .filter(g -> g.getIdGioco().equals(idsearch))
                        .forEach(g -> System.out.println("Gioco trovato: " + g.toString()));


            }

            case 3 -> {

                System.out.println("Inserisci budget:");
                double prezzocompare = scanner.nextDouble();
                scanner.nextLine();

                if (prezzocompare < 10) {
                    System.out.println("Non hai abbastanza soldi");
                } else {
                    List<Giochi> giochilowerprice = Catalogo.stream()
                            .filter(g -> g.getPrice() < prezzocompare)
                            .toList();

                    if (giochilowerprice.isEmpty()) {
                        System.out.println("Nessun gioco sotto questo prezzo");
                    } else {
                        giochilowerprice.forEach(g -> System.out.println(g.toString()));
                    }
                }
            }

            case 4 -> {

                System.out.println("cerca per numero di giocatori");

                int ngiocatori = scanner.nextInt();

                if (ngiocatori < 2 && ngiocatori > 10) {
                    System.out.println("troppi giocatori, errore");

                }

                Catalogo.stream().filter(giochi -> giochi instanceof GdaTavolo).filter
                        (giochi -> ((GdaTavolo) giochi).getNgiocatori() == ngiocatori).forEach(
                        giochi -> System.out.println("giochi disponibili :" + giochi.toString()));


            }

            case 5 -> {

                System.out.println("Inserire id del gioco da eliminare");

                Long deleteid = scanner.nextLong();

                Catalogo.removeIf(gioco -> gioco.getIdGioco().equals(deleteid));

                System.out.println("gioco rimosso correttamente");


                System.out.println("lista aggiornata" + Catalogo.toString());


            }

            case 6 -> {
                System.out.println("Inserisci id dell' elemento da aggiornare ");

                long updategame = scanner.nextLong();


                Set<Giochi> foundGames = Catalogo.stream()
                        .filter(giochi -> giochi.idGioco.equals(updategame))
                        .collect(Collectors.toSet());

                for (Giochi gioco : foundGames) {
                    if (gioco instanceof Videogiochi) {

                        scanner.nextLine();

                        System.out.println("Inserisci titolo da modificare:");
                        String titolo2 = scanner.nextLine();

                        gioco.setTitolo(titolo2);


                        scanner.nextLine();
                        System.out.println("anno pubblicazione");
                        int anno2 = scanner.nextInt();
                        gioco.setPublishedin(anno2);

                        scanner.nextLine();
                        System.out.println("inserisci prezzo");
                        double price2 = scanner.nextDouble();
                        gioco.setPrice(price2);


                        System.out.println("Inserisci piattaforma del gioco: 1=PC 2=XBOX 3=PS5");
                        int sceltapiattaforma2 = scanner.nextInt();
                        scanner.nextLine();

                        Piattaforma nuovaPiattaforma = Piattaforma.PC;

                        switch (sceltapiattaforma2) {
                            case 1 -> nuovaPiattaforma = Piattaforma.PC;
                            case 2 -> nuovaPiattaforma = Piattaforma.XBOX;
                            case 3 -> nuovaPiattaforma = Piattaforma.PS5;
                            default -> {
                                System.out.println("Errore");
                                break;
                            }

                        }

                        ((Videogiochi) gioco).setGenere(nuovaPiattaforma);


                        scanner.nextLine();
                        System.out.println("inserisci ore");
                        int ore2 = scanner.nextInt();
                        ((Videogiochi) gioco).setOre(ore2);

                        System.out.println("inserisci genere 1= action" +
                                " 2= horror 3= fantasy 4= picchiaduro 5 shooter ");

                        int sceltagenere = scanner.nextInt();
                        scanner.nextLine();

                        Genere nuovoGenere = Genere.ACTION;

                        switch (sceltagenere) {
                            case 1 -> nuovoGenere = Genere.ACTION;
                            case 2 -> nuovoGenere = Genere.HORROR;
                            case 3 -> nuovoGenere = Genere.FANTASY;
                            case 4 -> nuovoGenere = Genere.PICCHIADURO;
                            case 5 -> nuovoGenere = Genere.SHOOTER;
                            default -> {
                                System.out.println("Errore");
                                nuovoGenere = Genere.ACTION;
                            }
                        }

                        ((Videogiochi) gioco).setGenere(nuovoGenere);


                        System.out.println("gioco modificato con successo!");
                        gioco.toString();


                    } else {
                        scanner.nextLine();
                        System.out.println("inserisci titolo");
                        String titologdt2 = scanner.nextLine();
                        gioco.setTitolo(titologdt2);

                        scanner.nextLine();
                        System.out.println("anno pubblicazione");
                        int annogdt2 = scanner.nextInt();
                        gioco.setPublishedin(annogdt2);


                        scanner.nextLine();
                        System.out.println("inserisci prezzo");
                        double pricegdt2 = scanner.nextDouble();
                        gioco.setPrice(pricegdt2);

                        scanner.nextLine();
                        System.out.println("inserire numero giocatori min 2- max 10");
                        int sceltagiocatorigdt2 = scanner.nextInt();


                        if (sceltagiocatorigdt2 < 2 | sceltagiocatorigdt2 > 10) {
                            System.out.println("Errore, impossibile giocare");
                        } else {
                            gioco.setNgiocatori(sceltagiocatorigdt2);
                        }

                        scanner.nextLine();
                        System.out.println("inserire durata media in minuti");
                        int mediaminutigdt2 = scanner.nextInt();


                        if (mediaminutigdt2 < 5 | mediaminutigdt2 > 90) {
                            System.out.println("durata non disponibile");
                        } else gioco.setDurataMgame(mediaminutigdt2);

                        System.out.println("aggiunta gioco...");


                        System.out.println("gioco da tavolo modificato con successo");
                        gioco.toString();


                    }
                }


            }


        }
    }
}
