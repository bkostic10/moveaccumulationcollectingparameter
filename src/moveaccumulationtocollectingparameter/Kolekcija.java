/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package moveaccumulationtocollectingparameter;

import java.util.ArrayList;
import java.util.Iterator;
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
        StringBuffer rezultat = new StringBuffer("");
        ispisiSve(rezultat);
        return rezultat.toString();
    }
    public void ispisiEkipu(StringBuffer r){
        r.append("--- ");
        r.append(getEkipa());
        r.append(" ---\n");
    }
    public void ispisiSve(StringBuffer r){
        ispisiEkipu(r);
        ispisiIgrace(r);
        ispisiTrenera(r);
        ispisiKraj(r);
    }
    public void ispisiIgrace(StringBuffer r){
        Iterator it = igraci.iterator();
        while(it.hasNext()){
            Kolekcija k = (Kolekcija) it.next();
            k.ispisiSve(r);
        }

    }
    public void ispisiTrenera(StringBuffer r){
        if(!trener.equals(""))
            r.append(trener);
    }
     public void ispisiKraj(StringBuffer r){
        r.append("--- ");
        r.append(getEkipa());
        r.append(" ---\n");
    }
}
