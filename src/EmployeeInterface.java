import java.util.List;
import java.util.Optional;

// Интерфейс для справочника сотрудников
interface EmployeeInterface {
    void addEmployee(Employee employee);

    List<Employee> findEmployeesByExperience(int experience);

    List<String> findPhoneNumbersByName(String name);

    Optional<Employee> findEmployeeById(int id);
}