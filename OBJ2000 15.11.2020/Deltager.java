public class Deltager {
    private int deltagernummer; // Instantse variable eller et attributt
    private String navn;
    private String adresse;
    private int telefonnummer;

    public Deltager(int deltagernummer, String navn, String adresse, int telefonnummer) { // Konstruktor for Deltager med verdiene etc et
        this.deltagernummer = deltagernummer; // this brukes for a assigne parameterets verdi fra instans variablen
        this.navn = navn;
        this.adresse = adresse;
        this.telefonnummer = telefonnummer;
    }

    public String toString() {
        return "Deltagernr: " + deltagernummer + "Navn: " + navn + "adresse: " + adresse + "telefonnummer: " + telefonnummer;
    }
}
