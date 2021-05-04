package Classelapptronica;

public class Lugares {
 
    //Atributos
    private int Id_lugar;
    private String Nombre;
    private String Direccion;
    private int Telefono;
    private String Genero;
    private String Tipo_Escenario;

    //Constructor
    public Lugares(int Id_lugar, String Nombre, String Direccion, int Telefono, String Genero, String Tipo_Escenario) {
        this.Id_lugar = Id_lugar;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Genero = Genero;
        this.Tipo_Escenario = Tipo_Escenario;
    }

    //Getters y Setters
    public int getId_lugar() {
        return Id_lugar;
    }

    public void setId_lugar(int Id_lugar) {
        this.Id_lugar = Id_lugar;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getTipo_Escenario() {
        return Tipo_Escenario;
    }

    public void setTipo_Escenario(String Tipo_Escenario) {
        this.Tipo_Escenario = Tipo_Escenario;
    }
    
    
    
}
