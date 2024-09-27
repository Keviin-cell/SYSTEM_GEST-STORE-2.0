package model;

import java.time.LocalDateTime;

public class Venta {
    private int id;
    private LocalDateTime fecha;
    private double total;

    // Constructor
    public Venta(int id, LocalDateTime fecha, double total) {
        this.id = id;
        this.fecha = fecha;
        this.total = total;
    }

    // Constructor vacío
    public Venta() {}

    // Getters y Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
}