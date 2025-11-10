public class Destinasjon {
    private int destinasjonsnummer;
    private String destinasjonnavn;
    private int avstandKm;

    public Destinasjon(int destinasjonsnummer, String destinasjonnavn, int avstandKm) {
        this.destinasjonsnummer = destinasjonsnummer;
        this.destinasjonnavn = destinasjonnavn;
        this.avstandKm = avstandKm;
    }

    public String toString() {
        return "Destinasjonsnummer: " + destinasjonsnummer + "Destinasjonnavn: " + destinasjonnavn + "Avstand KM: " + avstandKm;
    }
}