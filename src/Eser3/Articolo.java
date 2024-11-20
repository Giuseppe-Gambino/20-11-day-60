package Eser3;

public class Articolo {

    private int codiceArticolo;
    private String descrizione;
    private int prezzo;
    private int pezziDisponibili;

    public Articolo(int code,String descr,int prezzo,int dispon){
        this.codiceArticolo = code;
        this.descrizione = descr;
        this.prezzo = prezzo;
        this.pezziDisponibili = dispon;
    }

    public static void stampaArticolo(Articolo articolo) {
        System.out.println("codiceArticolo:" + articolo.codiceArticolo);
        System.out.println("descrizione:" + articolo.descrizione);
        System.out.println("prezzo:" + articolo.prezzo);
        System.out.println("pezziDisponibili:" + articolo.pezziDisponibili);
    }
}
