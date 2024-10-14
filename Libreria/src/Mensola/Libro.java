package Mensola;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Libro {

    public String autore;
    public String titolo;
    public final double PREZZOPAGINA = 0.05;
    public int pagine;
    public LocalDate dataDiPubblicazione;
    public Genere tipo;
    private DateTimeFormatter dataFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");


    public String FormattaDati() {
        return String.format("Autore : %s , Titolo: %s, PREZZOPAGINA %.2f, Pagine:%d , tipo: %s, Data: %s ", autore, titolo, PREZZOPAGINA * pagine, pagine, tipo, dataDiPubblicazione.format(dataFormat));
    }
}