package tp_operaciones.tarjeta.request;

import tp_operaciones.tarjeta.models.Tarjeta;

import java.time.LocalDateTime;

public class TasaRequest {
    public Double monto;
    public Tarjeta tarjeta;
    public LocalDateTime fechaHoraOperacion;
}
