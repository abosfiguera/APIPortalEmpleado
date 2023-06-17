package lacaja.APIPortalEmpleado;
import lacaja.APIPortalEmpleado.Domain.Employee;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

    @Test
    public void testEmployee() {
        Employee emp1 = Employee.builder().id(1).dni("13244554V").build();
        System.out.println("PRUEBA");
        System.out.println(emp1);
    }
}
