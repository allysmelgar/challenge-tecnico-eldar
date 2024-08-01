package tp_operaciones.tarjeta.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


import java.time.YearMonth;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Tarjeta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String marca;
    private String numeroTarjeta;

    @OneToOne
    private Persona cliente;
    private YearMonth fechaVencimiento;

    @Transient
    private CalculoTasa calculoTasa;

    public boolean esValidaTarjeta(){
        return fechaVencimiento.isAfter(YearMonth.now());
    }


}
