package microservicios.reportes.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Horario {

    private String fecha ;
    private String horaentrada ;
    private String horasalida ;
    private String horastrabajadas ;
    public int idempleado;

}
