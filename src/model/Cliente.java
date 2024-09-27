package model;

public class Cliente {
    private int id;
    private String nombre;
    private String email;
    private String telefono;
    private double credito;

    // Constructor
    public Cliente(int id, String nombre, String email, String telefono, double credito) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.credito = credito;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getCredito() {
        return credito;
    }
    public void setCredito(double credito) {
        this.credito = credito;
    }

}
