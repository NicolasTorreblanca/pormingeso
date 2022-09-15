package microservicio.empleados.Controller;

import microservicio.empleados.Entity.EmpleadoEntity;
import microservicio.empleados.Services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping(value = "/empleados")
@CrossOrigin("*")
public class EmpleadoController {

    @Autowired
    EmpleadoService empleadoService;

    @GetMapping(value = "/all")
    public ArrayList<EmpleadoEntity> obtenerEmpleados(){
        return empleadoService.obtenerEmpleados();
    }

    @PostMapping(value = "/save")
    public EmpleadoEntity guardarEmpleado(@RequestBody EmpleadoEntity empleado){
        return this.empleadoService.guardarEmpleado(empleado);
    }

    @GetMapping( path = "/{id}")
    public EmpleadoEntity obtenerEmpleadoporId(@PathVariable("id") Long id){
        return this.empleadoService.obtenerEmpleadoporId(id);
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarEmpleado(@PathVariable("id") Long id) {
        boolean ok = this.empleadoService.eliminarEmpleado(id);

        if (ok) {
            return "Usuario eliminado con id : " + id;
        } else {
            return "No se pudo eliminar el usuario con id : " + id;
        }
    }

}
