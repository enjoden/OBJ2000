import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // HashMap<K, V>
        // K type of keys maintaned
        // V type of mapped values
        HashMap<String, String> dictionary = new HashMap<>();
        Scanner input = new Scanner(System.in);

        // Adding stuff to dictionary with .put(keys maintained and a mapped value
        dictionary.put("norsk", "alien");
        dictionary.put("katt", "meelo");
        dictionary.put("hund", "zarg");
        dictionary.put("Hvordan har du det?", "Blip blop naru?");
        dictionary.put("hei", "blorx");
        dictionary.put("farvel", "zintar");
        dictionary.put("takk", "gilbnub");
        dictionary.put("mat", "snorkeloo");
        dictionary.put("sol", "dravak");
        dictionary.put("venn", "glarbo");
        dictionary.put("lærer", "trunik");
        dictionary.put("skole", "skarnak");
        dictionary.put("bok", "velmorra");
        dictionary.put("blyant", "splintar");
        dictionary.put("skrive", "jotnib");
        dictionary.put("lese", "frublek");
        dictionary.put("vann", "zeltra");
        dictionary.put("melk", "blorn");
        dictionary.put("saft", "glirpa");
        dictionary.put("brød", "krunak");
        dictionary.put("ost", "trebnik");
        dictionary.put("kjøtt", "flarnak");
        dictionary.put("hus", "darplin");
        dictionary.put("rom", "shlurp");
        dictionary.put("dør", "klintar");
        dictionary.put("vindu", "spelg");
        dictionary.put("bil", "vroomix");
        dictionary.put("buss", "blombar");
        dictionary.put("sykkel", "treklik");
        dictionary.put("vei", "grubnar");
        dictionary.put("by", "zelvik");
        dictionary.put("landsby", "drunmar");
        dictionary.put("fjell", "krennak");
        dictionary.put("elv", "florp");
        dictionary.put("sjø", "blarn");
        dictionary.put("himmel", "zoltra");
        dictionary.put("stjerne", "glimbor");
        dictionary.put("måne", "dronix");

        // Bruker input
        System.out.print("Skriv inn en setning (norsk eller alien): ");
        String inputSetning = input.nextLine();

        if (NorskEllerAlien(dictionary, inputSetning)) {
            String oversatt = NorskTilAlien(dictionary, inputSetning);
            System.out.print("Alien: " + oversatt);
        } else {
            String oversatt = AlienTilNorsk(dictionary, inputSetning);
            System.out.print("Norsk: " + oversatt);
        }
    }

    public static String NorskTilAlien(HashMap<String, String> dictionary, String setning) {
        String[] ord = setning.split(" ");
        String resultat = "";

        for (String ordet : ord) {
            String alien = dictionary.get(ordet);
            if (alien == null) {
                resultat += "??? ";
            } else {
                resultat += alien + " ";
            }
        }
        return resultat;
    }

    public static String AlienTilNorsk(HashMap<String, String> dictionary, String setning) {
        String[] ord = setning.split(" ");
        String resultat = "";

        for (int i = 0; i<ord.length; i++) {
            String alienword = ord[i];
            boolean found = false;

            for (Map.Entry<String, String> entry : dictionary.entrySet()) {
                if (entry.getValue().equals(alienword)) {
                    resultat += entry.getKey() + " ";
                    found = true;
                    break;
                }
            }
            if (!found) {
                resultat += "??? ";
            }
        }
        return resultat;
    }

    public static boolean NorskEllerAlien(HashMap<String, String> dictionary, String setning) {
        String[] ord = setning.split(" ");
        int norskeOrd = 0;
        int alienOrd = 0;

        for (String ordet : ord) {
            if (dictionary.containsKey(ordet)) {
                norskeOrd++;
            } else if (dictionary.containsValue(ordet)) {
                alienOrd++;
            }
        }
        return norskeOrd>=alienOrd;
    }
}