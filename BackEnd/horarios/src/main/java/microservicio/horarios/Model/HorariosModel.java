package microservicio.horarios.Model;

import javax.persistence.*;

@Entity
@Table(name = "horario")
public class HorariosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private int id;
    private String fecha ;

    private String horaentrada ;

    private String horasalida ;

    private String horastrabajadas ;

    public int idempleado;

    public int getId() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String gethoraentrada() {
        return horaentrada;
    }

    public void sethoraentrada(String horaentrada) {
        this.horaentrada = horaentrada;
    }

    public String getHorasalida() {
        return horasalida;
    }

    public void setHorasalida(String horasalida) {
        this.horasalida = horasalida;
    }

    public String getHorastrabajadas() {
        return horastrabajadas;
    }

    public void setHorastrabajadas(String horastrabajadas) {
        this.horastrabajadas = horastrabajadas;
    }

    public int getidempleado(){
        return idempleado;
    }

    public void setidempleado(int idempleado) {
        this.idempleado = idempleado;
    }
}
