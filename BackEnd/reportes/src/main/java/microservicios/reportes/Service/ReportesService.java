package microservicios.reportes.Service;

import microservicios.reportes.Entity.ReportesEntity;
import microservicios.reportes.Model.Empleado;
import microservicios.reportes.Model.Horario;
import microservicios.reportes.Repository.ReportesReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@Service
public class ReportesService {

    @Autowired
    ReportesReposity reportesReposity;

    @Autowired
    RestTemplate restTemplate;

    public ArrayList<ReportesEntity> getAll(){
        return (ArrayList<ReportesEntity>) reportesReposity.findAll();
    }

    public ReportesEntity guardarporID(int id ){
        String nombre=restTemplate.getForObject("http://localhost:8090/empleados/nombres/"+id,String.class);
        String horaentrada=restTemplate.getForObject("http://localhost:8091/horarios/horaEntrada/"+id,String.class);
        String horasalida=restTemplate.getForObject("http://localhost:8091/horarios/horaSalida/"+id,String.class);
        String horastrabajadas=restTemplate.getForObject("http://localhost:8091/horarios/horasTrabajadas/"+id,String.class);
        int idempleado =restTemplate.getForObject("http://localhost:8091/horarios/idempleado/"+id,int.class);
        ReportesEntity reportesEntity=new ReportesEntity(idempleado,horaentrada,horasalida,horastrabajadas,nombre);
        ReportesEntity reportesEntity1= reportesReposity.save(reportesEntity);
        return reportesEntity1;
    }

    public ReportesEntity guardarReporte(ReportesEntity reportesEntity){
        ReportesEntity reportesEntity1=reportesReposity.save(reportesEntity);
        return reportesEntity1;
    }

    public ArrayList<ReportesEntity> saveAll(){
        ArrayList<Horario> horarios=obtenerHorarios();
        ArrayList<ReportesEntity> reportes = new ArrayList<>();
        for(int i=1;i<horarios.size()+1;i++){
            reportes.add(guardarporID(i));

        }
        return reportes;
    }


    public ArrayList<Horario> obtenerHorarios(){
        ArrayList<Horario> horarios=restTemplate.getForObject("http://localhost:8091/horarios/all",ArrayList.class);
        return horarios;


    }




}
