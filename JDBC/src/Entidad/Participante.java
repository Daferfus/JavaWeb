package Entidad;

public class Participante {
    private int dorsal;
    private String nombre;
    private String apellidos;
    private String poblacion;
    private String club;

    public Participante(int dorsal, String nombre, String apellidos, String poblacion, String club) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.poblacion = poblacion;
        this.club = club;
    }

    public Participante() {}
    public int getDorsal() {
        return dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public String getClub() {
        return club;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public void setClub(String club) {
        this.club = club;
    }

    @Override
    public String toString() {
        return "Participante{" + "dorsal=" + dorsal + ", nombre=" + nombre + ", apellidos=" + apellidos + ", poblacion=" + poblacion + ", club=" + club + '}';
    }
    
}