package microservicio.empleados.Services;

import microservicio.empleados.Entity.EmpleadoEntity;
import microservicio.empleados.Repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class EmpleadoService{

    @Autowired
    EmpleadoRepository empleadoRepository;
    public ArrayList<EmpleadoEntity> obtenerEmpleados(){
        return(ArrayList<EmpleadoEntity>) empleadoRepository.findAll();
    }

    public EmpleadoEntity guardarEmpleado(EmpleadoEntity empleado){
        return empleadoRepository.save(empleado);
    }

    public EmpleadoEntity obtenerEmpleadoporId(Long id){
        return empleadoRepository.findById(id).orElse(null);
    }
    public boolean eliminarEmpleado(Long id){
        try{
            empleadoRepository.deleteById(id);
            return true;
        } catch (Exception error) {
            return false;
        }
    }

}
