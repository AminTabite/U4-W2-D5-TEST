package amintabite.entities;


import java.util.Random;
import java.util.function.Supplier;

public class Giochi {
    //attributi

    protected String titolo;
    protected int publishedin;
    protected double price;
    protected Long idGioco;
    Supplier<Long> randomId = () -> {

        Random rndm = new Random();
        return rndm.nextLong();


    };


    //metodi


    //costruttori
    Giochi(String titolo, int publishedin, double price) {


        this.idGioco = randomId.get();
        this.titolo = titolo;
        this.publishedin = publishedin;
        this.price = price;

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Long getIdGioco() {
        return idGioco;
    }

    public void setIdGioco(Long idGioco) {
        this.idGioco = idGioco;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getPublishedin() {
        return publishedin;
    }

    public void setPublishedin(int publishedin) {
        this.publishedin = publishedin;
    }

    @Override
    public String toString() {
        return "Giochi{" +
                "idGioco=" + idGioco +
                ", titolo='" + titolo + '\'' +
                ", publishedin=" + publishedin +
                ", price=" + price +
                ", randomId=" + randomId +
                '}';
    }

    public void setRandomId(Supplier<Long> randomId) {
        this.randomId = randomId;
    }

    public void setGenere(Piattaforma genere) {

    }

    public void setNgiocatori(int sceltagiocatorigdt2) {

    }


    public void setDurataMgame(int mediaminutigdt2) {
    }

    public void setGenere(Genere nuovoGenere) {
    }
}
