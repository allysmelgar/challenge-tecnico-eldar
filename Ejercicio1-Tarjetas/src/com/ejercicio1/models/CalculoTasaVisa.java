package com.ejercicio1.models;

import com.ejercicio1.exceptions.CalculoTasaException;

public class CalculoTasaVisa implements ICalculoTasa {
    @Override
    public double calcularTasa(int dia, int mes, int anio) {
        if (mes < 1 || mes > 12) {
            throw new CalculoTasaException("El mes debe estar entre 1 y 12.");
        }

        if (dia < 1 || dia > 31) {
            throw new CalculoTasaException("El dia debe estar entre 1 y 31.");
        }

        try {
            return anio / mes;
        } catch (Exception e) {
            throw new CalculoTasaException("Error en el cálculo de la tasa", e);
        }
    }
}


