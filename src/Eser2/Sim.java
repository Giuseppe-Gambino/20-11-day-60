package Eser2;

import java.util.Arrays;

public class Sim {

    private int phoneNumber;
    private double credit;
    private chiamate[] recentCall;

    class chiamate {
        int numero;
        int minuti;

        public chiamate(int numero, int minuti){
            this.numero = numero;
            this.minuti = minuti;
        }
    }

    public void chiama(int num, int min){
        chiamate newChiamata = new chiamate(num,min);
        recentCall[0] = newChiamata;
    }

    public Sim (int numero){
        this.phoneNumber = numero;
        this.credit = 0;
        this.recentCall = new chiamate[5];

    }

    public void getInfo(){
        System.out.println("numero di telefono:" + phoneNumber);
        System.out.println("credito:" + credit);
        System.out.println("chiamate recenti:" + Arrays.toString(recentCall));

    }


}
