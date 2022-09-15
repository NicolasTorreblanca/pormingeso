package microservicio.empleados.Entity;

import javax.persistence.*;

@Entity
@Table(name = "empleados")
public class EmpleadoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    public int id;

    public String nombre;
    private String categoria ;

    public int getId() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }
}
