package amintabite.entities;


import java.util.Random;
import java.util.function.Supplier;

public class Giochi {
    //attributi

    protected Long idGioco;
    protected String titolo;
    protected int publishedin;
    protected double price;
    Supplier<Long> randomId = () -> {

        Random rndm = new Random();
        return rndm.nextLong();


    };

    //metodi


    //costruttori
    Giochi(Long idGioco, String titolo, int publishedin, double price) {


        this.idGioco = randomId.get();
        this.titolo = titolo;
        this.publishedin = publishedin;
        this.price = price;

    }

    public double getPrice() {
        return price;
    }

    public Long getIdGioco() {
        return idGioco;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getPublishedin() {
        return publishedin;
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
}
