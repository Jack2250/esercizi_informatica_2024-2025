public class Server extends PcFissi {
    private int numeroProcessori;
    private boolean dischiRAID;

    public Server(String tipoProcessore, int memoriaRAM, int memoriaMassa, String marca, String modello, String sistemaOperativo, int numeroProcessori, boolean dischiRAID) {
        super(tipoProcessore, memoriaRAM, memoriaMassa, marca, modello, sistemaOperativo);
        this.numeroProcessori = numeroProcessori;
        this.dischiRAID = dischiRAID;
    }

    public void setNumeroProcessori(int numeroProcessori) {
        this.numeroProcessori = numeroProcessori;
    }

    public void setDischiRAID(boolean dischiRAID) {
        this.dischiRAID = dischiRAID;
    }

    public int getNumeroProcessori() {
        return numeroProcessori;
    }

    public boolean isDischiRAID() {
        return dischiRAID;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(String.valueOf(numeroProcessori), dischiRAID);
    }
}