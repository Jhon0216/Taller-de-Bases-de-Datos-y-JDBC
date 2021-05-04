package Classelapptronica;

public class DJs {
    
    //Atributos
    private int Id_dj;
    private String Nombre;
    private int Edad;
    private String Descripcion;
    private int Votos;
    private String Lugar;

    //Constructor
    public DJs(int Id_dj, String Nombre, int Edad, String Descripcion, int Votos, String Lugar) {
        this.Id_dj = Id_dj;
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Descripcion = Descripcion;
        this.Votos = Votos;
        this.Lugar = Lugar;
    }

    //Getters y Setters
    public int getId_dj() {
        return Id_dj;
    }

    public void setId_dj(int Id_dj) {
        this.Id_dj = Id_dj;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getVotos() {
        return Votos;
    }

    public void setVotos(int Votos) {
        this.Votos = Votos;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }
    
}
