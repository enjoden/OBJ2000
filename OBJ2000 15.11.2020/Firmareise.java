import java.util.ArrayList;

public class Firmareise extends Reise {
    private String firmanavn;
    private String kontaktperson;

    public Firmareise(String firmanavn, String kontaktperson, int reisenummer, String avreiseDato, String hjemkomstDato, Destinasjon destinasjon) {
        super(reisenummer, avreiseDato, hjemkomstDato, destinasjon);
        this.firmanavn = firmanavn;
        this.kontaktperson = kontaktperson;
    }

    public String toString() {
        return super.toString() + "Firmanavn: " + firmanavn + "Kontaktperson: " + kontaktperson;
    }
}
