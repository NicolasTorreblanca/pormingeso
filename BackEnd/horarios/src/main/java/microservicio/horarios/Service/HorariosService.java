package microservicio.horarios.Service;

import microservicio.horarios.Model.HorariosModel;
import microservicio.horarios.Repository.HorariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class HorariosService {

    @Autowired
    HorariosRepository horariosRepository;
    public ArrayList<HorariosModel> obtenerHorarios(){
        return(ArrayList<HorariosModel>) horariosRepository.findAll();
    }

    public HorariosModel guardarHorario(HorariosModel horario){
        return horariosRepository.save(horario);
    }

    public HorariosModel obtenerHorarioporId(Long id){
        return horariosRepository.findById(id).orElse(null);
    }

    public ArrayList<HorariosModel> obtenerEmpleadoporId(int idempleado){
        return horariosRepository.findByidempleado(idempleado);
    }

    public boolean eliminarHorario(Long id){
        try{
            horariosRepository.deleteById(id);
            return true;
        } catch (Exception error) {
            return false;
        }
    }

    public String getFecha(Long id){
        return obtenerHorarioporId(id).getFecha();

    }

    public String gethoraentrada(Long id){
        return obtenerHorarioporId(id).gethoraentrada();

    }
    public String getHorasalida(Long id){
        return obtenerHorarioporId(id).getHorasalida();

    }

    public String getHorastrabajadas(Long id){
        return obtenerHorarioporId(id).getHorastrabajadas();

    }


    public int getidempleado(Long id){
        return obtenerHorarioporId(id).getidempleado();

    }
}
