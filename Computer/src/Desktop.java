public class Desktop extends PcFissi {
    private String schedaVideo;

    public Desktop(String tipoProcessore, int memoriaRAM, int memoriaMassa, String marca, String modello, String sistemaOperativo, String schedaVideo) {
        super(tipoProcessore, memoriaRAM, memoriaMassa, marca, modello, sistemaOperativo);
        this.schedaVideo = schedaVideo;
    }

    public String getSchedaVideo() {
        return schedaVideo;
    }

    public void setSchedaVideo(String schedaVideo) {
        this.schedaVideo = schedaVideo;
    }
}