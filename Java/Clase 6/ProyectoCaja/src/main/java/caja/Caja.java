package caja;

public class Caja {
    int ancho;
    int alto;
    int profundidad;

    /*Metodo para calcular el volumen (se hizo acá para practicar de llamar al
    metodo desde la otra clase)*/

    public int calcularVolumen(){
       return ancho*alto*profundidad;
    }

    public Caja() {
    }

    public Caja(int ancho, int alto, int profundidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundidad = profundidad;
    }
}
