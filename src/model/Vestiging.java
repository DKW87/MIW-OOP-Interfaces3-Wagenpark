package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Vestiging {

    // attributen

    private String plaats;
    private String manager;
    private List<Auto> autos;

    // constructors

    public Vestiging(String plaats, String manager) {
        this.plaats = plaats;
        this.manager = manager;
    }

    // methoden

    public void voegAutoToe (Auto auto) {
        autos.add(auto);
        // nog verder aanpassen?
    }

    @Override
    public String toString() {
        Collections.sort(autos);
        StringBuilder resultString = new StringBuilder();
        resultString.append(String.format("Plaats: %s\nManager: %s\n\n", plaats, manager));
        for (Auto auto: autos) {
            resultString.append(auto + "\n");
        }
        return resultString.toString();
    }

//    public ArrayList<Auto> geefAutosNaDatum(LocalDate datum) {
//        ArrayList<Auto> resultaten = new ArrayList<>();
//        for (Auto auto : autos) {
//            if (auto.getDatumAfgifteKenteken().isAfter(datum)) {
//                resultaten.add(auto);
//            }
//        }
//        return resultaten;
//    }

    public List<Auto> geefAutosNaDatum(LocalDate datum) {
    List<Auto> autosNaDatum = new ArrayList<>();

    for (Auto auto: autos) {
        if (auto.getDatumAfgifteKenteken().isAfter(datum)) {
            autosNaDatum.add(auto);
        }
    }
    return autosNaDatum;
    }

    // getters en setters


}
