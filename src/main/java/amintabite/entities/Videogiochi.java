package amintabite.entities;

public class Videogiochi extends Giochi {

    //attributi
    private Piattaforma piattaforma;
    private int ore;
    private Genere genere;
    // metodi

    //costruttore
    Videogiochi(String titolo, int publishedin, double price, Piattaforma piattaforma, int ore, Genere genere) {
        super(titolo, publishedin, price);

        this.piattaforma = piattaforma;
        this.ore = ore;
        this.genere = genere;


    }

    public Piattaforma getPiattaforma() {
        return piattaforma;
    }

    public void setPiattaforma(Piattaforma piattaforma) {
        this.piattaforma = piattaforma;
    }

    public int getOre() {
        return ore;
    }

    public void setOre(int ore) {
        this.ore = ore;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Piattaforma genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "Videogiochi{" +
                "publishedin=" + publishedin +
                ", piattaforma=" + piattaforma +
                ", ore=" + ore +
                ", genere=" + genere +
                ", idGioco=" + idGioco +
                ", titolo='" + titolo + '\'' +
                ", price=" + price +
                ", randomId=" + randomId +
                '}';
    }
}
