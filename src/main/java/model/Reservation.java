package model;

import java.sql.Date;
import java.sql.Time;

public class Reserva {
    private int id;
    private Date fecha;
    private Time hora;
    private int comensales;
    private int idCliente;

    // Constructor vacío
    public Reserva() {
    }

    // Constructor con parámetros
    public Reserva(int id, Date fecha, Time hora, int comensales, int idCliente) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.comensales = comensales;
        this.idCliente = idCliente;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public int getComensales() {
        return comensales;
    }

    public void setComensales(int comensales) {
        this.comensales = comensales;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "Reserva [id=" + id + ", fecha=" + fecha + ", hora=" + hora +
                ", comensales=" + comensales + ", idCliente=" + idCliente + "]";
    }
}