package tp_operaciones.tarjeta.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tp_operaciones.tarjeta.models.Operacion;
import tp_operaciones.tarjeta.models.Tarjeta;

import java.util.Optional;

@Repository
public interface OperacionRepository extends JpaRepository<Operacion,Integer > {

    Optional<Operacion> findById(Integer id);

    Operacion findByTarjeta(Tarjeta tarjeta);


}
