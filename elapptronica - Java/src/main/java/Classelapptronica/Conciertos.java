package Classelapptronica;

public class Conciertos {
    
    //Atributos
    private int Id_concierto;
    private String Nombre;
    private String Descripcion;
    private String Fecha;
    private String Lugar;

    //Constructor
    public Conciertos(int Id_concierto, String Nombre, String Descripcion, String Fecha, String Lugar) {
        this.Id_concierto = Id_concierto;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Fecha = Fecha;
        this.Lugar = Lugar;
    }

    //Getters y Setters
    public int getId_concierto() {
        return Id_concierto;
    }

    public void setId_concierto(int Id_concierto) {
        this.Id_concierto = Id_concierto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }
    
    
    
}
