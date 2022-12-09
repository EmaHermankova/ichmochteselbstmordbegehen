import java.io.Serializable;

public class Clovek extends Main implements Serializable {

    String krestni;
    String prijmeni;
    int rok;

    public Clovek(String krestni, String prijmeni, int rok) {
        this.krestni = krestni;
        this.prijmeni = prijmeni;
        this.rok = rok;
    }

    @Override
    public String toString() {
        return "Clovek{" +
                "krestni='" + krestni + '\'' +
                ", prijmeni='" + prijmeni + '\'' +
                ", rok=" + rok +
                '}';
    }
}
