package Eser1;

public class Rettangolo {

    private int altezza;
    private int larghezza;
    private int perimetro;
    private int area;


    public Rettangolo(int altezza, int larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
        this.area = altezza * larghezza;
        this.perimetro = (altezza + larghezza) * 2;
    }


    public static void stampaRettangolo(Rettangolo ret){
        System.out.println("il perimetro è:" + ret.perimetro);
        System.out.println("l'area è:" + ret.area);
    }

    public static void dueRettangoli(Rettangolo ret1, Rettangolo ret2){
        System.out.println("somma dei 2 rettangoli è:");
        System.out.println("perimetro:" + (ret1.perimetro + ret2.perimetro));
        System.out.println("area:" + (ret1.area + ret2.area));

    }

}
