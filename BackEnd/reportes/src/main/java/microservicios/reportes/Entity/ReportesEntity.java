package microservicios.reportes.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ReportesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    public int id;
    public String horaentrada ;
    public String horasalida ;
    public String horastrabajadas ;
    public int idempleado;
    public String nombre;

    public ReportesEntity(int idempleado,String horaentrada,String horasalida ,String horastrabajadas,String nombre) {
        this.horaentrada = horaentrada;
        this.horasalida = horasalida;
        this.idempleado = idempleado;
        this.nombre = nombre;
        this.horastrabajadas = horastrabajadas;
    }

    public int getIdempleado() {
        return idempleado;
    }

    public String getHoraentrada() {
        return horaentrada;
    }

    public String getHorasalida() {
        return horasalida;
    }

    public String getHorastrabajadas() {
        return horastrabajadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setHoraentrada(String horaentrada) {
        this.horaentrada = horaentrada;
    }

    public void setHorasalida(String horasalida) {
        this.horasalida = horasalida;
    }

    public void setHorastrabajadas(String horastrabajadas) {
        this.horastrabajadas = horastrabajadas;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
