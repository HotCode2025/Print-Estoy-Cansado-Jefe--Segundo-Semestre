package domain;

public class Persona {
    public final static int CONSNTANTE_AQUI = 15;
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        return "Persona{"+"nombre="+nombre+"}"+", "+super.toString();
    }    
    
}