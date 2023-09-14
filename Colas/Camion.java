package Colas;

public class Camion {
    
    int codigo;
    String placa, nombreChofer;

    public Camion(int codigo, String placa, String nombreChofer) {
        this.codigo = codigo;
        this.placa = placa;
        this.nombreChofer = nombreChofer;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + "\nPlaca: " + placa + "\nNombre del chofer: " + nombreChofer;
    }
    
}
