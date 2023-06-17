package lacaja.APIPortalEmpleado.Domain;

import lacaja.APIPortalEmpleado.Domain.Enums.CivilStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {
    private long id;
    private String dni;
    private String name;
    private String lastName;
    private LocalDate birthDate;
    private String securitySocialNumber;
    private LocalDate incorporationDate;
    private String seniority;
    private double salary;
    private String phone;
    private String address;
    private String email;
    private CivilStatus civilStatus;
}

/*
+ Id : long
+ Dni : String
+ Nombre : String
+ Apellido : String
+ FechaNac : Date
+ NumSegSocial : String
+ FechaIncorporacion : String
+ Antigüedad : Date
+ Salario : float
+ Telefono : String
+ Dirección : String
+ CorreoElectrónico : String
 */