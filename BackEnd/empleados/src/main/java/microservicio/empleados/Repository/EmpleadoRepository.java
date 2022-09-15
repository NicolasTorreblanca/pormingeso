package microservicio.empleados.Repository;

import microservicio.empleados.Entity.EmpleadoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository  extends CrudRepository<EmpleadoEntity,Long> {
}
