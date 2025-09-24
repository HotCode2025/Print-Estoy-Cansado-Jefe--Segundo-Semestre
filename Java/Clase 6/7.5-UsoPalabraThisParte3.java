package UsoPalabraThis;


//Creamos una nueva clase
class Persona {
    String nombre;
    String apellido;

    Persona (String nombre, String apellido) {
        super(); //Llamada al constructor de la clase Padre object
        //Imprimir imprimir = new Imprimir();
        new Imprimir().imprimir(this);
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando this: "+this);
    }
}

class Imprimir{
    public Imprimir(){
        super(); //El constructor de la clase padre, para reservar memoria
    }

    public void imprimir(Persona persona){
        System.out.println("Persona desde la clase imprimir: "+persona);
        System.out.println("Impresion del objeto actual (this): "+this);
    }
}
