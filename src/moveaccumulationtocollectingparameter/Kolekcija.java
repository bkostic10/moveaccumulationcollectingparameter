/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package moveaccumulationtocollectingparameter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Baxter
 */
public class Kolekcija {
    private String ekipa;
    List<Igrac> igraci;
    private String trener;

    public String getTrener() {
        return trener;
    }

    public void setTrener(String trener) {
        this.trener = trener;
    }
    

    public String getEkipa() {
        return ekipa;
    }

    public void setEkipa(String ekipa) {
        this.ekipa = ekipa;
    }

    public Kolekcija() {
        igraci = new ArrayList<Igrac>();
        dodajIgraca(new Igrac(1, "Pera", "Peric"));
        dodajIgraca(new Igrac(2, "Boki", "Mikic"));
        dodajIgraca(new Igrac(3, "Zile", "Zivkovic"));
        dodajIgraca(new Igrac(4, "Milan", "Perkovic"));
    }

    public List<Igrac> getIgraci() {
        return igraci;
    }

    public void setIgraci(List<Igrac> igraci) {
        this.igraci = igraci;
    }
    
    public void dodajIgraca(Igrac ig){
        igraci.add(ig);
    }
    @Override
    public String toString(){
        String rezultat = new String();
        rezultat += "--- "+getEkipa()+" ---\n";
        for(int i = 0;i<igraci.size();i++){
            rezultat+=igraci.get(i).toString();
        }
        if(!trener.equals(""))
            rezultat+=trener;
        rezultat += "\n--- "+getEkipa()+" ---";
        return rezultat;
    }

}
