package it.uniroma1.metodologie;

/**
 * Classe per il commento che implementa l'interfaccia Istruzione
 */

public class Commento implements Istruzione {

    /**
     * Stringa che corrisponde al commento
     */

    private String commento;

    /**
     * Costruzione dell'istruzione Commento
     * @param commento
     */

    public Commento(String commento){ this.commento = commento; }

    @Override
    public void esegui(){ }
}