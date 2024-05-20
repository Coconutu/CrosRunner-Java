public class Cros {
    private String numeCros;
    private int lungimeCros;
    private int varstaMinimaCros;
    private int varstaMaximaCros;

    public Cros(String numeCros, int lungimeCros, int varstaMinimaCros, int varstaMaximaCros) {
        this.numeCros = numeCros;
        this.lungimeCros = lungimeCros;
        this.varstaMinimaCros = varstaMinimaCros;
        this.varstaMaximaCros = varstaMaximaCros;
    }

    public String getNumeCros() {
        return numeCros;
    }

    public void setNumeCros(String numeCros) {
        this.numeCros = numeCros;
    }

    public int getLungimeCros() {
        return lungimeCros;
    }

    public void setLungimeCros(int lungimeCros) {
        this.lungimeCros = lungimeCros;
    }

    public int getVarstaMinimaCros() {
        return varstaMinimaCros;
    }

    public void setVarstaMinimaCros(int varstaMinimaCros) {
        this.varstaMinimaCros = varstaMinimaCros;
    }

    public int getVarstaMaximaCros() {
        return varstaMaximaCros;
    }

    public void setVarstaMaximaCros(int varstaMaximaCros) {
        this.varstaMaximaCros = varstaMaximaCros;
    }

    @Override
    public String toString() {
        return "Cros{" +
                "numeCros='" + numeCros + '\'' +
                ", lungimeCros=" + lungimeCros +
                ", varstaMinimaCros=" + varstaMinimaCros +
                ", varstaMaximaCros=" + varstaMaximaCros +
                '}';
    }
}
