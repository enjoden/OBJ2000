import java.util.ArrayList;

public abstract class Reise {
    private int reisenummer;
    private String avreiseDato;
    private String hjemkomstDato;
    private ArrayList<Deltager> deltagere;
    private Destinasjon destinasjon;

    public Reise(int reisenummer, String avreiseDato, String hjemkomstDato, Destinasjon destinasjon) {
        this.reisenummer = reisenummer;
        this.avreiseDato = avreiseDato;
        this.hjemkomstDato = hjemkomstDato;
        this.deltagere = new ArrayList<>();
        this.destinasjon = destinasjon;
    }

    public void nyDeltager(Deltager deltager) {
        deltagere.add(deltager);
    }

    public ArrayList<Deltager> getDeltagere() {
        return new ArrayList<>(deltagere); // Returnerer en kopi av listen i stedet for a vise det direkte
    }

    public String toString() {
        return "Reisenr: " + reisenummer + "Avreisedato: " + avreiseDato + "hjemkomstdato: " + hjemkomstDato + "deltagere: " + deltagere + "destinasjon: " + destinasjon;
    }
}
