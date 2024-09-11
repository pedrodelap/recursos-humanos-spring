package gm.rh.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table (name = "tbl_empleado")
public class Empleado {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idEmpleado;

    String nombre;
    String departamento;
    Double sueldo;

}
