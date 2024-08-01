package tp_operaciones.tarjeta.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Operacion  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double monto;
    @OneToOne
    private Tarjeta tarjeta;
    private LocalDateTime fechaHoraOperacion;

    public boolean esValidaOperacion() {
        return monto <= 1000 && tarjeta.esValidaTarjeta();
    }

    public double obtenerTasaOperacion() {
        return this.getTarjeta().getCalculoTasa()
                .calcularTasa(this.fechaHoraOperacion.getDayOfMonth(),
                        this.fechaHoraOperacion.getMonthValue(),
                        this.fechaHoraOperacion.getYear());
    }
}
