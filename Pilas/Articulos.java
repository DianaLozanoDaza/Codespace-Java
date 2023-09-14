package Pilas;


public class Articulos {
   int codigo;
   String nombre, detalle;
   double valor;

public Articulos(int codigo, String nombre, String detalle, double valor) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.detalle = detalle;
    this.valor = valor;
} 

   @Override
    public String toString() {
        return "Código: " + codigo + "\nNombre: " + nombre + "\nDetalle: " + detalle + "\nValor: " + valor;
    }
}
