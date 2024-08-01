package com.ejercicio1;

import com.ejercicio1.models.*;
import com.ejercicio1.exceptions.OperacionValidaException;
import com.ejercicio1.exceptions.TarjetaValidaException;
import java.time.LocalDateTime;
import java.time.YearMonth;

public class Ejercicio1 {
    public static  void main(String[] args) {

        Persona allisonMelgar = new Persona(19015485, "Allison ", "Melgar");
        Persona juliaMartinez = new Persona(11125348, "Julia", "Martinez");
        Persona matiasRodriguez = new Persona(1122534, "Matias", "Rodriguez");

        CalculoTasaVisa tasaVisa = new CalculoTasaVisa();
        CalculoTasaNara tasaNara = new CalculoTasaNara();
        CalculoTasaAmex tasaAmex = new CalculoTasaAmex();

        Tarjeta tarjetaVISA = new Tarjeta("VISA", "1344532635356635", allisonMelgar, YearMonth.of(2024, 12), tasaVisa);
        Tarjeta tarjetaNARA = new Tarjeta("NARA", "2545345353454358", juliaMartinez, YearMonth.of(2025, 8), tasaNara);
        Tarjeta tarjetaAMEX = new Tarjeta("AMEX", "6145786768686767", matiasRodriguez, YearMonth.of(2023, 11), tasaAmex);

        Operacion operacion1 = new Operacion(1, 10000, tarjetaVISA, LocalDateTime.of(2024, 7, 30, 15, 30));
        Operacion operacion2 = new Operacion(2, 500, tarjetaNARA, LocalDateTime.of(2024, 7, 31, 13, 42));
        Operacion operacion3 = new Operacion(3, 850, tarjetaAMEX, LocalDateTime.of(2024, 8, 1, 20, 59));


        // 1- Invocar un método que devuelva toda la información de una tarjeta.
        tarjetaVISA.mostrarInfoTarjeta();

        //2- Informar si una operación es valida.
        if (operacion2.esValidaOperacion()) {
            System.out.println("La operacion es valida");
        } else {
            throw new OperacionValidaException("La operacion es invalida");
        }

        //3- Informar si una tarjeta es válida para operar.
        if(tarjetaNARA.esValidaTarjeta()){
            System.out.println("La tarjeta es valida");
        }else {
            throw new TarjetaValidaException("La tarjeta no es valida para operar");
        }

        //4-Identificar si una tarjeta es distinta a otra.
        if(!tarjetaVISA.equals(tarjetaNARA)){
            System.out.println("Las tarjetas son distintas");
        }else {
            System.out.println("Las tarjetas son iguales");
        }

        //5-Obtener por medio de un método la tasa de una operación informando marca e importe
        System.out.println(operacion2.infoTasaOperacion());
    }
}
