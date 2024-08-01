package com.ejercicio1.models;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class Tarjeta {

    private String marca;
    private String numeroTarjeta;
    private Persona cliente;
    private YearMonth fechaVencimiento;
    private ICalculoTasa calculoTasa;

    public Tarjeta(String marca, String numeroTarjeta, Persona cliente, YearMonth fechaVencimiento, ICalculoTasa calculoTasa) {
        this.marca = marca;
        this.numeroTarjeta = numeroTarjeta;
        this.cliente = cliente;
        this.fechaVencimiento = fechaVencimiento;
        this.calculoTasa = calculoTasa;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public ICalculoTasa getMarcaTarjeta() {
        return calculoTasa;
    }

    public void setMarcaTarjeta(ICalculoTasa calculoTasa) {
        this.calculoTasa = calculoTasa;
    }

    public YearMonth getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(YearMonth fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Persona getPersona() {
        return cliente;
    }

    public void setPersona(Persona cliente) {
        this.cliente = cliente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public ICalculoTasa getCalculoTasa() {
        return calculoTasa;
    }

    public void setCalculoTasa(ICalculoTasa calculoTasa) {
        this.calculoTasa = calculoTasa;
    }

    public String obtenerInfoTarjeta() {
        return "Tarjeta{" +
                "marca='" + marca + '\'' +
                ", numeroTarjeta=" + numeroTarjeta +
                ", cliente=" + cliente +
                ", fechaVencimiento=" + fechaVencimiento +
                ", calculoTasa=" + calculoTasa +
                '}';
    }
    public boolean esValidaTarjeta(){

        return fechaVencimiento.isAfter(YearMonth.now());
    }

    public void mostrarInfoTarjeta() {
        System.out.println("INFORMACION TARJETA");
        System.out.println("Marca: " + this.marca);
        System.out.println("Numero de Tarjeta: " + this.numeroTarjeta);
        System.out.println("Cardholder: " + this.cliente.getNombre() + " " + this.cliente.getApellido());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yy");
        System.out.println("Fecha de Vencimiento: " + this.fechaVencimiento.format(formatter));
    }


}
