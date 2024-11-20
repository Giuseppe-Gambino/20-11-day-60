package Eser3;

public class Cliente {

    private int codiceCliente;
    private String nomeCognome;
    private String Email;
    private int data;

    public Cliente(int code,String nomeCognome,String Email,int data){
        this.codiceCliente = code;
        this.nomeCognome = nomeCognome;
        this.Email = Email;
        this.data = data;
    }

    public static void stampaCliente(Cliente cliente) {
        System.out.println("codiceCliente:" + cliente.codiceCliente);
        System.out.println("nomeCognome:" + cliente.nomeCognome);
        System.out.println("Email:" + cliente.Email);
        System.out.println("data:" + cliente.data);
    }
}
