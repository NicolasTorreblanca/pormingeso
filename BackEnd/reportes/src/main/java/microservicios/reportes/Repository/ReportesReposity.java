package microservicios.reportes.Repository;

import microservicios.reportes.Entity.ReportesEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportesReposity extends CrudRepository<ReportesEntity,Long> {
}
