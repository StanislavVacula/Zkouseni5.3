import java.time.LocalDate;

public class Zakaznik {
    private String jmeno;
    private LocalDate datumNarozeni;

    public Zakaznik(String jmeno, LocalDate datumNarozeni) {
        this.jmeno = jmeno;
        this.datumNarozeni = datumNarozeni;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public LocalDate getDatumNarozeni() {
        return datumNarozeni;
    }

    public void setDatumNarozeni(LocalDate datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }
}
