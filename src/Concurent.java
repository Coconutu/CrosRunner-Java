public class Concurent {
    private String numeConcurent;
    private int varstaConcurent;
    private  int numarConcurent;
    private int timpRealizatSecunde;
    private int locCros;

    public Concurent(String numeConcurent, int varstaConcurent) {
        this.numeConcurent = numeConcurent;
        this.varstaConcurent = varstaConcurent;
    }

    public String getNumeConcurent() {
        return numeConcurent;
    }

    public void setNumeConcurent(String numeConcurent) {
        this.numeConcurent = numeConcurent;
    }

    public int getVarstaConcurent() {
        return varstaConcurent;
    }

    public void setVarstaConcurent(int varstaConcurent) {
        this.varstaConcurent = varstaConcurent;
    }

    public int getNumarConcurent() {
        return numarConcurent;
    }

    public void setNumarConcurent(int numarConcurent) {
        this.numarConcurent = numarConcurent;
    }

    public int getTimpRealizatSecunde() {
        return timpRealizatSecunde;
    }

    public void setTimpRealizatSecunde(int timpRealizatSecunde) {
        this.timpRealizatSecunde = timpRealizatSecunde;
    }

    public int getLocCros() {
        return locCros;
    }

    public void setLocCros(int locCros) {
        this.locCros = locCros;
    }

    @Override
    public String toString() {
        return "Concurent{" +
                "numeConcurent='" + numeConcurent + '\'' +
                ", varstaConcurent=" + varstaConcurent +
                ", numarConcurent=" + numarConcurent +
                ", timpRealizatSecunde=" + timpRealizatSecunde +
                ", locCros=" + locCros +
                '}';
    }
}
