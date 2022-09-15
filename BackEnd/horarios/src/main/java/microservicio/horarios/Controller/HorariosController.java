package microservicio.horarios.Controller;

import microservicio.horarios.Model.HorariosModel;
import microservicio.horarios.Service.HorariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping(value = "/horarios")
@CrossOrigin("*")
public class HorariosController {

    @Autowired
    HorariosService horariosService;

    @GetMapping(value = "/all")
    public ArrayList<HorariosModel> obtenerHorarios(){
        return horariosService.obtenerHorarios();
    }

    @PostMapping(value = "/save")
    public HorariosModel guardarHorario(@RequestBody HorariosModel horario){
        return this.horariosService.guardarHorario(horario);
    }

    @GetMapping("/byidEmployee/{idempleado}")
    public ResponseEntity<ArrayList<HorariosModel>> obtenerHorarioporIdEmpleado(@PathVariable("idempleado") int idempleado){
        ArrayList<HorariosModel> horarios = horariosService.obtenerEmpleadoporId(idempleado);
        return ResponseEntity.ok(horarios);
    }

    @GetMapping( path = "/{id}")
    public HorariosModel obtenerHorarioporId(@PathVariable("id") Long id){
        return this.horariosService.obtenerHorarioporId(id);
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarHorario(@PathVariable("id") Long id) {
        boolean ok = this.horariosService.eliminarHorario(id);

        if (ok) {
            return "Usuario eliminado con id : " + id;
        } else {
            return "No se pudo eliminar el usuario con id : " + id;
        }
    }

    @GetMapping("/idempleado/{id}")
    public String getFecha(@PathVariable("id") Long id){
        String fecha= horariosService.getFecha(id);
        return fecha;
    }

    @GetMapping("/horaEntrada/{id}")
    public String gethoraentrada(@PathVariable("id") Long id){
        String horaentrada= horariosService.gethoraentrada(id);
        return horaentrada;
    }

    @GetMapping("/horaSalida/{id}")
    public String getHorasalida(@PathVariable("id") Long id){
        String horasalida= horariosService.getHorasalida(id);
        return horasalida;
    }

    @GetMapping("/horasTrabajadas/{id}")
    public String getHorastrabajadas(@PathVariable("id") Long id){
        String horastrabajadas= horariosService.getHorastrabajadas(id);
        return horastrabajadas;
    }
}
