package model;

import java.time.LocalDate;

public class Auto implements Comparable<Auto> {

    // attributen

    private String merk;
    private String model;
    private LocalDate datumAfgifteKenteken;
    private int kilometerstand;
    private String kenteken;

    // constructors

    public Auto(String merk, String model, LocalDate datumAfgifteKenteken, int kilometerstand, String kenteken) {
        this.merk = merk;
        this.model = model;
        this.datumAfgifteKenteken = datumAfgifteKenteken;
        this.kilometerstand = kilometerstand;
        this.kenteken = kenteken;
    }

    // methoden

    @Override
    public String toString() {
        return "Merk: " + this.merk + "\nModel: " + this.model + "\nDatum kenteken: " + this.datumAfgifteKenteken + "\nKilometerstand: " + this.kilometerstand + "\nKenteken: " + this.kenteken;
    }

    @Override
    public int compareTo(Auto andereAuto) {
        return this.datumAfgifteKenteken.compareTo(andereAuto.datumAfgifteKenteken);
    }

    // getters en setters

    public LocalDate getDatumAfgifteKenteken() {
        return datumAfgifteKenteken;
    }
}
