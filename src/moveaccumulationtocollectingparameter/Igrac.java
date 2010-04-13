/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package moveaccumulationtocollectingparameter;

/**
 *
 * @author Baxter
 */
public class Igrac {
    private int broj;
    private String ime;
    private String prezime;

    public Igrac() {
    }

    public Igrac(int broj, String ime, String prezime) {
        this.broj = broj;
        this.ime = ime;
        this.prezime = prezime;
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    @Override
    public String toString() {
        return broj+". "+ime+" "+prezime+"\n";
    }

}
