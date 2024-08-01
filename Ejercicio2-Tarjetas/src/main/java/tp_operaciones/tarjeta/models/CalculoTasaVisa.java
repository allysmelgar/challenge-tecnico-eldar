package tp_operaciones.tarjeta.models;

import tp_operaciones.tarjeta.exceptions.CalculoTasaException;

public class CalculoTasaVisa implements CalculoTasa {
    @Override
    public double calcularTasa(int anio, int mes, int dia) {


        if (mes >= 1 && mes <= 12) {
             if (dia >= 1 && dia <= 31) {
                 try {
                return anio / mes;
            } catch (Exception var5) {
                     throw new CalculoTasaException("Error en el calculo de la tasa", var5);
                 }
             } else {
            throw new CalculoTasaException("El dia debe estar entre 1 y 31.");
        }
    } else {
        throw new CalculoTasaException("El mes debe estar entre 1 y 12.");
    }
        }
    }


