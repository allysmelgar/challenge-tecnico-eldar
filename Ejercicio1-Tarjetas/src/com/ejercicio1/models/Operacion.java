package com.ejercicio1.models;

import java.time.LocalDateTime;

public class Operacion {

    private Integer idOperacion;
    private Integer monto;
    private Tarjeta tarjeta;
    private LocalDateTime fechaHoraOperacion;

    public Operacion(Integer idOperacion, Integer monto, Tarjeta tarjeta, LocalDateTime fechaHoraOperacion) {
        this.idOperacion = idOperacion;
        this.monto = monto;
        this.tarjeta = tarjeta;
        this.fechaHoraOperacion = fechaHoraOperacion;
    }


    public Integer getIdOperacion() {
        return idOperacion;
    }

    public void setIdOperacion(Integer idOperacion) {
        this.idOperacion = idOperacion;
    }

    public Integer getMonto() {
        return monto;
    }

    public void setMonto(Integer monto) {
        this.monto = monto;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    @Override
    public String toString() {
        return "Operacion{" +
                "idOperacion=" + idOperacion +
                ", monto=" + monto +
                ", tarjeta=" + tarjeta +
                '}';
    }

    public boolean esValidaOperacion() {
        return monto <= 1000 && tarjeta.esValidaTarjeta();
    }

    public double obtenerTasaOperacion() {
        return this.getTarjeta().getCalculoTasa()
                .calcularTasa(this.fechaHoraOperacion.getDayOfMonth(),
                        this.fechaHoraOperacion.getMonthValue(),
                        this.fechaHoraOperacion.getYear());
    }

    public String infoTasaOperacion() {
        return "Marca de la tarjeta: " + getTarjeta().getMarca() + " | Importe de Tasa de operación: " + Double.toString(obtenerTasaOperacion());
    }
}
