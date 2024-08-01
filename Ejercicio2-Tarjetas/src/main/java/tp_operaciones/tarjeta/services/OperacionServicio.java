package tp_operaciones.tarjeta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tp_operaciones.tarjeta.models.*;
import tp_operaciones.tarjeta.repositories.OperacionRepository;
import tp_operaciones.tarjeta.repositories.TarjetaRepository;

import java.time.LocalDateTime;

@Service
public class OperacionServicio extends RuntimeException{

    @Autowired
    OperacionRepository operacionRepository;

    @Autowired
    TarjetaRepository tarjetaRespository;

    public double consultarTasaOperacion(Double monto, Tarjeta tarjeta, LocalDateTime fechaHoraOperacion) {
        CalculoTasa calculoTasa;

        switch (tarjeta.getMarca()) {
            case "VISA":
                calculoTasa = new CalculoTasaVisa();
                break;
            case "NARA":
                calculoTasa = new CalculoTasaNara();
                break;
            case "AMEX":
                calculoTasa = new CalculoTasaAmex();
                break;
            default:
                throw new IllegalArgumentException("Marca no soportada");
        }

        return calculoTasa.calcularTasa(fechaHoraOperacion.getYear(), fechaHoraOperacion.getMonth().getValue(), fechaHoraOperacion.getDayOfMonth());
    }




}
