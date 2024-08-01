package tp_operaciones.tarjeta.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tp_operaciones.tarjeta.request.TasaRequest;
import tp_operaciones.tarjeta.services.OperacionServicio;


@RestController
@RequestMapping("/")
public class OperacionController extends  RuntimeException{

    private static final Logger logger = LoggerFactory.getLogger(OperacionController.class);

    @Autowired
    private OperacionServicio operacionServicio;

    @PostMapping("/tasaOperacion")
    public double consultarTasa(
            @RequestBody TasaRequest tasaRequest
    ) {
        return operacionServicio.consultarTasaOperacion(tasaRequest.monto, tasaRequest.tarjeta, tasaRequest.fechaHoraOperacion);
    }
}
