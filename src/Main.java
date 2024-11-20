import Eser1.Rettangolo;
import Eser2.Sim;
import Eser3.Articolo;
import Eser3.Carrello;
import Eser3.Cliente;

public class Main {
    public static void main(String[] args) {
        Rettangolo pippo = new Rettangolo(20,45);
        Rettangolo pino = new Rettangolo(10,30);

        Rettangolo.stampaRettangolo(pino);
        Rettangolo.dueRettangoli(pippo, pino);

        Sim peppino = new Sim(1000);
        peppino.getInfo();

        peppino.chiama(3244,3);
        peppino.getInfo();


        Articolo cipolle = new Articolo(323,"belle cipolle fresche",5,34342);
        Articolo.stampaArticolo(cipolle);

        Cliente peppi = new Cliente(232,"peppino gambino","poppo@gmsald",234);
        Cliente.stampaCliente(peppi);

        Carrello carrellodiPepp = new Carrello(232);
        Carrello.stampaCarrello(carrellodiPepp);
    }
}