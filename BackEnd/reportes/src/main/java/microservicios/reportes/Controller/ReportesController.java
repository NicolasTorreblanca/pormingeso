package microservicios.reportes.Controller;

import microservicios.reportes.Entity.ReportesEntity;
import microservicios.reportes.Model.Horario;
import microservicios.reportes.Service.ReportesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/reportes")
@CrossOrigin("*")
public class ReportesController {

    @Autowired
    ReportesService reportesService;

    @GetMapping("/horarios")
    public ResponseEntity<ArrayList<Horario>> obtenerHorarios(){
        ArrayList<Horario> horarios= reportesService.obtenerHorarios();
        if(horarios.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(horarios);

    }

    @GetMapping("/all")
    public ResponseEntity<ArrayList<ReportesEntity>> getAll(){
        ArrayList<ReportesEntity> reportes=reportesService.getAll();
        if(reportes.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(reportes);

    }

    @PostMapping("/save/{id}")
    public ResponseEntity<ReportesEntity> save(@PathVariable("id") int id){
        ReportesEntity reportesEntity=reportesService.save(id);
        if(reportesEntity==null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(reportesEntity);
    }

    @PostMapping("/saveAll")
    public ResponseEntity<ArrayList<ReportesEntity>> saveAll(){
        ArrayList<ReportesEntity> reportes=reportesService.saveAll();
        if(reportes.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(reportes);
    }
}
