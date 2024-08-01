package tp_operaciones.tarjeta.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tp_operaciones.tarjeta.models.Tarjeta;

@Repository
public interface TarjetaRepository extends JpaRepository<Tarjeta,Integer > {
    Tarjeta findByNumeroTarjeta(String numeroTarjeta);
}
