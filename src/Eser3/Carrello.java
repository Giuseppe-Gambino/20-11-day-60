package Eser3;

public class Carrello {

    private int codeCliente;
    private Articolo[] articoli;
    private int totCosto;

    public Carrello(int codeCli){
        this.codeCliente = codeCli;
        this.articoli = new Articolo[5];
        this.totCosto = 0;
    }

    public static void stampaCarrello(Carrello carrello){
        System.out.println("codiceClienete:" + carrello.codeCliente );
        System.out.println("articoli:" + carrello.articoli );
        System.out.println("totCosto:" + carrello.totCosto );

    }

//    public static void addToCart(Articolo newArticolo){
//
//    }
}
