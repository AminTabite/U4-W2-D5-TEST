package amintabite.entities;

public class GdaTavolo extends Giochi {

    //attributi

    private int ngiocatori;
    private int durataMgame;


    // costruttore
    GdaTavolo(String titolo, int publishedin, double price, int ngiocatori, int durataMgame) {
        super(titolo, publishedin, price);

        this.ngiocatori = ngiocatori;
        this.durataMgame = durataMgame;

    }

    //metodi


    public int getNgiocatori() {
        return ngiocatori;
    }

    public int getDurataMgame() {
        return durataMgame;
    }

    @Override
    public String toString() {
        return "GdaTavolo{" +
                "ngiocatori=" + ngiocatori +
                ", durataMgame=" + durataMgame +
                ", idGioco=" + idGioco +
                ", titolo='" + titolo + '\'' +
                ", publishedin=" + publishedin +
                ", price=" + price +
                ", randomId=" + randomId +
                '}';
    }
}
