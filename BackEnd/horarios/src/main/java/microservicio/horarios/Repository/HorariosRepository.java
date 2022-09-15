package microservicio.horarios.Repository;

import microservicio.horarios.Model.HorariosModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface HorariosRepository extends CrudRepository<HorariosModel,Long> {

    ArrayList<HorariosModel> findByidempleado(int idempleado);
}

