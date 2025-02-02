import static utility.Tools.*;

import java.util.Objects;
import java.util.Scanner;

public class PcFissi {
    private String tipoProcessore;
    private int memoriaRAM;
    private int memoriaMassa;
    private String marca;
    private String modello;
    private String sistemaOperativo;
    private Contenitore tipoContenitore;

    public PcFissi(String tipoProcessore, int memoriaRAM, int memoriaMassa, String marca, String modello, String sistemaOperativo) {
        this.tipoProcessore = tipoProcessore;
        this.memoriaRAM = memoriaRAM;
        this.memoriaMassa = memoriaMassa;
        this.marca = marca;
        this.modello = modello;
        this.sistemaOperativo = sistemaOperativo;
    }

    public void setTipoProcessore(String tipoProcessore) {
        this.tipoProcessore = tipoProcessore;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public void setMemoriaMassa(int memoriaMassa) {
        this.memoriaMassa = memoriaMassa;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getTipoProcessore() {
        return tipoProcessore;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public int getMemoriaMassa() {
        return memoriaMassa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public Contenitore getTipoContenitore() {
        return tipoContenitore;
    }

    public void setTipoContenitore(Scanner sc) {
        String[] opzioni = {"Tipo contenitore", "1-Grande", "2-Medio", "3-Piccolo"};
        switch (Menu(opzioni, sc)) {
            case 1 -> {
                tipoContenitore = Contenitore.GRANDE;
            }
            case 2 -> {
                tipoContenitore = Contenitore.MEDIO;
            }
            case 3 -> {
                tipoContenitore = Contenitore.PICCOLO;
            }
        }
    }

    @Override
    public String toString() {
        return String.format(tipoProcessore, memoriaRAM, memoriaMassa, marca, modello, sistemaOperativo, tipoContenitore);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PcFissi pcFissi)) return false;
        return Objects.equals(marca, pcFissi.marca) && Objects.equals(modello, pcFissi.modello);
    }
}